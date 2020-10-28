/** Generated, do not edit ! */
package com.parrot.drone.sdkcore.arsdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.parrot.drone.sdkcore.arsdk.command.ArsdkCommand;
import com.parrot.drone.sdkcore.ulog.ULog;

import static com.parrot.drone.sdkcore.arsdk.Logging.TAG;

import android.util.SparseArray;

import java.util.function.Consumer;
import java.util.EnumSet;

/**
 * Dri feature command/event interface.
 */
public class ArsdkFeatureDri {

    /**
     * The DRI mode.
     */
    public enum Mode {

        /**
         * DRI mode is disabled.
         */
        DISABLED(0),

        /**
         * DRI mode is enabled.
         */
        ENABLED(1);

        /** Internal arsdk value. */
        public final int value;

        /**
         * Obtains an enum from its internal arsdk value.
         *
         * @param value arsdk enum internal value
         *
         * @returns the corresponding enum in case it exists, otherwise {@code null} 
         */
        @Nullable
        public static Mode fromValue(int value) {
            return MAP.get(value, null);
        }

        private Mode(int value) {
            this.value = value;
        }

        private static final SparseArray<Mode> MAP;

        static {
            MAP = new SparseArray<>();
            for (Mode e: values())
                MAP.put(e.value, e);
        }
    }

    /**
     * Supported capabilities.
     */
    public enum SupportedCapabilities {

        /**
         * Possibility to enable or disable the DRI Mode.
         */
        ON_OFF(0);

        /** Internal arsdk value. */
        public final int value;

        /**
         * Obtains an enum from its internal arsdk value.
         *
         * @param value arsdk enum internal value
         *
         * @returns the corresponding enum in case it exists, otherwise {@code null} 
         */
        @Nullable
        public static SupportedCapabilities fromValue(int value) {
            return MAP.get(value, null);
        }

        /**
         * Tells whether this enum value is armed in a given bitfield.
         *
         * @param bitfield bitfield to process
         *
         * @returns {@code true} if this enum is in specified bitfield, otherwise {@code false}
         */
        public boolean inBitField(int bitfield) {
            return (bitfield & (1 << value)) != 0;
        }

        /**
         * Applies a function to each armed enum value in a given bitfield.
         *
         * @param bitfield bitfield to process
         * @param func     function to call with each armed enum value
         */
        public static void each(int bitfield, @NonNull Consumer<SupportedCapabilities> func) {
            while (bitfield != 0) {
                int value = Integer.numberOfTrailingZeros(bitfield);
                if (value >= 1) {
                    ULog.e(TAG, "Unsupported SupportedCapabilities bitfield value " + value);
                    break;
                }
                func.accept(fromValue(value));
                bitfield ^= 1 << value;
            }
        }

        /**
         * Extracts armed enum value(s) from a given bitfield.
         *
         * @param bitfield bitfield to process
         *
         * @return a set containing enum value(s) armed in the specified bitfield
         */
        @NonNull
        public static EnumSet<SupportedCapabilities> fromBitfield(int bitfield) {
            EnumSet<SupportedCapabilities> enums = EnumSet.noneOf(SupportedCapabilities.class);
            each(bitfield, enums::add);
            return enums;
        }

        /**
         * Encodes a set of enum value(s) to a bitfield.
         *
         * @param enums enums to arm in the bitfield
         *
         * @return a bitfield where specified enum value(s) are armed
         */
        public static int toBitField(@NonNull SupportedCapabilities... enums) {
            int bitField = 0;
            for (SupportedCapabilities e : enums)
                 bitField |= 1 << e.value;
            return bitField;
        }

        private SupportedCapabilities(int value) {
            this.value = value;
        }

        private static final SparseArray<SupportedCapabilities> MAP;

        static {
            MAP = new SparseArray<>();
            for (SupportedCapabilities e: values())
                MAP.put(e.value, e);
        }
    }

    /**
     * drone ID type.
     */
    public enum IdType {

