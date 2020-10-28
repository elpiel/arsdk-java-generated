/** Generated, do not edit ! */
package com.parrot.drone.sdkcore.arsdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.parrot.drone.sdkcore.arsdk.command.ArsdkCommand;
import com.parrot.drone.sdkcore.ulog.ULog;

import static com.parrot.drone.sdkcore.arsdk.Logging.TAG;

import android.util.SparseArray;

/**
 * Debug feature command/event interface.
 */
public class ArsdkFeatureDebug {

    /**
     * Setting type.
     */
    public enum SettingType {

        /**
         * Boolean Setting. (ex: 0, 1).
         */
        BOOL(0),

        /**
         * Decimal Setting. (ex: -3.5, 0, 2, 3.6, 6.5).
         */
        DECIMAL(1),

        /**
         * Single line text Setting.
         */
        TEXT(2);

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
        public static SettingType fromValue(int value) {
            return MAP.get(value, null);
        }

        private SettingType(int value) {
            this.value = value;
        }

        private static final SparseArray<SettingType> MAP;

        static {
            MAP = new SparseArray<>();
            for (SettingType e: values())
                MAP.put(e.value, e);
        }
    }

    /**
     * Setting mode.
     */
    public enum SettingMode {

        /**
         * Controller can only read setting.
         */
        READ_ONLY(0),

        /**
         * Controller can read and write setting.
         */
        READ_WRITE(1);

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
        public static SettingMode fromValue(int value) {
            return MAP.get(value, null);
        }

        private SettingMode(int value) {
            this.value = value;
        }

        private static final SparseArray<SettingMode> MAP;

        static {
            MAP = new SparseArray<>();
            for (SettingMode e: values())
                MAP.put(e.value, e);
        }
    }


    /** Feature uid. */
    public static final int UID = 0x8B00;

    /** Uid of settings_info event. */;
    public static final int SETTINGS_INFO_UID = 0x0002;

    /** Uid of settings_list event. */;
    public static final int SETTINGS_LIST_UID = 0x0003;

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
         * Sent by the drone as answer to get_settings_info Describe a debug setting and give the current value.
         * 
         * @param listFlagsBitField: List entry attribute Bitfield. 0x01: First: indicate it's the first element of the
         * list. 0x02: Last: indicate it's the last element of the list. 0x04: Empty: indicate the list is empty
         * (implies First/Last). All other arguments should be ignored.
         * @param id: Setting Id.
         * @param label: Setting displayed label (single line).
         * @param type: Setting type.
         * @param mode: Setting mode.
         * @param rangeMin: Setting range minimal value for decimal type.
         * @param rangeMax: Setting range max value for decimal type.
         * @param rangeStep: Setting step value for decimal type
         * @param value: Current Setting value (string encoded).
         */
        public default void onSettingsInfo(int listFlagsBitField, int id, String label, @Nullable SettingType type, @Nullable SettingMode mode, String rangeMin, String rangeMax, String rangeStep, String value) {}

        /**
         * Setting value changed. Cmd sent by drone when setting changed occurred.
         * 
         * @param id: Setting Id.
         * @param value: New setting value (string encoded).
         */
        public default void onSettingsList(int id, String value) {}
    }

    private static void settingsInfo(Callback cb, int listFlagsBitField, int id, String label, int type, int mode, String rangeMin, String rangeMax, String rangeStep, String value) {
        ArsdkFeatureDebug.SettingType enumType = ArsdkFeatureDebug.SettingType.fromValue(type);
        if (enumType == null) ULog.e(TAG, "Unsupported ArsdkFeatureDebug.SettingType value " + type);
        ArsdkFeatureDebug.SettingMode enumMode = ArsdkFeatureDebug.SettingMode.fromValue(mode);
        if (enumMode == null) ULog.e(TAG, "Unsupported ArsdkFeatureDebug.SettingMode value " + mode);
        try {
            cb.onSettingsInfo(listFlagsBitField, id, label, enumType, enumMode, rangeMin, rangeMax, rangeStep, value);
        } catch (ArsdkCommand.RejectedEventException e) {
            ULog.e(TAG, "Rejected event: debug.settings_info [list_flags: " + listFlagsBitField + ", id: " + id + ", label: " + label + ", type: " + type + ", mode: " + mode + ", range_min: " + rangeMin + ", range_max: " + rangeMax + ", range_step: " + rangeStep + ", value: " + value + "]", e);
        }
    }

    private static void settingsList(Callback cb, int id, String value) {
        try {
            cb.onSettingsList(id, value);
        } catch (ArsdkCommand.RejectedEventException e) {
            ULog.e(TAG, "Rejected event: debug.settings_list [id: " + id + ", value: " + value + "]", e);
        }
    }
    
    /**
     * Cmd sent by controller to get all settings info (generate "settings_info" events).
     */
    public static ArsdkCommand encodeGetAllSettings() {
        ArsdkCommand cmd = ArsdkCommand.Pool.DEFAULT.obtain();
        nativeEncodeGetAllSettings(cmd.getNativePtr());
        return cmd;
    }

    /**
     * Change setting value. Cmd sent by controller to change a writable setting.
     * 
     * @param id: Setting Id.
     * @param value: New setting value (string encoded).
     */
    public static ArsdkCommand encodeSetSetting(int id, String value) {
        ArsdkCommand cmd = ArsdkCommand.Pool.DEFAULT.obtain();
        nativeEncodeSetSetting(cmd.getNativePtr(), id, value);
        return cmd;
    }

    private static native int nativeDecode(long nativeCmd, Callback callback);
    private static native void nativeClassInit();

    static { nativeClassInit(); }
    private static native int nativeEncodeGetAllSettings(long nativeCmd);
    private static native int nativeEncodeSetSetting(long nativeCmd, int id, String value);
}
