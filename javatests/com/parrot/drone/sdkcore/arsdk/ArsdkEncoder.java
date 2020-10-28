/** Generated, do not edit ! */
package com.parrot.drone.sdkcore.arsdk;

import com.parrot.drone.sdkcore.arsdk.command.ArsdkCommand;
import java.util.List;

public class ArsdkEncoder {
    public static ArsdkCommand encodeCommonNetworkEventDisconnection(ArsdkFeatureCommon.NetworkeventDisconnectionCause cause) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)1).writeShort((short)0);
        enc.writeInt(cause == null ? -1 : cause.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateAllSettingsChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateResetChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateProductNameChanged(String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)2);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateProductVersionChanged(String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)3);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateProductSerialHighChanged(String high) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)4);
        enc.writeString(high);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateProductSerialLowChanged(String low) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)5);
        enc.writeString(low);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateCountryChanged(String code) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)6);
        enc.writeString(code);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateAutoCountryChanged(int automatic) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)7);
        enc.writeByte((byte)automatic);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonSettingsStateBoardIdChanged(String id) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)3).writeShort((short)8);
        enc.writeString(id);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateAllStatesChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateBatteryStateChanged(int percent) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)1);
        enc.writeByte((byte)percent);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateMassStorageStateListChanged(int massStorageId, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)2);
        enc.writeByte((byte)massStorageId);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateMassStorageInfoStateListChanged(int massStorageId, long size, long usedSize, int plugged, int full, int internal) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)3);
        enc.writeByte((byte)massStorageId);
        enc.writeInt((int)size);
        enc.writeInt((int)usedSize);
        enc.writeByte((byte)plugged);
        enc.writeByte((byte)full);
        enc.writeByte((byte)internal);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateCurrentDateChanged(String date) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)4);
        enc.writeString(date);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateCurrentTimeChanged(String time) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)5);
        enc.writeString(time);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateMassStorageInfoRemainingListChanged(long freeSpace, int recTime, long photoRemaining) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)6);
        enc.writeInt((int)freeSpace);
        enc.writeShort((short)recTime);
        enc.writeInt((int)photoRemaining);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateWifiSignalChanged(int rssi) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)7);
        enc.writeShort((short)rssi);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateSensorsStatesListChanged(ArsdkFeatureCommon.CommonstateSensorsstateslistchangedSensorname sensorname, int sensorstate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)8);
        enc.writeInt(sensorname == null ? -1 : sensorname.value);
        enc.writeByte((byte)sensorstate);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateProductModel(ArsdkFeatureCommon.CommonstateProductmodelModel model) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)9);
        enc.writeInt(model == null ? -1 : model.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateCountryListKnown(int listflags, String countrycodes) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)10);
        enc.writeByte((byte)listflags);
        enc.writeString(countrycodes);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateDeprecatedMassStorageContentChanged(int massStorageId, int nbphotos, int nbvideos, int nbpuds, int nbcrashlogs) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)11);
        enc.writeByte((byte)massStorageId);
        enc.writeShort((short)nbphotos);
        enc.writeShort((short)nbvideos);
        enc.writeShort((short)nbpuds);
        enc.writeShort((short)nbcrashlogs);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateMassStorageContent(int massStorageId, int nbphotos, int nbvideos, int nbpuds, int nbcrashlogs, int nbrawphotos) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)12);
        enc.writeByte((byte)massStorageId);
        enc.writeShort((short)nbphotos);
        enc.writeShort((short)nbvideos);
        enc.writeShort((short)nbpuds);
        enc.writeShort((short)nbcrashlogs);
        enc.writeShort((short)nbrawphotos);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateMassStorageContentForCurrentRun(int massStorageId, int nbphotos, int nbvideos, int nbrawphotos) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)13);
        enc.writeByte((byte)massStorageId);
        enc.writeShort((short)nbphotos);
        enc.writeShort((short)nbvideos);
        enc.writeShort((short)nbrawphotos);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateVideoRecordingTimestamp(long starttimestamp, long stoptimestamp) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)14);
        enc.writeLong(starttimestamp);
        enc.writeLong(stoptimestamp);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateCurrentDateTimeChanged(String datetime) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)15);
        enc.writeString(datetime);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateLinkSignalQuality(int value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)16);
        enc.writeByte((byte)value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCommonStateBootId(String bootid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)5).writeShort((short)17);
        enc.writeString(bootid);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonOverHeatStateOverHeatChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)7).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonOverHeatStateOverHeatRegulationChanged(int regulationtype) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)7).writeShort((short)1);
        enc.writeByte((byte)regulationtype);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonWifiSettingsStateOutdoorSettingsChanged(int outdoor) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)10).writeShort((short)0);
        enc.writeByte((byte)outdoor);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonMavlinkStateMavlinkFilePlayingStateChanged(ArsdkFeatureCommon.MavlinkstateMavlinkfileplayingstatechangedState state, String filepath, ArsdkFeatureCommon.MavlinkstateMavlinkfileplayingstatechangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)12).writeShort((short)0);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeString(filepath);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonMavlinkStateMavlinkPlayErrorStateChanged(ArsdkFeatureCommon.MavlinkstateMavlinkplayerrorstatechangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)12).writeShort((short)1);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonMavlinkStateMissionItemExecuted(long idx) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)12).writeShort((short)2);
        enc.writeInt((int)idx);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCalibrationStateMagnetoCalibrationStateChanged(int xaxiscalibration, int yaxiscalibration, int zaxiscalibration, int calibrationfailed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)14).writeShort((short)0);
        enc.writeByte((byte)xaxiscalibration);
        enc.writeByte((byte)yaxiscalibration);
        enc.writeByte((byte)zaxiscalibration);
        enc.writeByte((byte)calibrationfailed);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCalibrationStateMagnetoCalibrationRequiredState(int required) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)14).writeShort((short)1);
        enc.writeByte((byte)required);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCalibrationStateMagnetoCalibrationAxisToCalibrateChanged(ArsdkFeatureCommon.CalibrationstateMagnetocalibrationaxistocalibratechangedAxis axis) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)14).writeShort((short)2);
        enc.writeInt(axis == null ? -1 : axis.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCalibrationStateMagnetoCalibrationStartedChanged(int started) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)14).writeShort((short)3);
        enc.writeByte((byte)started);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCalibrationStatePitotCalibrationStateChanged(ArsdkFeatureCommon.CalibrationstatePitotcalibrationstatechangedState state, int lasterror) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)14).writeShort((short)4);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)lasterror);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonCameraSettingsStateCameraSettingsChanged(float fov, float panmax, float panmin, float tiltmax, float tiltmin) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)15).writeShort((short)0);
        enc.writeFloat(fov);
        enc.writeFloat(panmax);
        enc.writeFloat(panmin);
        enc.writeFloat(tiltmax);
        enc.writeFloat(tiltmin);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonFlightPlanStateAvailabilityStateChanged(int availabilitystate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)17).writeShort((short)0);
        enc.writeByte((byte)availabilitystate);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonFlightPlanStateComponentStateListChanged(ArsdkFeatureCommon.FlightplanstateComponentstatelistchangedComponent component, int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)17).writeShort((short)1);
        enc.writeInt(component == null ? -1 : component.value);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonFlightPlanStateLockStateChanged(int lockstate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)17).writeShort((short)2);
        enc.writeByte((byte)lockstate);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonARLibsVersionsStateControllerLibARCommandsVersion(String version) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)18).writeShort((short)0);
        enc.writeString(version);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonARLibsVersionsStateSkyControllerLibARCommandsVersion(String version) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)18).writeShort((short)1);
        enc.writeString(version);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonARLibsVersionsStateDeviceLibARCommandsVersion(String version) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)18).writeShort((short)2);
        enc.writeString(version);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonFlightPlanEventStartingErrorEvent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)19).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonFlightPlanEventSpeedBridleEvent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)19).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonAudioStateAudioStreamingRunning(int running) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)21).writeShort((short)0);
        enc.writeByte((byte)running);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonHeadlightsStateIntensityChanged(int left, int right) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)23).writeShort((short)0);
        enc.writeByte((byte)left);
        enc.writeByte((byte)right);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonAnimationsStateList(ArsdkFeatureCommon.AnimationsstateListAnim anim, ArsdkFeatureCommon.AnimationsstateListState state, ArsdkFeatureCommon.AnimationsstateListError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)25).writeShort((short)0);
        enc.writeInt(anim == null ? -1 : anim.value);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonAccessoryStateSupportedAccessoriesListChanged(ArsdkFeatureCommon.AccessorystateSupportedaccessorieslistchangedAccessory accessory) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)27).writeShort((short)0);
        enc.writeInt(accessory == null ? -1 : accessory.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonAccessoryStateAccessoryConfigChanged(ArsdkFeatureCommon.AccessorystateAccessoryconfigchangedNewaccessory newaccessory, ArsdkFeatureCommon.AccessorystateAccessoryconfigchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)27).writeShort((short)1);
        enc.writeInt(newaccessory == null ? -1 : newaccessory.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonAccessoryStateAccessoryConfigModificationEnabled(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)27).writeShort((short)2);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonChargerStateMaxChargeRateChanged(ArsdkFeatureCommon.ChargerstateMaxchargeratechangedRate rate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)29).writeShort((short)0);
        enc.writeInt(rate == null ? -1 : rate.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonChargerStateCurrentChargeStateChanged(ArsdkFeatureCommon.ChargerstateCurrentchargestatechangedStatus status, ArsdkFeatureCommon.ChargerstateCurrentchargestatechangedPhase phase) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)29).writeShort((short)1);
        enc.writeInt(status == null ? -1 : status.value);
        enc.writeInt(phase == null ? -1 : phase.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonChargerStateLastChargeRateChanged(ArsdkFeatureCommon.ChargerstateLastchargeratechangedRate rate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)29).writeShort((short)2);
        enc.writeInt(rate == null ? -1 : rate.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonChargerStateChargingInfo(ArsdkFeatureCommon.ChargerstateCharginginfoPhase phase, ArsdkFeatureCommon.ChargerstateCharginginfoRate rate, int intensity, int fullchargingtime) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)29).writeShort((short)3);
        enc.writeInt(phase == null ? -1 : phase.value);
        enc.writeInt(rate == null ? -1 : rate.value);
        enc.writeByte((byte)intensity);
        enc.writeByte((byte)fullchargingtime);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonRunStateRunIdChanged(String runid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)30).writeShort((short)0);
        enc.writeString(runid);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonFlightPlanSettingsStateReturnHomeOnDisconnectChanged(int state, int isreadonly) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)33).writeShort((short)0);
        enc.writeByte((byte)state);
        enc.writeByte((byte)isreadonly);
        return enc.encode();
    }
    public static ArsdkCommand encodeCommonUpdateStateUpdateStateChanged(String sourceversion, String targetversion, ArsdkFeatureCommon.UpdatestateUpdatestatechangedStatus status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)0).writeByte((byte)34).writeShort((short)0);
        enc.writeString(sourceversion);
        enc.writeString(targetversion);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordEventPictureEventChanged(ArsdkFeatureArdrone3.MediarecordeventPictureeventchangedEvent event, ArsdkFeatureArdrone3.MediarecordeventPictureeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)3).writeShort((short)0);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordEventVideoEventChanged(ArsdkFeatureArdrone3.MediarecordeventVideoeventchangedEvent event, ArsdkFeatureArdrone3.MediarecordeventVideoeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)3).writeShort((short)1);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateFlyingStateChanged(ArsdkFeatureArdrone3.PilotingstateFlyingstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateAlertStateChanged(ArsdkFeatureArdrone3.PilotingstateAlertstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)2);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateNavigateHomeStateChanged(ArsdkFeatureArdrone3.PilotingstateNavigatehomestatechangedState state, ArsdkFeatureArdrone3.PilotingstateNavigatehomestatechangedReason reason) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)3);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(reason == null ? -1 : reason.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStatePositionChanged(double latitude, double longitude, double altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)4);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateSpeedChanged(float speedx, float speedy, float speedz) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)5);
        enc.writeFloat(speedx);
        enc.writeFloat(speedy);
        enc.writeFloat(speedz);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateAttitudeChanged(float roll, float pitch, float yaw) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)6);
        enc.writeFloat(roll);
        enc.writeFloat(pitch);
        enc.writeFloat(yaw);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateAltitudeChanged(double altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)8);
        enc.writeDouble(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateGpsLocationChanged(double latitude, double longitude, double altitude, int latitudeAccuracy, int longitudeAccuracy, int altitudeAccuracy) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)9);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        enc.writeByte((byte)latitudeAccuracy);
        enc.writeByte((byte)longitudeAccuracy);
        enc.writeByte((byte)altitudeAccuracy);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateLandingStateChanged(ArsdkFeatureArdrone3.PilotingstateLandingstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)10);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateAirSpeedChanged(float airspeed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)11);
        enc.writeFloat(airspeed);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateMoveToChanged(double latitude, double longitude, double altitude, ArsdkFeatureArdrone3.PilotingstateMovetochangedOrientationMode orientationMode, float heading, ArsdkFeatureArdrone3.PilotingstateMovetochangedStatus status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)12);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        enc.writeInt(orientationMode == null ? -1 : orientationMode.value);
        enc.writeFloat(heading);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateMotionState(ArsdkFeatureArdrone3.PilotingstateMotionstateState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)13);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStatePilotedPOI(double latitude, double longitude, double altitude, ArsdkFeatureArdrone3.PilotingstatePilotedpoiStatus status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)14);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateReturnHomeBatteryCapacity(ArsdkFeatureArdrone3.PilotingstateReturnhomebatterycapacityStatus status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)15);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateMoveByChanged(float dxasked, float dyasked, float dzasked, float dpsiasked, float dx, float dy, float dz, float dpsi, ArsdkFeatureArdrone3.PilotingstateMovebychangedStatus status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)16);
        enc.writeFloat(dxasked);
        enc.writeFloat(dyasked);
        enc.writeFloat(dzasked);
        enc.writeFloat(dpsiasked);
        enc.writeFloat(dx);
        enc.writeFloat(dy);
        enc.writeFloat(dz);
        enc.writeFloat(dpsi);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateHoveringWarning(int noGpsTooDark, int noGpsTooHigh) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)17);
        enc.writeByte((byte)noGpsTooDark);
        enc.writeByte((byte)noGpsTooHigh);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateForcedLandingAutoTrigger(ArsdkFeatureArdrone3.PilotingstateForcedlandingautotriggerReason reason, long delay) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)18);
        enc.writeInt(reason == null ? -1 : reason.value);
        enc.writeInt((int)delay);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateWindStateChanged(ArsdkFeatureArdrone3.PilotingstateWindstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)19);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateVibrationLevelChanged(ArsdkFeatureArdrone3.PilotingstateVibrationlevelchangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)20);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStateAltitudeAboveGroundChanged(float altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)21);
        enc.writeFloat(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingStatePilotedPOIV2(double latitude, double longitude, double altitude, ArsdkFeatureArdrone3.PilotingstatePilotedpoiv2Mode mode, ArsdkFeatureArdrone3.PilotingstatePilotedpoiv2Status status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)4).writeShort((short)22);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateMaxAltitudeChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)0);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateMaxTiltChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)1);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateAbsolutControlChanged(int on) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)2);
        enc.writeByte((byte)on);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateMaxDistanceChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)3);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateNoFlyOverMaxDistanceChanged(int shouldnotflyover) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)4);
        enc.writeByte((byte)shouldnotflyover);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateBankedTurnChanged(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)10);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateMinAltitudeChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)11);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateCirclingDirectionChanged(ArsdkFeatureArdrone3.PilotingsettingsstateCirclingdirectionchangedValue value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)12);
        enc.writeInt(value == null ? -1 : value.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateCirclingRadiusChanged(int current, int min, int max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)13);
        enc.writeShort((short)current);
        enc.writeShort((short)min);
        enc.writeShort((short)max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateCirclingAltitudeChanged(int current, int min, int max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)14);
        enc.writeShort((short)current);
        enc.writeShort((short)min);
        enc.writeShort((short)max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStatePitchModeChanged(ArsdkFeatureArdrone3.PilotingsettingsstatePitchmodechangedValue value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)15);
        enc.writeInt(value == null ? -1 : value.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingSettingsStateMotionDetection(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)6).writeShort((short)16);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordStatePictureStateChanged(int state, int massStorageId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)8).writeShort((short)0);
        enc.writeByte((byte)state);
        enc.writeByte((byte)massStorageId);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordStateVideoStateChanged(ArsdkFeatureArdrone3.MediarecordstateVideostatechangedState state, int massStorageId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)8).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)massStorageId);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordStatePictureStateChangedV2(ArsdkFeatureArdrone3.MediarecordstatePicturestatechangedv2State state, ArsdkFeatureArdrone3.MediarecordstatePicturestatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)8).writeShort((short)2);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordStateVideoStateChangedV2(ArsdkFeatureArdrone3.MediarecordstateVideostatechangedv2State state, ArsdkFeatureArdrone3.MediarecordstateVideostatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)8).writeShort((short)3);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaRecordStateVideoResolutionState(ArsdkFeatureArdrone3.MediarecordstateVideoresolutionstateStreaming streaming, ArsdkFeatureArdrone3.MediarecordstateVideoresolutionstateRecording recording) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)8).writeShort((short)4);
        enc.writeInt(streaming == null ? -1 : streaming.value);
        enc.writeInt(recording == null ? -1 : recording.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkSettingsStateWifiSelectionChanged(ArsdkFeatureArdrone3.NetworksettingsstateWifiselectionchangedType type, ArsdkFeatureArdrone3.NetworksettingsstateWifiselectionchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)10).writeShort((short)0);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkSettingsStateWifiSecurityChanged(ArsdkFeatureArdrone3.NetworksettingsstateWifisecuritychangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)10).writeShort((short)1);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkSettingsStateWifiSecurity(ArsdkFeatureArdrone3.NetworksettingsstateWifisecurityType type, String key, ArsdkFeatureArdrone3.NetworksettingsstateWifisecurityKeytype keytype) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)10).writeShort((short)2);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeString(key);
        enc.writeInt(keytype == null ? -1 : keytype.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SpeedSettingsStateMaxVerticalSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)12).writeShort((short)0);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SpeedSettingsStateMaxRotationSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)12).writeShort((short)1);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SpeedSettingsStateHullProtectionChanged(int present) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)12).writeShort((short)2);
        enc.writeByte((byte)present);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SpeedSettingsStateOutdoorChanged(int outdoor) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)12).writeShort((short)3);
        enc.writeByte((byte)outdoor);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SpeedSettingsStateMaxPitchRollRotationSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)12).writeShort((short)4);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkStateWifiScanListChanged(String ssid, int rssi, ArsdkFeatureArdrone3.NetworkstateWifiscanlistchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)14).writeShort((short)0);
        enc.writeString(ssid);
        enc.writeShort((short)rssi);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkStateAllWifiScanChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)14).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkStateWifiAuthChannelListChanged(ArsdkFeatureArdrone3.NetworkstateWifiauthchannellistchangedBand band, int channel, int inOrOut) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)14).writeShort((short)2);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)inOrOut);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3NetworkStateAllWifiAuthChannelChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)14).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateProductMotorVersionListChanged(int motorNumber, String type, String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)0);
        enc.writeByte((byte)motorNumber);
        enc.writeString(type);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateProductGPSVersionChanged(String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)1);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateMotorErrorStateChanged(int motorids, ArsdkFeatureArdrone3.SettingsstateMotorerrorstatechangedMotorerror motorerror) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)2);
        enc.writeByte((byte)motorids);
        enc.writeInt(motorerror == null ? -1 : motorerror.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateMotorSoftwareVersionChanged(String version) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)3);
        enc.writeString(version);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateMotorFlightsStatusChanged(int nbflights, int lastflightduration, long totalflightduration) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)4);
        enc.writeShort((short)nbflights);
        enc.writeShort((short)lastflightduration);
        enc.writeInt((int)totalflightduration);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateMotorErrorLastErrorChanged(ArsdkFeatureArdrone3.SettingsstateMotorerrorlasterrorchangedMotorerror motorerror) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)5);
        enc.writeInt(motorerror == null ? -1 : motorerror.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateP7ID(String serialid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)6);
        enc.writeString(serialid);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SettingsStateCPUID(String id) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)16).writeShort((short)7);
        enc.writeString(id);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStatePictureFormatChanged(ArsdkFeatureArdrone3.PicturesettingsstatePictureformatchangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)0);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateAutoWhiteBalanceChanged(ArsdkFeatureArdrone3.PicturesettingsstateAutowhitebalancechangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)1);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateExpositionChanged(float value, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)2);
        enc.writeFloat(value);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateSaturationChanged(float value, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)3);
        enc.writeFloat(value);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateTimelapseChanged(int enabled, float interval, float mininterval, float maxinterval) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)4);
        enc.writeByte((byte)enabled);
        enc.writeFloat(interval);
        enc.writeFloat(mininterval);
        enc.writeFloat(maxinterval);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateVideoAutorecordChanged(int enabled, int massStorageId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)5);
        enc.writeByte((byte)enabled);
        enc.writeByte((byte)massStorageId);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateVideoStabilizationModeChanged(ArsdkFeatureArdrone3.PicturesettingsstateVideostabilizationmodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)6);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateVideoRecordingModeChanged(ArsdkFeatureArdrone3.PicturesettingsstateVideorecordingmodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)7);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateVideoFramerateChanged(ArsdkFeatureArdrone3.PicturesettingsstateVideoframeratechangedFramerate framerate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)8);
        enc.writeInt(framerate == null ? -1 : framerate.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PictureSettingsStateVideoResolutionsChanged(ArsdkFeatureArdrone3.PicturesettingsstateVideoresolutionschangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)20).writeShort((short)9);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaStreamingStateVideoEnableChanged(ArsdkFeatureArdrone3.MediastreamingstateVideoenablechangedEnabled enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)22).writeShort((short)0);
        enc.writeInt(enabled == null ? -1 : enabled.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3MediaStreamingStateVideoStreamModeChanged(ArsdkFeatureArdrone3.MediastreamingstateVideostreammodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)22).writeShort((short)1);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateHomeChanged(double latitude, double longitude, double altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)0);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateResetHomeChanged(double latitude, double longitude, double altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)1);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateGPSFixStateChanged(int fixed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)2);
        enc.writeByte((byte)fixed);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateGPSUpdateStateChanged(ArsdkFeatureArdrone3.GpssettingsstateGpsupdatestatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)3);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateHomeTypeChanged(ArsdkFeatureArdrone3.GpssettingsstateHometypechangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)4);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateReturnHomeDelayChanged(int delay) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)5);
        enc.writeShort((short)delay);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateGeofenceCenterChanged(double latitude, double longitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)6);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSSettingsStateReturnHomeMinAltitudeChanged(float value, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)24).writeShort((short)7);
        enc.writeFloat(value);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3CameraStateOrientation(int tilt, int pan) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)25).writeShort((short)0);
        enc.writeByte((byte)tilt);
        enc.writeByte((byte)pan);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3CameraStateDefaultCameraOrientation(int tilt, int pan) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)25).writeShort((short)1);
        enc.writeByte((byte)tilt);
        enc.writeByte((byte)pan);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3CameraStateOrientationV2(float tilt, float pan) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)25).writeShort((short)2);
        enc.writeFloat(tilt);
        enc.writeFloat(pan);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3CameraStateDefaultCameraOrientationV2(float tilt, float pan) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)25).writeShort((short)3);
        enc.writeFloat(tilt);
        enc.writeFloat(pan);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3CameraStateVelocityRange(float maxTilt, float maxPan) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)25).writeShort((short)4);
        enc.writeFloat(maxTilt);
        enc.writeFloat(maxPan);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3AntiflickeringStateElectricFrequencyChanged(ArsdkFeatureArdrone3.AntiflickeringstateElectricfrequencychangedFrequency frequency) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)30).writeShort((short)0);
        enc.writeInt(frequency == null ? -1 : frequency.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3AntiflickeringStateModeChanged(ArsdkFeatureArdrone3.AntiflickeringstateModechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)30).writeShort((short)1);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSStateNumberOfSatelliteChanged(int numberofsatellite) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)31).writeShort((short)0);
        enc.writeByte((byte)numberofsatellite);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSStateHomeTypeAvailabilityChanged(ArsdkFeatureArdrone3.GpsstateHometypeavailabilitychangedType type, int available) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)31).writeShort((short)1);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeByte((byte)available);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3GPSStateHomeTypeChosenChanged(ArsdkFeatureArdrone3.GpsstateHometypechosenchangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)31).writeShort((short)2);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PROStateFeatures(long features) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)32).writeShort((short)0);
        enc.writeLong(features);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3AccessoryStateConnectedAccessories(int id, ArsdkFeatureArdrone3.AccessorystateConnectedaccessoriesAccessoryType accessoryType, String uid, String swversion, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)33).writeShort((short)0);
        enc.writeByte((byte)id);
        enc.writeInt(accessoryType == null ? -1 : accessoryType.value);
        enc.writeString(uid);
        enc.writeString(swversion);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3AccessoryStateBattery(int id, int batterylevel, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)33).writeShort((short)1);
        enc.writeByte((byte)id);
        enc.writeByte((byte)batterylevel);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3PilotingEventMoveByEnd(float dx, float dy, float dz, float dpsi, ArsdkFeatureArdrone3.PilotingeventMovebyendError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)34).writeShort((short)0);
        enc.writeFloat(dx);
        enc.writeFloat(dy);
        enc.writeFloat(dz);
        enc.writeFloat(dpsi);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeArdrone3SoundStateAlertSound(ArsdkFeatureArdrone3.SoundstateAlertsoundState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)1).writeByte((byte)36).writeShort((short)0);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMediaRecordEventPictureEventChanged(ArsdkFeatureMinidrone.MediarecordeventPictureeventchangedEvent event, ArsdkFeatureMinidrone.MediarecordeventPictureeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)2).writeShort((short)0);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStateFlatTrimChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStateFlyingStateChanged(ArsdkFeatureMinidrone.PilotingstateFlyingstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStateAlertStateChanged(ArsdkFeatureMinidrone.PilotingstateAlertstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)2);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStateAutoTakeOffModeChanged(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)3);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStateFlyingModeChanged(ArsdkFeatureMinidrone.PilotingstateFlyingmodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)4);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStatePlaneGearBoxChanged(ArsdkFeatureMinidrone.PilotingstatePlanegearboxchangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)5);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingStatePilotingModeChanged(ArsdkFeatureMinidrone.PilotingstatePilotingmodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)3).writeShort((short)6);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSpeedSettingsStateMaxVerticalSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)5).writeShort((short)0);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSpeedSettingsStateMaxRotationSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)5).writeShort((short)1);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSpeedSettingsStateWheelsChanged(int present) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)5).writeShort((short)2);
        enc.writeByte((byte)present);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSpeedSettingsStateMaxHorizontalSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)5).writeShort((short)3);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSpeedSettingsStateMaxPlaneModeRotationSpeedChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)5).writeShort((short)4);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMediaRecordStatePictureStateChanged(int state, int massStorageId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)7).writeShort((short)0);
        enc.writeByte((byte)state);
        enc.writeByte((byte)massStorageId);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMediaRecordStatePictureStateChangedV2(ArsdkFeatureMinidrone.MediarecordstatePicturestatechangedv2State state, ArsdkFeatureMinidrone.MediarecordstatePicturestatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)7).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingSettingsStateMaxAltitudeChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)9).writeShort((short)0);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingSettingsStateMaxTiltChanged(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)9).writeShort((short)1);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingSettingsStateBankedTurnChanged(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)9).writeShort((short)2);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingSettingsStateMaxThrottleChanged(float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)9).writeShort((short)3);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidronePilotingSettingsStatePreferredPilotingModeChanged(ArsdkFeatureMinidrone.PilotingsettingsstatePreferredpilotingmodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)9).writeShort((short)4);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSettingsStateProductMotorsVersionChanged(int motor, String type, String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)11).writeShort((short)0);
        enc.writeByte((byte)motor);
        enc.writeString(type);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSettingsStateProductInertialVersionChanged(String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)11).writeShort((short)1);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneSettingsStateCutOutModeChanged(int enable) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)11).writeShort((short)2);
        enc.writeByte((byte)enable);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneFloodControlStateFloodControlChanged(int delay) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)12).writeShort((short)0);
        enc.writeShort((short)delay);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneUsbAccessoryStateLightState(int id, ArsdkFeatureMinidrone.UsbaccessorystateLightstateState state, int intensity, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)15).writeShort((short)0);
        enc.writeByte((byte)id);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)intensity);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneUsbAccessoryStateClawState(int id, ArsdkFeatureMinidrone.UsbaccessorystateClawstateState state, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)15).writeShort((short)1);
        enc.writeByte((byte)id);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneUsbAccessoryStateGunState(int id, ArsdkFeatureMinidrone.UsbaccessorystateGunstateState state, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)15).writeShort((short)2);
        enc.writeByte((byte)id);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneNavigationDataStateDronePosition(float posx, float posy, int posz, int psi, int ts) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)18).writeShort((short)0);
        enc.writeFloat(posx);
        enc.writeFloat(posy);
        enc.writeShort((short)posz);
        enc.writeShort((short)psi);
        enc.writeShort((short)ts);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneNavigationDataStateDroneSpeed(float speedX, float speedY, float speedZ, int ts) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)18).writeShort((short)1);
        enc.writeFloat(speedX);
        enc.writeFloat(speedY);
        enc.writeFloat(speedZ);
        enc.writeShort((short)ts);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneNavigationDataStateDroneAltitude(float altitude, int ts) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)18).writeShort((short)2);
        enc.writeFloat(altitude);
        enc.writeShort((short)ts);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneNavigationDataStateDroneQuaternion(float qW, float qX, float qY, float qZ, int ts) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)18).writeShort((short)4);
        enc.writeFloat(qW);
        enc.writeFloat(qX);
        enc.writeFloat(qY);
        enc.writeFloat(qZ);
        enc.writeShort((short)ts);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStatePowerModeChanged(ArsdkFeatureMinidrone.MinicamstatePowermodechangedPowerMode powerMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)0);
        enc.writeInt(powerMode == null ? -1 : powerMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStateProductSerialChanged(String serialNumber) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)1);
        enc.writeString(serialNumber);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStateStateChanged(ArsdkFeatureMinidrone.MinicamstateStatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)2);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStateVersionChanged(String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)3);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStatePictureChanged(ArsdkFeatureMinidrone.MinicamstatePicturechangedState state, ArsdkFeatureMinidrone.MinicamstatePicturechangedResult result) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)4);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(result == null ? -1 : result.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStateVideoStateChanged(ArsdkFeatureMinidrone.MinicamstateVideostatechangedState state, ArsdkFeatureMinidrone.MinicamstateVideostatechangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)5);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneMinicamStateMassStorageFormatChanged(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)19).writeShort((short)6);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneVideoSettingsStateAutorecordChanged(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)21).writeShort((short)0);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneVideoSettingsStateElectricFrequencyChanged(ArsdkFeatureMinidrone.VideosettingsstateElectricfrequencychangedFrequency frequency) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)21).writeShort((short)1);
        enc.writeInt(frequency == null ? -1 : frequency.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneVideoSettingsStateVideoResolutionChanged(ArsdkFeatureMinidrone.VideosettingsstateVideoresolutionchangedType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)21).writeShort((short)2);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneRemoteControllerStateConnectionChanged(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)25).writeShort((short)0);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneRemoteControllerStateRecordButtonPressed() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)25).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneRemoteControllerStateTakePictureButtonPressed() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)25).writeShort((short)2);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneRemoteControllerStateRawMode(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)25).writeShort((short)3);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneRemoteControllerStateRawCommands(int joy0x, int joy0y, int joy1x, int joy1y, int buttons) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)25).writeShort((short)4);
        enc.writeByte((byte)joy0x);
        enc.writeByte((byte)joy0y);
        enc.writeByte((byte)joy1x);
        enc.writeByte((byte)joy1y);
        enc.writeShort((short)buttons);
        return enc.encode();
    }
    public static ArsdkCommand encodeMinidroneRemoteControllerStateBatteryLevel(int level) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)2).writeByte((byte)25).writeShort((short)5);
        enc.writeByte((byte)level);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoPilotingStatePostureChanged(ArsdkFeatureJpsumo.PilotingstatePosturechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)1).writeShort((short)0);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoPilotingStateAlertStateChanged(ArsdkFeatureJpsumo.PilotingstateAlertstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)1).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoPilotingStateSpeedChanged(int speed, int realspeed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)1).writeShort((short)2);
        enc.writeByte((byte)speed);
        enc.writeShort((short)realspeed);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoAnimationsStateJumpLoadChanged(ArsdkFeatureJpsumo.AnimationsstateJumploadchangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)3).writeShort((short)0);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoAnimationsStateJumpTypeChanged(ArsdkFeatureJpsumo.AnimationsstateJumptypechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)3).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoAnimationsStateJumpMotorProblemChanged(ArsdkFeatureJpsumo.AnimationsstateJumpmotorproblemchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)3).writeShort((short)2);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoSettingsStateProductGPSVersionChanged(String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)5).writeShort((short)0);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaRecordStatePictureStateChanged(int state, int massStorageId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)7).writeShort((short)0);
        enc.writeByte((byte)state);
        enc.writeByte((byte)massStorageId);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaRecordStateVideoStateChanged(ArsdkFeatureJpsumo.MediarecordstateVideostatechangedState state, int massStorageId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)7).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)massStorageId);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaRecordStatePictureStateChangedV2(ArsdkFeatureJpsumo.MediarecordstatePicturestatechangedv2State state, ArsdkFeatureJpsumo.MediarecordstatePicturestatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)7).writeShort((short)2);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaRecordStateVideoStateChangedV2(ArsdkFeatureJpsumo.MediarecordstateVideostatechangedv2State state, ArsdkFeatureJpsumo.MediarecordstateVideostatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)7).writeShort((short)3);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoNetworkSettingsStateWifiSelectionChanged(ArsdkFeatureJpsumo.NetworksettingsstateWifiselectionchangedType type, ArsdkFeatureJpsumo.NetworksettingsstateWifiselectionchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)9).writeShort((short)0);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoNetworkStateWifiScanListChanged(String ssid, int rssi, ArsdkFeatureJpsumo.NetworkstateWifiscanlistchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)11).writeShort((short)0);
        enc.writeString(ssid);
        enc.writeShort((short)rssi);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoNetworkStateAllWifiScanChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)11).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoNetworkStateWifiAuthChannelListChanged(ArsdkFeatureJpsumo.NetworkstateWifiauthchannellistchangedBand band, int channel, int inOrOut) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)11).writeShort((short)2);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)inOrOut);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoNetworkStateAllWifiAuthChannelChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)11).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoNetworkStateLinkQualityChanged(int quality) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)11).writeShort((short)4);
        enc.writeByte((byte)quality);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoAudioSettingsStateMasterVolumeChanged(int volume) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)13).writeShort((short)0);
        enc.writeByte((byte)volume);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoAudioSettingsStateThemeChanged(ArsdkFeatureJpsumo.AudiosettingsstateThemechangedTheme theme) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)13).writeShort((short)1);
        enc.writeInt(theme == null ? -1 : theme.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoRoadPlanStateScriptMetadataListChanged(String uuid, int version, String product, String name, long lastmodified) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)15).writeShort((short)0);
        enc.writeString(uuid);
        enc.writeByte((byte)version);
        enc.writeString(product);
        enc.writeString(name);
        enc.writeLong(lastmodified);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoRoadPlanStateAllScriptsMetadataChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)15).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoRoadPlanStateScriptUploadChanged(ArsdkFeatureJpsumo.RoadplanstateScriptuploadchangedResultcode resultcode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)15).writeShort((short)2);
        enc.writeInt(resultcode == null ? -1 : resultcode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoRoadPlanStateScriptDeleteChanged(ArsdkFeatureJpsumo.RoadplanstateScriptdeletechangedResultcode resultcode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)15).writeShort((short)3);
        enc.writeInt(resultcode == null ? -1 : resultcode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoRoadPlanStatePlayScriptChanged(ArsdkFeatureJpsumo.RoadplanstatePlayscriptchangedResultcode resultcode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)15).writeShort((short)4);
        enc.writeInt(resultcode == null ? -1 : resultcode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoSpeedSettingsStateOutdoorChanged(int outdoor) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)17).writeShort((short)0);
        enc.writeByte((byte)outdoor);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaStreamingStateVideoEnableChanged(ArsdkFeatureJpsumo.MediastreamingstateVideoenablechangedEnabled enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)19).writeShort((short)0);
        enc.writeInt(enabled == null ? -1 : enabled.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaRecordEventPictureEventChanged(ArsdkFeatureJpsumo.MediarecordeventPictureeventchangedEvent event, ArsdkFeatureJpsumo.MediarecordeventPictureeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)20).writeShort((short)0);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoMediaRecordEventVideoEventChanged(ArsdkFeatureJpsumo.MediarecordeventVideoeventchangedEvent event, ArsdkFeatureJpsumo.MediarecordeventVideoeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)20).writeShort((short)1);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeJpsumoVideoSettingsStateAutorecordChanged(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)3).writeByte((byte)22).writeShort((short)0);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateWifiList(String bssid, String ssid, int secured, int saved, int rssi, int frequency) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)0);
        enc.writeString(bssid);
        enc.writeString(ssid);
        enc.writeByte((byte)secured);
        enc.writeByte((byte)saved);
        enc.writeInt((int)rssi);
        enc.writeInt((int)frequency);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateConnexionChanged(String ssid, ArsdkFeatureSkyctrl.WifistateConnexionchangedStatus status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)1);
        enc.writeString(ssid);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateWifiAuthChannelListChanged(ArsdkFeatureSkyctrl.WifistateWifiauthchannellistchangedBand band, int channel, int inOrOut) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)2);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)inOrOut);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateAllWifiAuthChannelChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateWifiSignalChanged(int level) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)4);
        enc.writeByte((byte)level);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateWifiAuthChannelListChangedV2(ArsdkFeatureSkyctrl.WifistateWifiauthchannellistchangedv2Band band, int channel, int inOrOut, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)5);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)inOrOut);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateWifiCountryChanged(String code) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)6);
        enc.writeString(code);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlWifiStateWifiEnvironmentChanged(ArsdkFeatureSkyctrl.WifistateWifienvironmentchangedEnvironment environment) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)0).writeShort((short)7);
        enc.writeInt(environment == null ? -1 : environment.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlDeviceStateDeviceList(String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)3).writeShort((short)0);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlDeviceStateConnexionChanged(ArsdkFeatureSkyctrl.DevicestateConnexionchangedStatus status, String devicename, int deviceproductid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)3).writeShort((short)1);
        enc.writeInt(status == null ? -1 : status.value);
        enc.writeString(devicename);
        enc.writeShort((short)deviceproductid);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSettingsStateAllSettingsChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)5).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSettingsStateResetChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)5).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSettingsStateProductSerialChanged(String serialnumber) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)5).writeShort((short)2);
        enc.writeString(serialnumber);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSettingsStateProductVariantChanged(ArsdkFeatureSkyctrl.SettingsstateProductvariantchangedVariant variant) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)5).writeShort((short)3);
        enc.writeInt(variant == null ? -1 : variant.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSettingsStateProductVersionChanged(String software, String hardware) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)5).writeShort((short)4);
        enc.writeString(software);
        enc.writeString(hardware);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSettingsStateCPUID(String id) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)5).writeShort((short)5);
        enc.writeString(id);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCommonStateAllStatesChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)7).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCommonStateCurrentDateTimeChanged(String datetime) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)7).writeShort((short)1);
        enc.writeString(datetime);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSkyControllerStateBatteryChanged(int percent) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)8).writeShort((short)0);
        enc.writeByte((byte)percent);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSkyControllerStateGpsFixChanged(int fixed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)8).writeShort((short)1);
        enc.writeByte((byte)fixed);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSkyControllerStateGpsPositionChanged(double latitude, double longitude, double altitude, float heading) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)8).writeShort((short)2);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeDouble(altitude);
        enc.writeFloat(heading);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSkyControllerStateBatteryState(ArsdkFeatureSkyctrl.SkycontrollerstateBatterystateState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)8).writeShort((short)3);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlSkyControllerStateAttitudeChanged(float q0, float q1, float q2, float q3) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)8).writeShort((short)4);
        enc.writeFloat(q0);
        enc.writeFloat(q1);
        enc.writeFloat(q2);
        enc.writeFloat(q3);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAccessPointSettingsStateAccessPointSSIDChanged(String ssid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)10).writeShort((short)0);
        enc.writeString(ssid);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAccessPointSettingsStateAccessPointChannelChanged(int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)10).writeShort((short)1);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAccessPointSettingsStateWifiSelectionChanged(ArsdkFeatureSkyctrl.AccesspointsettingsstateWifiselectionchangedType type, ArsdkFeatureSkyctrl.AccesspointsettingsstateWifiselectionchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)10).writeShort((short)2);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAccessPointSettingsStateWifiSecurityChanged(ArsdkFeatureSkyctrl.AccesspointsettingsstateWifisecuritychangedSecurityType securityType, String key) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)10).writeShort((short)3);
        enc.writeInt(securityType == null ? -1 : securityType.value);
        enc.writeString(key);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlButtonMappingsStateCurrentButtonMappings(int keyId, String mappingUid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)13).writeShort((short)0);
        enc.writeInt((int)keyId);
        enc.writeString(mappingUid);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlButtonMappingsStateAllCurrentButtonMappingsSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)13).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlButtonMappingsStateAvailableButtonMappings(String mappingUid, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)13).writeShort((short)2);
        enc.writeString(mappingUid);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlButtonMappingsStateAllAvailableButtonsMappingsSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)13).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisMappingsStateCurrentAxisMappings(int axisId, String mappingUid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)15).writeShort((short)0);
        enc.writeInt((int)axisId);
        enc.writeString(mappingUid);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisMappingsStateAllCurrentAxisMappingsSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)15).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisMappingsStateAvailableAxisMappings(String mappingUid, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)15).writeShort((short)2);
        enc.writeString(mappingUid);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisMappingsStateAllAvailableAxisMappingsSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)15).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisFiltersStateCurrentAxisFilters(int axisId, String filterUidOrBuilder) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)17).writeShort((short)0);
        enc.writeInt((int)axisId);
        enc.writeString(filterUidOrBuilder);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisFiltersStateAllCurrentFiltersSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)17).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisFiltersStatePresetAxisFilters(String filterUid, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)17).writeShort((short)2);
        enc.writeString(filterUid);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlAxisFiltersStateAllPresetFiltersSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)17).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlGamepadInfosStateGamepadControl(ArsdkFeatureSkyctrl.GamepadinfosstateGamepadcontrolType type, int id, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)19).writeShort((short)0);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt((int)id);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlGamepadInfosStateAllGamepadControlsSent() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)19).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCoPilotingStatePilotingSource(ArsdkFeatureSkyctrl.CopilotingstatePilotingsourceSource source) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)21).writeShort((short)0);
        enc.writeInt(source == null ? -1 : source.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCalibrationStateMagnetoCalibrationState(ArsdkFeatureSkyctrl.CalibrationstateMagnetocalibrationstateStatus status, int xQuality, int yQuality, int zQuality) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)23).writeShort((short)0);
        enc.writeInt(status == null ? -1 : status.value);
        enc.writeByte((byte)xQuality);
        enc.writeByte((byte)yQuality);
        enc.writeByte((byte)zQuality);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCalibrationStateMagnetoCalibrationQualityUpdatesState(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)23).writeShort((short)1);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCalibrationStateMagnetoCalibrationStateV2(ArsdkFeatureSkyctrl.CalibrationstateMagnetocalibrationstatev2State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)23).writeShort((short)2);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlButtonEventsSettings() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)24).writeShort((short)0);
        return enc.encode();
    }
    public static ArsdkCommand encodeSkyctrlCommonEventStateShutdown(ArsdkFeatureSkyctrl.CommoneventstateShutdownReason reason) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)4).writeByte((byte)26).writeShort((short)0);
        enc.writeInt(reason == null ? -1 : reason.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupPilotingStateAlertStateChanged(ArsdkFeaturePowerup.PilotingstateAlertstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)1).writeShort((short)0);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupPilotingStateFlyingStateChanged(ArsdkFeaturePowerup.PilotingstateFlyingstatechangedState state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)1).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupPilotingStateMotorModeChanged(ArsdkFeaturePowerup.PilotingstateMotormodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)1).writeShort((short)2);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupPilotingStateAttitudeChanged(float roll, float pitch, float yaw) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)1).writeShort((short)3);
        enc.writeFloat(roll);
        enc.writeFloat(pitch);
        enc.writeFloat(yaw);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupPilotingStateAltitudeChanged(float altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)1).writeShort((short)4);
        enc.writeFloat(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupPilotingSettingsStateSettingChanged(ArsdkFeaturePowerup.PilotingsettingsstateSettingchangedSetting setting, float current, float min, float max, int listFlags) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)3).writeShort((short)0);
        enc.writeInt(setting == null ? -1 : setting.value);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        enc.writeByte((byte)listFlags);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupMediaRecordStatePictureStateChangedV2(ArsdkFeaturePowerup.MediarecordstatePicturestatechangedv2State state, ArsdkFeaturePowerup.MediarecordstatePicturestatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)5).writeShort((short)0);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupMediaRecordStateVideoStateChangedV2(ArsdkFeaturePowerup.MediarecordstateVideostatechangedv2State state, ArsdkFeaturePowerup.MediarecordstateVideostatechangedv2Error error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)5).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupMediaRecordEventPictureEventChanged(ArsdkFeaturePowerup.MediarecordeventPictureeventchangedEvent event, ArsdkFeaturePowerup.MediarecordeventPictureeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)6).writeShort((short)0);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupMediaRecordEventVideoEventChanged(ArsdkFeaturePowerup.MediarecordeventVideoeventchangedEvent event, ArsdkFeaturePowerup.MediarecordeventVideoeventchangedError error) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)6).writeShort((short)1);
        enc.writeInt(event == null ? -1 : event.value);
        enc.writeInt(error == null ? -1 : error.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupNetworkSettingsStateWifiSelectionChanged(ArsdkFeaturePowerup.NetworksettingsstateWifiselectionchangedType type, ArsdkFeaturePowerup.NetworksettingsstateWifiselectionchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)8).writeShort((short)0);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupNetworkStateWifiScanListChanged(String ssid, int rssi, ArsdkFeaturePowerup.NetworkstateWifiscanlistchangedBand band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)10).writeShort((short)0);
        enc.writeString(ssid);
        enc.writeShort((short)rssi);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupNetworkStateAllWifiScanChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)10).writeShort((short)1);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupNetworkStateWifiAuthChannelListChanged(ArsdkFeaturePowerup.NetworkstateWifiauthchannellistchangedBand band, int channel, int inOrOut) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)10).writeShort((short)2);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)inOrOut);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupNetworkStateAllWifiAuthChannelChanged() {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)10).writeShort((short)3);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupNetworkStateLinkQualityChanged(int quality) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)10).writeShort((short)4);
        enc.writeByte((byte)quality);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupMediaStreamingStateVideoEnableChanged(ArsdkFeaturePowerup.MediastreamingstateVideoenablechangedEnabled enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)12).writeShort((short)0);
        enc.writeInt(enabled == null ? -1 : enabled.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupVideoSettingsStateAutorecordChanged(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)14).writeShort((short)0);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupVideoSettingsStateVideoModeChanged(ArsdkFeaturePowerup.VideosettingsstateVideomodechangedMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)14).writeShort((short)1);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePowerupSoundsStateBuzzChanged(int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)8).writeByte((byte)16).writeShort((short)0);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeState(ArsdkFeatureFollowMe.Mode mode, ArsdkFeatureFollowMe.Behavior behavior, ArsdkFeatureFollowMe.Animation animation, int animationAvailableBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)3);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(behavior == null ? -1 : behavior.value);
        enc.writeInt(animation == null ? -1 : animation.value);
        enc.writeShort((short)animationAvailableBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeModeInfo(ArsdkFeatureFollowMe.Mode mode, int missingRequirementsBitField, int improvementsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)4);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeShort((short)missingRequirementsBitField);
        enc.writeShort((short)improvementsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeGeographicConfig(int useDefaultBitField, float distance, float elevation, float azimuth) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)7);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(distance);
        enc.writeFloat(elevation);
        enc.writeFloat(azimuth);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeRelativeConfig(int useDefaultBitField, float distance, float elevation, float azimuth) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)9);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(distance);
        enc.writeFloat(elevation);
        enc.writeFloat(azimuth);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeTargetTrajectory(double latitude, double longitude, float altitude, float northSpeed, float eastSpeed, float downSpeed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)10);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeFloat(altitude);
        enc.writeFloat(northSpeed);
        enc.writeFloat(eastSpeed);
        enc.writeFloat(downSpeed);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeHelicoidAnimConfig(int useDefaultBitField, float speed, float revolutionNb, float verticalDistance) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)13);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(speed);
        enc.writeFloat(revolutionNb);
        enc.writeFloat(verticalDistance);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeSwingAnimConfig(int useDefaultBitField, float speed, float verticalDistance) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)15);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeBoomerangAnimConfig(int useDefaultBitField, float speed, float distance) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)17);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(speed);
        enc.writeFloat(distance);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeCandleAnimConfig(int useDefaultBitField, float speed, float verticalDistance) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)19);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeDollySlideAnimConfig(int useDefaultBitField, float speed, float angle, float horizontalDistance) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)21);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(speed);
        enc.writeFloat(angle);
        enc.writeFloat(horizontalDistance);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeTargetFramingPositionChanged(int horizontal, int vertical) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)23);
        enc.writeByte((byte)horizontal);
        enc.writeByte((byte)vertical);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeTargetImageDetectionState(ArsdkFeatureFollowMe.ImageDetectionStatus state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)25);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeTargetIsController(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)27);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeFollowMeLeashConfig(int useDefaultBitField, float distance, float elevation, float azimuth) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)134).writeByte((byte)0).writeShort((short)29);
        enc.writeByte((byte)useDefaultBitField);
        enc.writeFloat(distance);
        enc.writeFloat(elevation);
        enc.writeFloat(azimuth);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiScannedItem(String ssid, int rssi, ArsdkFeatureWifi.Band band, int channel, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)2);
        enc.writeString(ssid);
        enc.writeShort((short)rssi);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiAuthorizedChannel(ArsdkFeatureWifi.Band band, int channel, int environmentBitField, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)4);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        enc.writeByte((byte)environmentBitField);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiApChannelChanged(ArsdkFeatureWifi.SelectionType type, ArsdkFeatureWifi.Band band, int channel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)6);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt(band == null ? -1 : band.value);
        enc.writeByte((byte)channel);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiSecurityChanged(ArsdkFeatureWifi.SecurityType type, String key, ArsdkFeatureWifi.SecurityKeyType keyType) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)8);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeString(key);
        enc.writeInt(keyType == null ? -1 : keyType.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiCountryChanged(ArsdkFeatureWifi.CountrySelection selectionMode, String code) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)10);
        enc.writeInt(selectionMode == null ? -1 : selectionMode.value);
        enc.writeString(code);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiEnvironmentChanged(ArsdkFeatureWifi.Environment environment) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)12);
        enc.writeInt(environment == null ? -1 : environment.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiRssiChanged(int rssi) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)13);
        enc.writeShort((short)rssi);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiSupportedCountries(String countries) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)14);
        enc.writeString(countries);
        return enc.encode();
    }
    public static ArsdkCommand encodeWifiSupportedSecurityTypes(int typesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)135).writeByte((byte)0).writeShort((short)15);
        enc.writeByte((byte)typesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeRcReceiverState(ArsdkFeatureRc.ReceiverState state, String protocol, int enabled) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)136).writeByte((byte)0).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeString(protocol);
        enc.writeByte((byte)enabled);
        return enc.encode();
    }
    public static ArsdkCommand encodeRcChannelsMonitorState(int state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)136).writeByte((byte)0).writeShort((short)3);
        enc.writeByte((byte)state);
        return enc.encode();
    }
    public static ArsdkCommand encodeRcChannelValue(int id, ArsdkFeatureRc.ChannelAction action, int value, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)136).writeByte((byte)0).writeShort((short)4);
        enc.writeByte((byte)id);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeShort((short)value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeRcCalibrationState(ArsdkFeatureRc.CalibrationType calibrationType, ArsdkFeatureRc.ChannelAction channelAction, int requiredBitField, int calibratedBitField, int neutralCalibrated) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)136).writeByte((byte)0).writeShort((short)5);
        enc.writeInt(calibrationType == null ? -1 : calibrationType.value);
        enc.writeInt(channelAction == null ? -1 : channelAction.value);
        enc.writeInt((int)requiredBitField);
        enc.writeInt((int)calibratedBitField);
        enc.writeByte((byte)neutralCalibrated);
        return enc.encode();
    }
    public static ArsdkCommand encodeRcChannelActionItem(ArsdkFeatureRc.ChannelAction action, int supportedTypeBitField, ArsdkFeatureRc.ChannelType calibratedType, int inverted) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)136).writeByte((byte)0).writeShort((short)12);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeInt((int)supportedTypeBitField);
        enc.writeInt(calibratedType == null ? -1 : calibratedType.value);
        enc.writeByte((byte)inverted);
        return enc.encode();
    }
    public static ArsdkCommand encodeDroneManagerDroneListItem(String serial, int model, String name, int connectionOrder, int active, int visible, ArsdkFeatureDroneManager.Security security, int hasSavedKey, int rssi, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)137).writeByte((byte)0).writeShort((short)2);
        enc.writeString(serial);
        enc.writeShort((short)model);
        enc.writeString(name);
        enc.writeByte((byte)connectionOrder);
        enc.writeByte((byte)active);
        enc.writeByte((byte)visible);
        enc.writeInt(security == null ? -1 : security.value);
        enc.writeByte((byte)hasSavedKey);
        enc.writeByte((byte)rssi);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeDroneManagerConnectionState(ArsdkFeatureDroneManager.ConnectionState state, String serial, int model, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)137).writeByte((byte)0).writeShort((short)5);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeString(serial);
        enc.writeShort((short)model);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeDroneManagerAuthenticationFailed(String serial, int model, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)137).writeByte((byte)0).writeShort((short)6);
        enc.writeString(serial);
        enc.writeShort((short)model);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeDroneManagerConnectionRefused(String serial, int model, String name) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)137).writeByte((byte)0).writeShort((short)7);
        enc.writeString(serial);
        enc.writeShort((short)model);
        enc.writeString(name);
        return enc.encode();
    }
    public static ArsdkCommand encodeDroneManagerKnownDroneItem(String serial, int model, String name, ArsdkFeatureDroneManager.Security security, int hasSavedKey, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)137).writeByte((byte)0).writeShort((short)8);
        enc.writeString(serial);
        enc.writeShort((short)model);
        enc.writeString(name);
        enc.writeInt(security == null ? -1 : security.value);
        enc.writeByte((byte)hasSavedKey);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperGrabState(long buttons, long axes, long buttonsState) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)2);
        enc.writeInt((int)buttons);
        enc.writeInt((int)axes);
        enc.writeInt((int)buttonsState);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperGrabButtonEvent(long button, ArsdkFeatureMapper.ButtonEvent event) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)3);
        enc.writeInt((int)button);
        enc.writeInt(event == null ? -1 : event.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperGrabAxisEvent(long axis, int value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)4);
        enc.writeInt((int)axis);
        enc.writeByte((byte)value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperButtonMappingItem(long uid, int product, ArsdkFeatureMapper.ButtonAction action, long buttons, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)7);
        enc.writeInt((int)uid);
        enc.writeShort((short)product);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeInt((int)buttons);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperAxisMappingItem(long uid, int product, ArsdkFeatureMapper.AxisAction action, int axis, long buttons, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)8);
        enc.writeInt((int)uid);
        enc.writeShort((short)product);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeInt((int)axis);
        enc.writeInt((int)buttons);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperApplicationAxisEvent(ArsdkFeatureMapper.AxisAction action, int value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)9);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeByte((byte)value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperApplicationButtonEvent(ArsdkFeatureMapper.ButtonAction action) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)10);
        enc.writeInt(action == null ? -1 : action.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperExpoMapItem(long uid, int product, int axis, ArsdkFeatureMapper.ExpoType expo, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)13);
        enc.writeInt((int)uid);
        enc.writeShort((short)product);
        enc.writeInt((int)axis);
        enc.writeInt(expo == null ? -1 : expo.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperInvertedMapItem(long uid, int product, int axis, int inverted, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)15);
        enc.writeInt((int)uid);
        enc.writeShort((short)product);
        enc.writeInt((int)axis);
        enc.writeByte((byte)inverted);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperActiveProduct(int product) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)16);
        enc.writeShort((short)product);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperVolatileMappingState(int active) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)138).writeByte((byte)0).writeShort((short)19);
        enc.writeByte((byte)active);
        return enc.encode();
    }
    public static ArsdkCommand encodeDebugSettingsInfo(int listFlagsBitField, int id, String label, ArsdkFeatureDebug.SettingType type, ArsdkFeatureDebug.SettingMode mode, String rangeMin, String rangeMax, String rangeStep, String value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)139).writeByte((byte)0).writeShort((short)2);
        enc.writeByte((byte)listFlagsBitField);
        enc.writeShort((short)id);
        enc.writeString(label);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeString(rangeMin);
        enc.writeString(rangeMax);
        enc.writeString(rangeStep);
        enc.writeString(value);
        return enc.encode();
    }
    public static ArsdkCommand encodeDebugSettingsList(int id, String value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)139).writeByte((byte)0).writeShort((short)3);
        enc.writeShort((short)id);
        enc.writeString(value);
        return enc.encode();
    }
    public static ArsdkCommand encodeControllerInfoValidityFromDrone(int isValid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)140).writeByte((byte)0).writeShort((short)3);
        enc.writeByte((byte)isValid);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperMiniButtonMappingItem(int uid, int modesBitField, ArsdkFeatureMapperMini.ButtonAction action, long buttons, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)141).writeByte((byte)0).writeShort((short)3);
        enc.writeShort((short)uid);
        enc.writeByte((byte)modesBitField);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeInt((int)buttons);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeMapperMiniAxisMappingItem(int uid, int modesBitField, ArsdkFeatureMapperMini.AxisAction action, int axis, long buttons, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)141).writeByte((byte)0).writeShort((short)4);
        enc.writeShort((short)uid);
        enc.writeByte((byte)modesBitField);
        enc.writeInt(action == null ? -1 : action.value);
        enc.writeByte((byte)axis);
        enc.writeInt((int)buttons);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCamCameraState(int camId, ArsdkFeatureThermalCam.State state, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)142).writeByte((byte)0).writeShort((short)3);
        enc.writeByte((byte)camId);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCamSensitivity(int camId, ArsdkFeatureThermalCam.Range currentRange, int availableRangesBitField, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)142).writeByte((byte)0).writeShort((short)5);
        enc.writeByte((byte)camId);
        enc.writeInt(currentRange == null ? -1 : currentRange.value);
        enc.writeByte((byte)availableRangesBitField);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCamCalibrationInfos(int camId, float roll, float pitch, float yaw, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)142).writeByte((byte)0).writeShort((short)6);
        enc.writeByte((byte)camId);
        enc.writeFloat(roll);
        enc.writeFloat(pitch);
        enc.writeFloat(yaw);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCamChargingStatus(int camId, ArsdkFeatureThermalCam.ChargingState state, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)142).writeByte((byte)0).writeShort((short)7);
        enc.writeByte((byte)camId);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCamFlatFieldCalibrationStatus(int camId, ArsdkFeatureThermalCam.FlatFieldCalibrationState state, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)142).writeByte((byte)0).writeShort((short)9);
        enc.writeByte((byte)camId);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCamFlatFieldCalibrationMode(int camId, ArsdkFeatureThermalCam.FlatFieldCalibrationMode mode, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)142).writeByte((byte)0).writeShort((short)11);
        enc.writeByte((byte)camId);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraCameraCapabilities(int camId, ArsdkFeatureCamera.Model model, int exposureModesBitField, ArsdkFeatureCamera.Supported exposureLockSupported, ArsdkFeatureCamera.Supported exposureRoiLockSupported, long evCompensationsBitField, int whiteBalanceModesBitField, long customWhiteBalanceTemperaturesBitField, ArsdkFeatureCamera.Supported whiteBalanceLockSupported, int stylesBitField, int cameraModesBitField, int hyperlapseValuesBitField, int bracketingPresetsBitField, int burstValuesBitField, int streamingModesBitField, float timelapseIntervalMin, float gpslapseIntervalMin, int autoExposureMeteringModesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)1);
        enc.writeByte((byte)camId);
        enc.writeInt(model == null ? -1 : model.value);
        enc.writeByte((byte)exposureModesBitField);
        enc.writeInt(exposureLockSupported == null ? -1 : exposureLockSupported.value);
        enc.writeInt(exposureRoiLockSupported == null ? -1 : exposureRoiLockSupported.value);
        enc.writeLong(evCompensationsBitField);
        enc.writeInt((int)whiteBalanceModesBitField);
        enc.writeLong(customWhiteBalanceTemperaturesBitField);
        enc.writeInt(whiteBalanceLockSupported == null ? -1 : whiteBalanceLockSupported.value);
        enc.writeShort((short)stylesBitField);
        enc.writeByte((byte)cameraModesBitField);
        enc.writeShort((short)hyperlapseValuesBitField);
        enc.writeShort((short)bracketingPresetsBitField);
        enc.writeShort((short)burstValuesBitField);
        enc.writeByte((byte)streamingModesBitField);
        enc.writeFloat(timelapseIntervalMin);
        enc.writeFloat(gpslapseIntervalMin);
        enc.writeShort((short)autoExposureMeteringModesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraRecordingCapabilities(int id, int recordingModesBitField, int resolutionsBitField, int frameratesBitField, ArsdkFeatureCamera.Supported hdr, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)2);
        enc.writeShort((short)id);
        enc.writeShort((short)recordingModesBitField);
        enc.writeShort((short)resolutionsBitField);
        enc.writeInt((int)frameratesBitField);
        enc.writeInt(hdr == null ? -1 : hdr.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraPhotoCapabilities(int id, int photoModesBitField, int photoFormatsBitField, int photoFileFormatsBitField, ArsdkFeatureCamera.Supported hdr, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)3);
        enc.writeShort((short)id);
        enc.writeShort((short)photoModesBitField);
        enc.writeShort((short)photoFormatsBitField);
        enc.writeShort((short)photoFileFormatsBitField);
        enc.writeInt(hdr == null ? -1 : hdr.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraAntiflickerCapabilities(int supportedModesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)4);
        enc.writeByte((byte)supportedModesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraExposureSettings(int camId, ArsdkFeatureCamera.ExposureMode mode, ArsdkFeatureCamera.ShutterSpeed manualShutterSpeed, long manualShutterSpeedCapabilitiesBitField, ArsdkFeatureCamera.IsoSensitivity manualIsoSensitivity, long manualIsoSensitivityCapabilitiesBitField, ArsdkFeatureCamera.IsoSensitivity maxIsoSensitivity, long maxIsoSensitivitiesCapabilitiesBitField, ArsdkFeatureCamera.AutoExposureMeteringMode meteringMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)9);
        enc.writeByte((byte)camId);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(manualShutterSpeed == null ? -1 : manualShutterSpeed.value);
        enc.writeLong(manualShutterSpeedCapabilitiesBitField);
        enc.writeInt(manualIsoSensitivity == null ? -1 : manualIsoSensitivity.value);
        enc.writeLong(manualIsoSensitivityCapabilitiesBitField);
        enc.writeInt(maxIsoSensitivity == null ? -1 : maxIsoSensitivity.value);
        enc.writeLong(maxIsoSensitivitiesCapabilitiesBitField);
        enc.writeInt(meteringMode == null ? -1 : meteringMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraExposure(int camId, ArsdkFeatureCamera.ShutterSpeed shutterSpeed, ArsdkFeatureCamera.IsoSensitivity isoSensitivity, ArsdkFeatureCamera.State lock, float lockRoiX, float lockRoiY, float lockRoiWidth, float lockRoiHeight) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)10);
        enc.writeByte((byte)camId);
        enc.writeInt(shutterSpeed == null ? -1 : shutterSpeed.value);
        enc.writeInt(isoSensitivity == null ? -1 : isoSensitivity.value);
        enc.writeInt(lock == null ? -1 : lock.value);
        enc.writeFloat(lockRoiX);
        enc.writeFloat(lockRoiY);
        enc.writeFloat(lockRoiWidth);
        enc.writeFloat(lockRoiHeight);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraWhiteBalance(int camId, ArsdkFeatureCamera.WhiteBalanceMode mode, ArsdkFeatureCamera.WhiteBalanceTemperature temperature, ArsdkFeatureCamera.State lock) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)13);
        enc.writeByte((byte)camId);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(temperature == null ? -1 : temperature.value);
        enc.writeInt(lock == null ? -1 : lock.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraEvCompensation(int camId, ArsdkFeatureCamera.EvCompensation value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)15);
        enc.writeByte((byte)camId);
        enc.writeInt(value == null ? -1 : value.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraAntiflickerMode(ArsdkFeatureCamera.AntiflickerMode mode, ArsdkFeatureCamera.AntiflickerMode value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)17);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(value == null ? -1 : value.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraStyle(int camId, ArsdkFeatureCamera.Style style, int saturation, int saturationMin, int saturationMax, int contrast, int contrastMin, int contrastMax, int sharpness, int sharpnessMin, int sharpnessMax) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)20);
        enc.writeByte((byte)camId);
        enc.writeInt(style == null ? -1 : style.value);
        enc.writeByte((byte)saturation);
        enc.writeByte((byte)saturationMin);
        enc.writeByte((byte)saturationMax);
        enc.writeByte((byte)contrast);
        enc.writeByte((byte)contrastMin);
        enc.writeByte((byte)contrastMax);
        enc.writeByte((byte)sharpness);
        enc.writeByte((byte)sharpnessMin);
        enc.writeByte((byte)sharpnessMax);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraZoomLevel(int camId, float level) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)22);
        enc.writeByte((byte)camId);
        enc.writeFloat(level);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraZoomInfo(int camId, ArsdkFeatureCamera.Availability available, float highQualityMaximumLevel, float maximumLevel) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)23);
        enc.writeByte((byte)camId);
        enc.writeInt(available == null ? -1 : available.value);
        enc.writeFloat(highQualityMaximumLevel);
        enc.writeFloat(maximumLevel);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraMaxZoomSpeed(int camId, float min, float max, float current) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)24);
        enc.writeByte((byte)camId);
        enc.writeFloat(min);
        enc.writeFloat(max);
        enc.writeFloat(current);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraZoomVelocityQualityDegradation(int camId, int allowed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)26);
        enc.writeByte((byte)camId);
        enc.writeByte((byte)allowed);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraHdrSetting(int camId, ArsdkFeatureCamera.State value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)29);
        enc.writeByte((byte)camId);
        enc.writeInt(value == null ? -1 : value.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraHdr(int camId, ArsdkFeatureCamera.Availability available, ArsdkFeatureCamera.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)30);
        enc.writeByte((byte)camId);
        enc.writeInt(available == null ? -1 : available.value);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraCameraMode(int camId, ArsdkFeatureCamera.CameraMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)32);
        enc.writeByte((byte)camId);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraRecordingMode(int camId, ArsdkFeatureCamera.RecordingMode mode, ArsdkFeatureCamera.Resolution resolution, ArsdkFeatureCamera.Framerate framerate, ArsdkFeatureCamera.HyperlapseValue hyperlapse, long bitrate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)34);
        enc.writeByte((byte)camId);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(resolution == null ? -1 : resolution.value);
        enc.writeInt(framerate == null ? -1 : framerate.value);
        enc.writeInt(hyperlapse == null ? -1 : hyperlapse.value);
        enc.writeInt((int)bitrate);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraPhotoMode(int camId, ArsdkFeatureCamera.PhotoMode mode, ArsdkFeatureCamera.PhotoFormat format, ArsdkFeatureCamera.PhotoFileFormat fileFormat, ArsdkFeatureCamera.BurstValue burst, ArsdkFeatureCamera.BracketingPreset bracketing, float captureInterval) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)36);
        enc.writeByte((byte)camId);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeInt(format == null ? -1 : format.value);
        enc.writeInt(fileFormat == null ? -1 : fileFormat.value);
        enc.writeInt(burst == null ? -1 : burst.value);
        enc.writeInt(bracketing == null ? -1 : bracketing.value);
        enc.writeFloat(captureInterval);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraStreamingMode(int camId, ArsdkFeatureCamera.StreamingMode value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)38);
        enc.writeByte((byte)camId);
        enc.writeInt(value == null ? -1 : value.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraPhotoProgress(int camId, ArsdkFeatureCamera.PhotoResult result, int photoCount, String mediaId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)40);
        enc.writeByte((byte)camId);
        enc.writeInt(result == null ? -1 : result.value);
        enc.writeByte((byte)photoCount);
        enc.writeString(mediaId);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraPhotoState(int camId, ArsdkFeatureCamera.Availability available, ArsdkFeatureCamera.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)41);
        enc.writeByte((byte)camId);
        enc.writeInt(available == null ? -1 : available.value);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraRecordingProgress(int camId, ArsdkFeatureCamera.RecordingResult result, String mediaId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)44);
        enc.writeByte((byte)camId);
        enc.writeInt(result == null ? -1 : result.value);
        enc.writeString(mediaId);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraRecordingState(int camId, ArsdkFeatureCamera.Availability available, ArsdkFeatureCamera.State state, long startTimestamp) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)45);
        enc.writeByte((byte)camId);
        enc.writeInt(available == null ? -1 : available.value);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeLong(startTimestamp);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraAutorecord(int camId, ArsdkFeatureCamera.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)47);
        enc.writeByte((byte)camId);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraCameraStates(long activeCameras) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)49);
        enc.writeInt((int)activeCameras);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraNextPhotoDelay(ArsdkFeatureCamera.PhotoMode mode, float remaining) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)51);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeFloat(remaining);
        return enc.encode();
    }
    public static ArsdkCommand encodeCameraAlignmentOffsets(int camId, float minBoundYaw, float maxBoundYaw, float currentYaw, float minBoundPitch, float maxBoundPitch, float currentPitch, float minBoundRoll, float maxBoundRoll, float currentRoll) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)143).writeByte((byte)0).writeShort((short)52);
        enc.writeByte((byte)camId);
        enc.writeFloat(minBoundYaw);
        enc.writeFloat(maxBoundYaw);
        enc.writeFloat(currentYaw);
        enc.writeFloat(minBoundPitch);
        enc.writeFloat(maxBoundPitch);
        enc.writeFloat(currentPitch);
        enc.writeFloat(minBoundRoll);
        enc.writeFloat(maxBoundRoll);
        enc.writeFloat(currentRoll);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationAvailability(int valuesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)1);
        enc.writeInt((int)valuesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationState(ArsdkFeatureAnimation.Type type, int percent) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)2);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeByte((byte)percent);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationFlipState(ArsdkFeatureAnimation.State state, ArsdkFeatureAnimation.FlipType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)5);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationHorizontalPanoramaState(ArsdkFeatureAnimation.State state, float rotationAngle, float rotationSpeed) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)7);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(rotationAngle);
        enc.writeFloat(rotationSpeed);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationDronieState(ArsdkFeatureAnimation.State state, float speed, float distance, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)9);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(distance);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationHorizontalRevealState(ArsdkFeatureAnimation.State state, float speed, float distance, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)11);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(distance);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationVerticalRevealState(ArsdkFeatureAnimation.State state, float speed, float verticalDistance, float rotationAngle, float rotationSpeed, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)13);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        enc.writeFloat(rotationAngle);
        enc.writeFloat(rotationSpeed);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationSpiralState(ArsdkFeatureAnimation.State state, float speed, float radiusVariation, float verticalDistance, float revolutionNb, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)15);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(radiusVariation);
        enc.writeFloat(verticalDistance);
        enc.writeFloat(revolutionNb);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationParabolaState(ArsdkFeatureAnimation.State state, float speed, float verticalDistance, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)17);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationCandleState(ArsdkFeatureAnimation.State state, float speed, float verticalDistance, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)19);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationDollySlideState(ArsdkFeatureAnimation.State state, float speed, float angle, float horizontalDistance, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)21);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(angle);
        enc.writeFloat(horizontalDistance);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationVertigoState(ArsdkFeatureAnimation.State state, float duration, float maxZoomLevel, ArsdkFeatureAnimation.VertigoFinishAction finishAction, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)23);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(duration);
        enc.writeFloat(maxZoomLevel);
        enc.writeInt(finishAction == null ? -1 : finishAction.value);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationTwistUpState(ArsdkFeatureAnimation.State state, float speed, float verticalDistance, float rotationAngle, float rotationSpeed, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)25);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        enc.writeFloat(rotationAngle);
        enc.writeFloat(rotationSpeed);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationPositionTwistUpState(ArsdkFeatureAnimation.State state, float speed, float verticalDistance, float rotationAngle, float rotationSpeed, ArsdkFeatureAnimation.PlayMode playMode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)27);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeFloat(speed);
        enc.writeFloat(verticalDistance);
        enc.writeFloat(rotationAngle);
        enc.writeFloat(rotationSpeed);
        enc.writeInt(playMode == null ? -1 : playMode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationHorizontal180PhotoPanoramaState(ArsdkFeatureAnimation.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)29);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationVertical180PhotoPanoramaState(ArsdkFeatureAnimation.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)31);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeAnimationSphericalPhotoPanoramaState(ArsdkFeatureAnimation.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)144).writeByte((byte)0).writeShort((short)33);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageInfo(String name, long capacity) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)1);
        enc.writeString(name);
        enc.writeLong(capacity);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageMonitor(long availableBytes) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)2);
        enc.writeLong(availableBytes);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageState(ArsdkFeatureUserStorage.PhyState physicalState, ArsdkFeatureUserStorage.FsState fileSystemState, int attributeBitField, int monitorEnabled, int monitorPeriod) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)3);
        enc.writeInt(physicalState == null ? -1 : physicalState.value);
        enc.writeInt(fileSystemState == null ? -1 : fileSystemState.value);
        enc.writeByte((byte)attributeBitField);
        enc.writeByte((byte)monitorEnabled);
        enc.writeByte((byte)monitorPeriod);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageFormatResult(ArsdkFeatureUserStorage.FormattingResult result) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)7);
        enc.writeInt(result == null ? -1 : result.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageCapabilities(int supportedFeaturesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)8);
        enc.writeShort((short)supportedFeaturesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageSupportedFormattingTypes(int supportedTypesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)9);
        enc.writeByte((byte)supportedTypesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageFormatProgress(ArsdkFeatureUserStorage.FormattingStep step, int percentage) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)11);
        enc.writeInt(step == null ? -1 : step.value);
        enc.writeByte((byte)percentage);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageDecryption(ArsdkFeatureUserStorage.PasswordResult result) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)14);
        enc.writeInt(result == null ? -1 : result.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeUserStorageSdcardUuid(String uuid) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)145).writeByte((byte)0).writeShort((short)15);
        enc.writeString(uuid);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthHomeTypeCapabilities(int valuesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)1);
        enc.writeInt((int)valuesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthHomeType(ArsdkFeatureRth.HomeType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)2);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthPreferredHomeType(ArsdkFeatureRth.HomeType type) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)3);
        enc.writeInt(type == null ? -1 : type.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthTakeoffLocation(double latitude, double longitude, float altitude, int fixedBeforeTakeoff) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)5);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeFloat(altitude);
        enc.writeByte((byte)fixedBeforeTakeoff);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthCustomLocation(double latitude, double longitude, float altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)7);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeFloat(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthFolloweeLocation(double latitude, double longitude, float altitude) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)8);
        enc.writeDouble(latitude);
        enc.writeDouble(longitude);
        enc.writeFloat(altitude);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthDelay(int delay, int min, int max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)10);
        enc.writeShort((short)delay);
        enc.writeShort((short)min);
        enc.writeShort((short)max);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthState(ArsdkFeatureRth.State state, ArsdkFeatureRth.StateReason reason) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)13);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeInt(reason == null ? -1 : reason.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthHomeReachability(ArsdkFeatureRth.HomeReachability status) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)14);
        enc.writeInt(status == null ? -1 : status.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthRthAutoTrigger(ArsdkFeatureRth.AutoTriggerReason reason, long delay) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)15);
        enc.writeInt(reason == null ? -1 : reason.value);
        enc.writeInt((int)delay);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthMinAltitude(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)18);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthAutoTriggerMode(ArsdkFeatureRth.AutoTriggerMode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)20);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthEndingBehavior(ArsdkFeatureRth.EndingBehavior endingBehavior) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)22);
        enc.writeInt(endingBehavior == null ? -1 : endingBehavior.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeRthEndingHoveringAltitude(float current, float min, float max) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)146).writeByte((byte)0).writeShort((short)24);
        enc.writeFloat(current);
        enc.writeFloat(min);
        enc.writeFloat(max);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamRadiometricCalibStatus(int camId, ArsdkFeatureSequoiaCam.RadiometricCalibStatusValue value, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)1);
        enc.writeByte((byte)camId);
        enc.writeInt(value == null ? -1 : value.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamRadiometricCalibResult(int camId, ArsdkFeatureSequoiaCam.RadiometricCalibResultValue value, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)2);
        enc.writeByte((byte)camId);
        enc.writeInt(value == null ? -1 : value.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamSessionStateChanged(int camId, ArsdkFeatureSequoiaCam.SessionStatusValue state, String sessionPath, String liveStitchPath, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)6);
        enc.writeByte((byte)camId);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeString(sessionPath);
        enc.writeString(liveStitchPath);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamLiveStitchMaskChanged(int camId, int maskBitField, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)8);
        enc.writeByte((byte)camId);
        enc.writeByte((byte)maskBitField);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamLiveStitchLastPictureIdChanged(int camId, long pictureId, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)9);
        enc.writeByte((byte)camId);
        enc.writeInt((int)pictureId);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamStorageInfos(int camId, ArsdkFeatureSequoiaCam.StorageInfosSelected selected, int internalAvailable, long internalTotalSize, long internalFreeSize, int internalIsRo, int internalIsCorrupted, int sdAvailable, long sdTotalSize, long sdFreeSize, int sdIsRo, int sdIsCorrupted, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)10);
        enc.writeByte((byte)camId);
        enc.writeInt(selected == null ? -1 : selected.value);
        enc.writeByte((byte)internalAvailable);
        enc.writeLong(internalTotalSize);
        enc.writeLong(internalFreeSize);
        enc.writeByte((byte)internalIsRo);
        enc.writeByte((byte)internalIsCorrupted);
        enc.writeByte((byte)sdAvailable);
        enc.writeLong(sdTotalSize);
        enc.writeLong(sdFreeSize);
        enc.writeByte((byte)sdIsRo);
        enc.writeByte((byte)sdIsCorrupted);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamSystemStatus(int camId, int errorsBitField, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)11);
        enc.writeByte((byte)camId);
        enc.writeShort((short)errorsBitField);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSequoiaCamLiveStitchPicturesInProgressNumberChanged(int camId, long nbPictures, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)147).writeByte((byte)0).writeShort((short)14);
        enc.writeByte((byte)camId);
        enc.writeInt((int)nbPictures);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalGimbalCapabilities(int gimbalId, ArsdkFeatureGimbal.Model model, int axesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)1);
        enc.writeByte((byte)gimbalId);
        enc.writeInt(model == null ? -1 : model.value);
        enc.writeByte((byte)axesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalRelativeAttitudeBounds(int gimbalId, float minYaw, float maxYaw, float minPitch, float maxPitch, float minRoll, float maxRoll) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)2);
        enc.writeByte((byte)gimbalId);
        enc.writeFloat(minYaw);
        enc.writeFloat(maxYaw);
        enc.writeFloat(minPitch);
        enc.writeFloat(maxPitch);
        enc.writeFloat(minRoll);
        enc.writeFloat(maxRoll);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalMaxSpeed(int gimbalId, float minBoundYaw, float maxBoundYaw, float currentYaw, float minBoundPitch, float maxBoundPitch, float currentPitch, float minBoundRoll, float maxBoundRoll, float currentRoll) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)3);
        enc.writeByte((byte)gimbalId);
        enc.writeFloat(minBoundYaw);
        enc.writeFloat(maxBoundYaw);
        enc.writeFloat(currentYaw);
        enc.writeFloat(minBoundPitch);
        enc.writeFloat(maxBoundPitch);
        enc.writeFloat(currentPitch);
        enc.writeFloat(minBoundRoll);
        enc.writeFloat(maxBoundRoll);
        enc.writeFloat(currentRoll);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalAttitude(int gimbalId, ArsdkFeatureGimbal.FrameOfReference yawFrameOfReference, ArsdkFeatureGimbal.FrameOfReference pitchFrameOfReference, ArsdkFeatureGimbal.FrameOfReference rollFrameOfReference, float yawRelative, float pitchRelative, float rollRelative, float yawAbsolute, float pitchAbsolute, float rollAbsolute) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)6);
        enc.writeByte((byte)gimbalId);
        enc.writeInt(yawFrameOfReference == null ? -1 : yawFrameOfReference.value);
        enc.writeInt(pitchFrameOfReference == null ? -1 : pitchFrameOfReference.value);
        enc.writeInt(rollFrameOfReference == null ? -1 : rollFrameOfReference.value);
        enc.writeFloat(yawRelative);
        enc.writeFloat(pitchRelative);
        enc.writeFloat(rollRelative);
        enc.writeFloat(yawAbsolute);
        enc.writeFloat(pitchAbsolute);
        enc.writeFloat(rollAbsolute);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalAxisLockState(int gimbalId, int lockedBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)7);
        enc.writeByte((byte)gimbalId);
        enc.writeByte((byte)lockedBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalOffsets(int gimbalId, ArsdkFeatureGimbal.State updateState, float minBoundYaw, float maxBoundYaw, float currentYaw, float minBoundPitch, float maxBoundPitch, float currentPitch, float minBoundRoll, float maxBoundRoll, float currentRoll) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)8);
        enc.writeByte((byte)gimbalId);
        enc.writeInt(updateState == null ? -1 : updateState.value);
        enc.writeFloat(minBoundYaw);
        enc.writeFloat(maxBoundYaw);
        enc.writeFloat(currentYaw);
        enc.writeFloat(minBoundPitch);
        enc.writeFloat(maxBoundPitch);
        enc.writeFloat(currentPitch);
        enc.writeFloat(minBoundRoll);
        enc.writeFloat(maxBoundRoll);
        enc.writeFloat(currentRoll);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalAbsoluteAttitudeBounds(int gimbalId, float minYaw, float maxYaw, float minPitch, float maxPitch, float minRoll, float maxRoll) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)10);
        enc.writeByte((byte)gimbalId);
        enc.writeFloat(minYaw);
        enc.writeFloat(maxYaw);
        enc.writeFloat(minPitch);
        enc.writeFloat(maxPitch);
        enc.writeFloat(minRoll);
        enc.writeFloat(maxRoll);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalCalibrationState(ArsdkFeatureGimbal.CalibrationState state, int gimbalId) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)14);
        enc.writeInt(state == null ? -1 : state.value);
        enc.writeByte((byte)gimbalId);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalCalibrationResult(int gimbalId, ArsdkFeatureGimbal.CalibrationResult result) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)16);
        enc.writeByte((byte)gimbalId);
        enc.writeInt(result == null ? -1 : result.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeGimbalAlert(int gimbalId, int errorBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)148).writeByte((byte)0).writeShort((short)17);
        enc.writeByte((byte)gimbalId);
        enc.writeByte((byte)errorBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeBatteryAlert(ArsdkFeatureBattery.Alert alert, ArsdkFeatureBattery.AlertLevel level, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)149).writeByte((byte)0).writeShort((short)1);
        enc.writeInt(alert == null ? -1 : alert.value);
        enc.writeInt(level == null ? -1 : level.value);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeBatteryHealth(int stateOfHealth) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)149).writeByte((byte)0).writeShort((short)2);
        enc.writeByte((byte)stateOfHealth);
        return enc.encode();
    }
    public static ArsdkCommand encodeBatteryVoltage(int voltage) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)149).writeByte((byte)0).writeShort((short)3);
        enc.writeShort((short)voltage);
        return enc.encode();
    }
    public static ArsdkCommand encodeBatteryCycleCount(long count) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)149).writeByte((byte)0).writeShort((short)4);
        enc.writeInt((int)count);
        return enc.encode();
    }
    public static ArsdkCommand encodeBatterySerial(String serial) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)149).writeByte((byte)0).writeShort((short)5);
        enc.writeString(serial);
        return enc.encode();
    }
    public static ArsdkCommand encodeMediastoreState(ArsdkFeatureMediastore.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)150).writeByte((byte)0).writeShort((short)1);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMediastoreCounters(int videoMediaCount, int photoMediaCount, int videoResourceCount, int photoResourceCount) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)150).writeByte((byte)0).writeShort((short)2);
        enc.writeInt((int)videoMediaCount);
        enc.writeInt((int)photoMediaCount);
        enc.writeInt((int)videoResourceCount);
        enc.writeInt((int)photoResourceCount);
        return enc.encode();
    }
    public static ArsdkCommand encodePreciseHomeCapabilities(int modesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)151).writeByte((byte)0).writeShort((short)1);
        enc.writeByte((byte)modesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodePreciseHomeMode(ArsdkFeaturePreciseHome.Mode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)151).writeByte((byte)0).writeShort((short)2);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePreciseHomeState(ArsdkFeaturePreciseHome.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)151).writeByte((byte)0).writeShort((short)4);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalMode(ArsdkFeatureThermal.Mode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)2);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalCapabilities(int modesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)3);
        enc.writeByte((byte)modesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalPalettePart(float red, float green, float blue, float index, int listFlagsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)5);
        enc.writeFloat(red);
        enc.writeFloat(green);
        enc.writeFloat(blue);
        enc.writeFloat(index);
        enc.writeByte((byte)listFlagsBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalPaletteSettings(ArsdkFeatureThermal.PaletteMode mode, float lowestTemp, float highestTemp, ArsdkFeatureThermal.ColorizationMode outsideColorization, ArsdkFeatureThermal.RelativeRangeMode relativeRange, ArsdkFeatureThermal.SpotType spotType, float spotThreshold) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)7);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeFloat(lowestTemp);
        enc.writeFloat(highestTemp);
        enc.writeInt(outsideColorization == null ? -1 : outsideColorization.value);
        enc.writeInt(relativeRange == null ? -1 : relativeRange.value);
        enc.writeInt(spotType == null ? -1 : spotType.value);
        enc.writeFloat(spotThreshold);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalRendering(ArsdkFeatureThermal.RenderingMode mode, float blendingRate) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)9);
        enc.writeInt(mode == null ? -1 : mode.value);
        enc.writeFloat(blendingRate);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalEmissivity(float emissivity) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)11);
        enc.writeFloat(emissivity);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalBackgroundTemperature(float backgroundTemperature) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)13);
        enc.writeFloat(backgroundTemperature);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalSensitivity(ArsdkFeatureThermal.Range currentRange) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)15);
        enc.writeInt(currentRange == null ? -1 : currentRange.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeThermalShutterMode(ArsdkFeatureThermal.ShutterTrigger currentTrigger) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)152).writeByte((byte)0).writeShort((short)17);
        enc.writeInt(currentTrigger == null ? -1 : currentTrigger.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeLedsCapabilities(int supportedCapabilitiesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)154).writeByte((byte)0).writeShort((short)1);
        enc.writeShort((short)supportedCapabilitiesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeLedsSwitchState(ArsdkFeatureLeds.SwitchState switchState) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)154).writeByte((byte)0).writeShort((short)4);
        enc.writeInt(switchState == null ? -1 : switchState.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePilotingStyleStyle(ArsdkFeaturePilotingStyle.Style style) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)155).writeByte((byte)0).writeShort((short)1);
        enc.writeInt(style == null ? -1 : style.value);
        return enc.encode();
    }
    public static ArsdkCommand encodePilotingStyleCapabilities(int stylesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)155).writeByte((byte)0).writeShort((short)3);
        enc.writeByte((byte)stylesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeGaugeFwUpdaterStatus(ArsdkFeatureGaugeFwUpdater.Diag diag, int missingRequirementsBitField, ArsdkFeatureGaugeFwUpdater.State state) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)160).writeByte((byte)0).writeShort((short)3);
        enc.writeInt(diag == null ? -1 : diag.value);
        enc.writeInt((int)missingRequirementsBitField);
        enc.writeInt(state == null ? -1 : state.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeGaugeFwUpdaterProgress(ArsdkFeatureGaugeFwUpdater.Result result, int percent) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)160).writeByte((byte)0).writeShort((short)4);
        enc.writeInt(result == null ? -1 : result.value);
        enc.writeByte((byte)percent);
        return enc.encode();
    }
    public static ArsdkCommand encodeDriCapabilities(int supportedCapabilitiesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)164).writeByte((byte)0).writeShort((short)1);
        enc.writeShort((short)supportedCapabilitiesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeDriDriState(ArsdkFeatureDri.Mode mode) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)164).writeByte((byte)0).writeShort((short)3);
        enc.writeInt(mode == null ? -1 : mode.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeDriDroneId(ArsdkFeatureDri.IdType type, String value) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)164).writeByte((byte)0).writeShort((short)4);
        enc.writeInt(type == null ? -1 : type.value);
        enc.writeString(value);
        return enc.encode();
    }
    public static ArsdkCommand encodeSecurityEditionCapabilities(int supportedCapabilitiesBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)169).writeByte((byte)0).writeShort((short)1);
        enc.writeShort((short)supportedCapabilitiesBitField);
        return enc.encode();
    }
    public static ArsdkCommand encodeSecurityEditionLogStorageState(ArsdkFeatureSecurityEdition.LogStorageState logStorageState) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)169).writeByte((byte)0).writeShort((short)3);
        enc.writeInt(logStorageState == null ? -1 : logStorageState.value);
        return enc.encode();
    }
    public static ArsdkCommand encodeMoveInfo(int missingInputsBitField) {
        ArsdkCommandEncoder enc = new ArsdkCommandEncoder();
        enc.writeByte((byte)170).writeByte((byte)0).writeShort((short)3);
        enc.writeInt((int)missingInputsBitField);
        return enc.encode();
    }
}