        /**
         * French 30 bytes format.
         */
        FR_30_OCTETS(0),

        /**
         * ANSI CTA 2063 format on 40 bytes.
         */
        ANSI_CTA_2063(1);

        /** Internal arsdk value. */
        public final int value;

        /**
         * Obtains an enum from its internal arsdk value.
         *
         * @param value arsdk enum internal value
         *
         * @returns the corresponding enum in case it exists, otherwise {@code null} 
         */
        @Nullable
        public static IdType fromValue(int value) {
            return MAP.get(value, null);
        }

        private IdType(int value) {
            this.value = value;
        }

        private static final SparseArray<IdType> MAP;

        static {
            MAP = new SparseArray<>();
            for (IdType e: values())
                MAP.put(e.value, e);
        }
    }


    /** Feature uid. */
    public static final int UID = 0xA400;

    /** Uid of capabilities event. */;
    public static final int CAPABILITIES_UID = 0x0001;

    /** Uid of dri_state event. */;
    public static final int DRI_STATE_UID = 0x0003;

    /** Uid of drone_id event. */;
    public static final int DRONE_ID_UID = 0x0004;

    /**
     * Decodes a command.
     *
     * @param command : command to decode
     * @param callback: callback receiving decoded events
     */
    public static void decode(@NonNull ArsdkCommand command, @NonNull Callback callback) {
        nativeDecode(command.getNativePtr(), callback);
    }

    /** Callback receiving decoded events. */
    public interface Callback {

        /**

         * 
         * @param supportedCapabilitiesBitField: Supported capabilities.
         */
        public default void onCapabilities(int supportedCapabilitiesBitField) {}

        /**

         * 
         * @param mode:
         */
        public default void onDriState(@Nullable Mode mode) {}

        /**

         * 
         * @param type:
         * @param value:
         */
        public default void onDroneId(@Nullable IdType type, String value) {}
    }

    private static void capabilities(Callback cb, int supportedCapabilitiesBitField) {
        try {
            cb.onCapabilities(supportedCapabilitiesBitField);
        } catch (ArsdkCommand.RejectedEventException e) {
            ULog.e(TAG, "Rejected event: dri.capabilities [supported_capabilities: " + supportedCapabilitiesBitField + "]", e);
        }
    }

    private static void driState(Callback cb, int mode) {
        ArsdkFeatureDri.Mode enumMode = ArsdkFeatureDri.Mode.fromValue(mode);
        if (enumMode == null) ULog.e(TAG, "Unsupported ArsdkFeatureDri.Mode value " + mode);
        try {
            cb.onDriState(enumMode);
        } catch (ArsdkCommand.RejectedEventException e) {
            ULog.e(TAG, "Rejected event: dri.dri_state [mode: " + mode + "]", e);
        }
    }

    private static void droneId(Callback cb, int type, String value) {
        ArsdkFeatureDri.IdType enumType = ArsdkFeatureDri.IdType.fromValue(type);
        if (enumType == null) ULog.e(TAG, "Unsupported ArsdkFeatureDri.IdType value " + type);
        try {
            cb.onDroneId(enumType, value);
        } catch (ArsdkCommand.RejectedEventException e) {
            ULog.e(TAG, "Rejected event: dri.drone_id [type: " + type + ", value: " + value + "]", e);
        }
    }
    
    /**
     * Set DRI mode.
     * 
     * @param mode: Mode asked by user
     */
    public static ArsdkCommand encodeDriMode(@NonNull Mode mode) {
        ArsdkCommand cmd = ArsdkCommand.Pool.DEFAULT.obtain();
        nativeEncodeDriMode(cmd.getNativePtr(), mode.value);
        return cmd;
    }

    private static native int nativeDecode(long nativeCmd, Callback callback);
    private static native void nativeClassInit();

    static { nativeClassInit(); }
    private static native int nativeEncodeDriMode(long nativeCmd, int mode);
}
