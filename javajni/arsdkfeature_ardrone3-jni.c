/** Generated, do not edit ! */

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeTakeOff(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_TakeOff(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodePCMD(JNIEnv *env, jclass jcls, jlong nativeCmd, jint flag, jint roll, jint pitch, jint yaw, jint gaz, jlong timestampAndSeqNum) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_PCMD(cmd, flag, roll, pitch, yaw, gaz, timestampAndSeqNum);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeLanding(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_Landing(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeEmergency(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_Emergency(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeNavigateHome(JNIEnv *env, jclass jcls, jlong nativeCmd, jint start) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_NavigateHome(cmd, start);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeMoveBy(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat dX, jfloat dY, jfloat dZ, jfloat dPsi) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_MoveBy(cmd, dX, dY, dZ, dPsi);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeUserTakeOff(JNIEnv *env, jclass jcls, jlong nativeCmd, jint state) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_UserTakeOff(cmd, state);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeCircle(JNIEnv *env, jclass jcls, jlong nativeCmd, jint direction) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_Circle(cmd, direction);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeMoveTo(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jdouble altitude, jint orientation_mode, jfloat heading) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_MoveTo(cmd, latitude, longitude, altitude, orientation_mode, heading);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeCancelMoveTo(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_CancelMoveTo(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeStartPilotedPOI(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jdouble altitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_StartPilotedPOI(cmd, latitude, longitude, altitude);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeStopPilotedPOI(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_StopPilotedPOI(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeCancelMoveBy(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_CancelMoveBy(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Piloting_nativeEncodeStartPilotedPOIV2(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jdouble altitude, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Piloting_StartPilotedPOIV2(cmd, latitude, longitude, altitude, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Camera_nativeEncodeOrientation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint tilt, jint pan) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Camera_Orientation(cmd, tilt, pan);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Camera_nativeEncodeOrientationV2(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat tilt, jfloat pan) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Camera_OrientationV2(cmd, tilt, pan);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Camera_nativeEncodeVelocity(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat tilt, jfloat pan) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Camera_Velocity(cmd, tilt, pan);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeMaxAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_MaxAltitude(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeMaxTilt(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_MaxTilt(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeAbsolutControl(JNIEnv *env, jclass jcls, jlong nativeCmd, jint on) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_AbsolutControl(cmd, on);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeMaxDistance(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_MaxDistance(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeNoFlyOverMaxDistance(JNIEnv *env, jclass jcls, jlong nativeCmd, jint shouldNotFlyOver) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_NoFlyOverMaxDistance(cmd, shouldNotFlyOver);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeBankedTurn(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_BankedTurn(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeMinAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_MinAltitude(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeCirclingDirection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_CirclingDirection(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeCirclingRadius(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_CirclingRadius(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeCirclingAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_CirclingAltitude(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodePitchMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_PitchMode(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettings_nativeEncodeSetMotionDetectionMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PilotingSettings_SetMotionDetectionMode(cmd, enable);
	return res;
}

static struct {
	jmethodID jmid_PictureEventChanged;
	jmethodID jmid_VideoEventChanged;
} s_cb_ardrone3_MediaRecordEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecordEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_MediaRecordEvent_cache.jmid_PictureEventChanged = (*env)->GetStaticMethodID(env, jcls, "pictureeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordEvent$Callback;II)V");
	s_cb_ardrone3_MediaRecordEvent_cache.jmid_VideoEventChanged = (*env)->GetStaticMethodID(env, jcls, "videoeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordEvent$Callback;II)V");
}

static int evt_ardrone3_MediaRecordEvent_PictureEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordEvent_PictureEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordEvent_cache.jmid_PictureEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

static int evt_ardrone3_MediaRecordEvent_VideoEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordEvent_VideoEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordEvent_cache.jmid_VideoEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecordEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 3)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_MediaRecordEvent_PictureEventChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_MediaRecordEvent_VideoEventChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_FlyingStateChanged;
	jmethodID jmid_AlertStateChanged;
	jmethodID jmid_NavigateHomeStateChanged;
	jmethodID jmid_PositionChanged;
	jmethodID jmid_SpeedChanged;
	jmethodID jmid_AttitudeChanged;
	jmethodID jmid_AltitudeChanged;
	jmethodID jmid_GpsLocationChanged;
	jmethodID jmid_LandingStateChanged;
	jmethodID jmid_AirSpeedChanged;
	jmethodID jmid_moveToChanged;
	jmethodID jmid_MotionState;
	jmethodID jmid_PilotedPOI;
	jmethodID jmid_ReturnHomeBatteryCapacity;
	jmethodID jmid_moveByChanged;
	jmethodID jmid_HoveringWarning;
	jmethodID jmid_ForcedLandingAutoTrigger;
	jmethodID jmid_WindStateChanged;
	jmethodID jmid_VibrationLevelChanged;
	jmethodID jmid_AltitudeAboveGroundChanged;
	jmethodID jmid_PilotedPOIV2;
} s_cb_ardrone3_PilotingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_PilotingState_cache.jmid_FlyingStateChanged = (*env)->GetStaticMethodID(env, jcls, "flyingstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_AlertStateChanged = (*env)->GetStaticMethodID(env, jcls, "alertstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_NavigateHomeStateChanged = (*env)->GetStaticMethodID(env, jcls, "navigatehomestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;II)V");
	s_cb_ardrone3_PilotingState_cache.jmid_PositionChanged = (*env)->GetStaticMethodID(env, jcls, "positionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;DDD)V");
	s_cb_ardrone3_PilotingState_cache.jmid_SpeedChanged = (*env)->GetStaticMethodID(env, jcls, "speedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;FFF)V");
	s_cb_ardrone3_PilotingState_cache.jmid_AttitudeChanged = (*env)->GetStaticMethodID(env, jcls, "attitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;FFF)V");
	s_cb_ardrone3_PilotingState_cache.jmid_AltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "altitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;D)V");
	s_cb_ardrone3_PilotingState_cache.jmid_GpsLocationChanged = (*env)->GetStaticMethodID(env, jcls, "gpslocationchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;DDDIII)V");
	s_cb_ardrone3_PilotingState_cache.jmid_LandingStateChanged = (*env)->GetStaticMethodID(env, jcls, "landingstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_AirSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "airspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;F)V");
	s_cb_ardrone3_PilotingState_cache.jmid_moveToChanged = (*env)->GetStaticMethodID(env, jcls, "movetochanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;DDDIFI)V");
	s_cb_ardrone3_PilotingState_cache.jmid_MotionState = (*env)->GetStaticMethodID(env, jcls, "motionstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_PilotedPOI = (*env)->GetStaticMethodID(env, jcls, "pilotedpoi", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;DDDI)V");
	s_cb_ardrone3_PilotingState_cache.jmid_ReturnHomeBatteryCapacity = (*env)->GetStaticMethodID(env, jcls, "returnhomebatterycapacity", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_moveByChanged = (*env)->GetStaticMethodID(env, jcls, "movebychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;FFFFFFFFI)V");
	s_cb_ardrone3_PilotingState_cache.jmid_HoveringWarning = (*env)->GetStaticMethodID(env, jcls, "hoveringwarning", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;II)V");
	s_cb_ardrone3_PilotingState_cache.jmid_ForcedLandingAutoTrigger = (*env)->GetStaticMethodID(env, jcls, "forcedlandingautotrigger", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;IJ)V");
	s_cb_ardrone3_PilotingState_cache.jmid_WindStateChanged = (*env)->GetStaticMethodID(env, jcls, "windstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_VibrationLevelChanged = (*env)->GetStaticMethodID(env, jcls, "vibrationlevelchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;I)V");
	s_cb_ardrone3_PilotingState_cache.jmid_AltitudeAboveGroundChanged = (*env)->GetStaticMethodID(env, jcls, "altitudeabovegroundchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;F)V");
	s_cb_ardrone3_PilotingState_cache.jmid_PilotedPOIV2 = (*env)->GetStaticMethodID(env, jcls, "pilotedpoiv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingState$Callback;DDDII)V");
}

static int evt_ardrone3_PilotingState_FlyingStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_FlyingStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_FlyingStateChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingState_AlertStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_AlertStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_AlertStateChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingState_NavigateHomeStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t reason;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_NavigateHomeStateChanged(cmd, &state, &reason);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_NavigateHomeStateChanged, callback, (jint)state, (jint)reason);
	return 0;
}

static int evt_ardrone3_PilotingState_PositionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_PositionChanged(cmd, &latitude, &longitude, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_PositionChanged, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude);
	return 0;
}

static int evt_ardrone3_PilotingState_SpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float speedX;
	float speedY;
	float speedZ;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_SpeedChanged(cmd, &speedX, &speedY, &speedZ);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_SpeedChanged, callback, (jfloat)speedX, (jfloat)speedY, (jfloat)speedZ);
	return 0;
}

static int evt_ardrone3_PilotingState_AttitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float roll;
	float pitch;
	float yaw;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_AttitudeChanged(cmd, &roll, &pitch, &yaw);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_AttitudeChanged, callback, (jfloat)roll, (jfloat)pitch, (jfloat)yaw);
	return 0;
}

static int evt_ardrone3_PilotingState_AltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double altitude;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_AltitudeChanged(cmd, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_AltitudeChanged, callback, (jdouble)altitude);
	return 0;
}

static int evt_ardrone3_PilotingState_GpsLocationChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int8_t latitude_accuracy;
	int8_t longitude_accuracy;
	int8_t altitude_accuracy;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_GpsLocationChanged(cmd, &latitude, &longitude, &altitude, &latitude_accuracy, &longitude_accuracy, &altitude_accuracy);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_GpsLocationChanged, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude, (jint)latitude_accuracy, (jint)longitude_accuracy, (jint)altitude_accuracy);
	return 0;
}

static int evt_ardrone3_PilotingState_LandingStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_LandingStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_LandingStateChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingState_AirSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float airSpeed;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_AirSpeedChanged(cmd, &airSpeed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_AirSpeedChanged, callback, (jfloat)airSpeed);
	return 0;
}

static int evt_ardrone3_PilotingState_moveToChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int32_t orientation_mode;
	float heading;
	int32_t status;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_MoveToChanged(cmd, &latitude, &longitude, &altitude, &orientation_mode, &heading, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_moveToChanged, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude, (jint)orientation_mode, (jfloat)heading, (jint)status);
	return 0;
}

static int evt_ardrone3_PilotingState_MotionState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_MotionState(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_MotionState, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingState_PilotedPOI(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int32_t status;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_PilotedPOI(cmd, &latitude, &longitude, &altitude, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_PilotedPOI, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude, (jint)status);
	return 0;
}

static int evt_ardrone3_PilotingState_ReturnHomeBatteryCapacity(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t status;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_ReturnHomeBatteryCapacity(cmd, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_ReturnHomeBatteryCapacity, callback, (jint)status);
	return 0;
}

static int evt_ardrone3_PilotingState_moveByChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float dXAsked;
	float dYAsked;
	float dZAsked;
	float dPsiAsked;
	float dX;
	float dY;
	float dZ;
	float dPsi;
	int32_t status;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_MoveByChanged(cmd, &dXAsked, &dYAsked, &dZAsked, &dPsiAsked, &dX, &dY, &dZ, &dPsi, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_moveByChanged, callback, (jfloat)dXAsked, (jfloat)dYAsked, (jfloat)dZAsked, (jfloat)dPsiAsked, (jfloat)dX, (jfloat)dY, (jfloat)dZ, (jfloat)dPsi, (jint)status);
	return 0;
}

static int evt_ardrone3_PilotingState_HoveringWarning(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t no_gps_too_dark;
	uint8_t no_gps_too_high;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_HoveringWarning(cmd, &no_gps_too_dark, &no_gps_too_high);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_HoveringWarning, callback, (jint)no_gps_too_dark, (jint)no_gps_too_high);
	return 0;
}

static int evt_ardrone3_PilotingState_ForcedLandingAutoTrigger(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t reason;
	uint32_t delay;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_ForcedLandingAutoTrigger(cmd, &reason, &delay);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_ForcedLandingAutoTrigger, callback, (jint)reason, (jlong)delay);
	return 0;
}

static int evt_ardrone3_PilotingState_WindStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_WindStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_WindStateChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingState_VibrationLevelChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_VibrationLevelChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_VibrationLevelChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingState_AltitudeAboveGroundChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float altitude;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_AltitudeAboveGroundChanged(cmd, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_AltitudeAboveGroundChanged, callback, (jfloat)altitude);
	return 0;
}

static int evt_ardrone3_PilotingState_PilotedPOIV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int32_t mode;
	int32_t status;
	int res = arsdk_cmd_dec_Ardrone3_PilotingState_PilotedPOIV2(cmd, &latitude, &longitude, &altitude, &mode, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingState_cache.jmid_PilotedPOIV2, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude, (jint)mode, (jint)status);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 4)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_ardrone3_PilotingState_FlyingStateChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_PilotingState_AlertStateChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_PilotingState_NavigateHomeStateChanged(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_PilotingState_PositionChanged(env, jcls, cmd, callback);
		case 5: return evt_ardrone3_PilotingState_SpeedChanged(env, jcls, cmd, callback);
		case 6: return evt_ardrone3_PilotingState_AttitudeChanged(env, jcls, cmd, callback);
		case 8: return evt_ardrone3_PilotingState_AltitudeChanged(env, jcls, cmd, callback);
		case 9: return evt_ardrone3_PilotingState_GpsLocationChanged(env, jcls, cmd, callback);
		case 10: return evt_ardrone3_PilotingState_LandingStateChanged(env, jcls, cmd, callback);
		case 11: return evt_ardrone3_PilotingState_AirSpeedChanged(env, jcls, cmd, callback);
		case 12: return evt_ardrone3_PilotingState_moveToChanged(env, jcls, cmd, callback);
		case 13: return evt_ardrone3_PilotingState_MotionState(env, jcls, cmd, callback);
		case 14: return evt_ardrone3_PilotingState_PilotedPOI(env, jcls, cmd, callback);
		case 15: return evt_ardrone3_PilotingState_ReturnHomeBatteryCapacity(env, jcls, cmd, callback);
		case 16: return evt_ardrone3_PilotingState_moveByChanged(env, jcls, cmd, callback);
		case 17: return evt_ardrone3_PilotingState_HoveringWarning(env, jcls, cmd, callback);
		case 18: return evt_ardrone3_PilotingState_ForcedLandingAutoTrigger(env, jcls, cmd, callback);
		case 19: return evt_ardrone3_PilotingState_WindStateChanged(env, jcls, cmd, callback);
		case 20: return evt_ardrone3_PilotingState_VibrationLevelChanged(env, jcls, cmd, callback);
		case 21: return evt_ardrone3_PilotingState_AltitudeAboveGroundChanged(env, jcls, cmd, callback);
		case 22: return evt_ardrone3_PilotingState_PilotedPOIV2(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Animations_nativeEncodeFlip(JNIEnv *env, jclass jcls, jlong nativeCmd, jint direction) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Animations_Flip(cmd, direction);
	return res;
}

static struct {
	jmethodID jmid_MaxAltitudeChanged;
	jmethodID jmid_MaxTiltChanged;
	jmethodID jmid_AbsolutControlChanged;
	jmethodID jmid_MaxDistanceChanged;
	jmethodID jmid_NoFlyOverMaxDistanceChanged;
	jmethodID jmid_BankedTurnChanged;
	jmethodID jmid_MinAltitudeChanged;
	jmethodID jmid_CirclingDirectionChanged;
	jmethodID jmid_CirclingRadiusChanged;
	jmethodID jmid_CirclingAltitudeChanged;
	jmethodID jmid_PitchModeChanged;
	jmethodID jmid_MotionDetection;
} s_cb_ardrone3_PilotingSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_MaxAltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "maxaltitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;FFF)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_MaxTiltChanged = (*env)->GetStaticMethodID(env, jcls, "maxtiltchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;FFF)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_AbsolutControlChanged = (*env)->GetStaticMethodID(env, jcls, "absolutcontrolchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;I)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_MaxDistanceChanged = (*env)->GetStaticMethodID(env, jcls, "maxdistancechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;FFF)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_NoFlyOverMaxDistanceChanged = (*env)->GetStaticMethodID(env, jcls, "noflyovermaxdistancechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;I)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_BankedTurnChanged = (*env)->GetStaticMethodID(env, jcls, "bankedturnchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;I)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_MinAltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "minaltitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;FFF)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_CirclingDirectionChanged = (*env)->GetStaticMethodID(env, jcls, "circlingdirectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;I)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_CirclingRadiusChanged = (*env)->GetStaticMethodID(env, jcls, "circlingradiuschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;III)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_CirclingAltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "circlingaltitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;III)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_PitchModeChanged = (*env)->GetStaticMethodID(env, jcls, "pitchmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;I)V");
	s_cb_ardrone3_PilotingSettingsState_cache.jmid_MotionDetection = (*env)->GetStaticMethodID(env, jcls, "motiondetection", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingSettingsState$Callback;I)V");
}

static int evt_ardrone3_PilotingSettingsState_MaxAltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_MaxAltitudeChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_MaxAltitudeChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_MaxTiltChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_MaxTiltChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_MaxTiltChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_AbsolutControlChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t on;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_AbsolutControlChanged(cmd, &on);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_AbsolutControlChanged, callback, (jint)on);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_MaxDistanceChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_MaxDistanceChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_MaxDistanceChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_NoFlyOverMaxDistanceChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t shouldNotFlyOver;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_NoFlyOverMaxDistanceChanged(cmd, &shouldNotFlyOver);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_NoFlyOverMaxDistanceChanged, callback, (jint)shouldNotFlyOver);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_BankedTurnChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_BankedTurnChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_BankedTurnChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_MinAltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_MinAltitudeChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_MinAltitudeChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_CirclingDirectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t value;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_CirclingDirectionChanged(cmd, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_CirclingDirectionChanged, callback, (jint)value);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_CirclingRadiusChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t current;
	uint16_t min;
	uint16_t max;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_CirclingRadiusChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_CirclingRadiusChanged, callback, (jint)current, (jint)min, (jint)max);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_CirclingAltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t current;
	uint16_t min;
	uint16_t max;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_CirclingAltitudeChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_CirclingAltitudeChanged, callback, (jint)current, (jint)min, (jint)max);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_PitchModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t value;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_PitchModeChanged(cmd, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_PitchModeChanged, callback, (jint)value);
	return 0;
}

static int evt_ardrone3_PilotingSettingsState_MotionDetection(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Ardrone3_PilotingSettingsState_MotionDetection(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingSettingsState_cache.jmid_MotionDetection, callback, (jint)enabled);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 6)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_PilotingSettingsState_MaxAltitudeChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_PilotingSettingsState_MaxTiltChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_PilotingSettingsState_AbsolutControlChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_PilotingSettingsState_MaxDistanceChanged(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_PilotingSettingsState_NoFlyOverMaxDistanceChanged(env, jcls, cmd, callback);
		case 10: return evt_ardrone3_PilotingSettingsState_BankedTurnChanged(env, jcls, cmd, callback);
		case 11: return evt_ardrone3_PilotingSettingsState_MinAltitudeChanged(env, jcls, cmd, callback);
		case 12: return evt_ardrone3_PilotingSettingsState_CirclingDirectionChanged(env, jcls, cmd, callback);
		case 13: return evt_ardrone3_PilotingSettingsState_CirclingRadiusChanged(env, jcls, cmd, callback);
		case 14: return evt_ardrone3_PilotingSettingsState_CirclingAltitudeChanged(env, jcls, cmd, callback);
		case 15: return evt_ardrone3_PilotingSettingsState_PitchModeChanged(env, jcls, cmd, callback);
		case 16: return evt_ardrone3_PilotingSettingsState_MotionDetection(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecord_nativeEncodePicture(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mass_storage_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_MediaRecord_Picture(cmd, mass_storage_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecord_nativeEncodeVideo(JNIEnv *env, jclass jcls, jlong nativeCmd, jint record, jint mass_storage_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_MediaRecord_Video(cmd, record, mass_storage_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecord_nativeEncodePictureV2(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_MediaRecord_PictureV2(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecord_nativeEncodeVideoV2(JNIEnv *env, jclass jcls, jlong nativeCmd, jint record) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_MediaRecord_VideoV2(cmd, record);
	return res;
}

static struct {
	jmethodID jmid_PictureStateChanged;
	jmethodID jmid_VideoStateChanged;
	jmethodID jmid_PictureStateChangedV2;
	jmethodID jmid_VideoStateChangedV2;
	jmethodID jmid_VideoResolutionState;
} s_cb_ardrone3_MediaRecordState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecordState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_MediaRecordState_cache.jmid_PictureStateChanged = (*env)->GetStaticMethodID(env, jcls, "picturestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordState$Callback;II)V");
	s_cb_ardrone3_MediaRecordState_cache.jmid_VideoStateChanged = (*env)->GetStaticMethodID(env, jcls, "videostatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordState$Callback;II)V");
	s_cb_ardrone3_MediaRecordState_cache.jmid_PictureStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "picturestatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordState$Callback;II)V");
	s_cb_ardrone3_MediaRecordState_cache.jmid_VideoStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "videostatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordState$Callback;II)V");
	s_cb_ardrone3_MediaRecordState_cache.jmid_VideoResolutionState = (*env)->GetStaticMethodID(env, jcls, "videoresolutionstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaRecordState$Callback;II)V");
}

static int evt_ardrone3_MediaRecordState_PictureStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	uint8_t mass_storage_id;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordState_PictureStateChanged(cmd, &state, &mass_storage_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordState_cache.jmid_PictureStateChanged, callback, (jint)state, (jint)mass_storage_id);
	return 0;
}

static int evt_ardrone3_MediaRecordState_VideoStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	uint8_t mass_storage_id;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordState_VideoStateChanged(cmd, &state, &mass_storage_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordState_cache.jmid_VideoStateChanged, callback, (jint)state, (jint)mass_storage_id);
	return 0;
}

static int evt_ardrone3_MediaRecordState_PictureStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordState_PictureStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordState_cache.jmid_PictureStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

static int evt_ardrone3_MediaRecordState_VideoStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordState_VideoStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordState_cache.jmid_VideoStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

static int evt_ardrone3_MediaRecordState_VideoResolutionState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t streaming;
	int32_t recording;
	int res = arsdk_cmd_dec_Ardrone3_MediaRecordState_VideoResolutionState(cmd, &streaming, &recording);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaRecordState_cache.jmid_VideoResolutionState, callback, (jint)streaming, (jint)recording);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaRecordState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 8)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_MediaRecordState_PictureStateChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_MediaRecordState_VideoStateChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_MediaRecordState_PictureStateChangedV2(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_MediaRecordState_VideoStateChangedV2(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_MediaRecordState_VideoResolutionState(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024NetworkSettings_nativeEncodeWifiSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jint band, jint channel) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_NetworkSettings_WifiSelection(cmd, type, band, channel);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024NetworkSettings_nativeEncodeWifiSecurity(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jstring key, jint keyType) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_key = (*env)->GetStringUTFChars(env, key, NULL);
	int res = arsdk_cmd_enc_Ardrone3_NetworkSettings_WifiSecurity(cmd, type, c_key, keyType);
	if (c_key != NULL) (*env)->ReleaseStringUTFChars(env, key, c_key);
	return res;
}

static struct {
	jmethodID jmid_WifiSelectionChanged;
	jmethodID jmid_wifiSecurityChanged;
	jmethodID jmid_wifiSecurity;
} s_cb_ardrone3_NetworkSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024NetworkSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_NetworkSettingsState_cache.jmid_WifiSelectionChanged = (*env)->GetStaticMethodID(env, jcls, "wifiselectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkSettingsState$Callback;III)V");
	s_cb_ardrone3_NetworkSettingsState_cache.jmid_wifiSecurityChanged = (*env)->GetStaticMethodID(env, jcls, "wifisecuritychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkSettingsState$Callback;I)V");
	s_cb_ardrone3_NetworkSettingsState_cache.jmid_wifiSecurity = (*env)->GetStaticMethodID(env, jcls, "wifisecurity", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkSettingsState$Callback;ILjava/lang/String;I)V");
}

static int evt_ardrone3_NetworkSettingsState_WifiSelectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Ardrone3_NetworkSettingsState_WifiSelectionChanged(cmd, &type, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkSettingsState_cache.jmid_WifiSelectionChanged, callback, (jint)type, (jint)band, (jint)channel);
	return 0;
}

static int evt_ardrone3_NetworkSettingsState_wifiSecurityChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Ardrone3_NetworkSettingsState_WifiSecurityChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkSettingsState_cache.jmid_wifiSecurityChanged, callback, (jint)type);
	return 0;
}

static int evt_ardrone3_NetworkSettingsState_wifiSecurity(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	const char * key;
	int32_t keyType;
	int res = arsdk_cmd_dec_Ardrone3_NetworkSettingsState_WifiSecurity(cmd, &type, &key, &keyType);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkSettingsState_cache.jmid_wifiSecurity, callback, (jint)type, (*env)->NewStringUTF(env, key), (jint)keyType);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024NetworkSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 10)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_NetworkSettingsState_WifiSelectionChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_NetworkSettingsState_wifiSecurityChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_NetworkSettingsState_wifiSecurity(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettings_nativeEncodeMaxVerticalSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_SpeedSettings_MaxVerticalSpeed(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettings_nativeEncodeMaxRotationSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_SpeedSettings_MaxRotationSpeed(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettings_nativeEncodeHullProtection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint present) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_SpeedSettings_HullProtection(cmd, present);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettings_nativeEncodeOutdoor(JNIEnv *env, jclass jcls, jlong nativeCmd, jint outdoor) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_SpeedSettings_Outdoor(cmd, outdoor);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettings_nativeEncodeMaxPitchRollRotationSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_SpeedSettings_MaxPitchRollRotationSpeed(cmd, current);
	return res;
}

static struct {
	jmethodID jmid_MaxVerticalSpeedChanged;
	jmethodID jmid_MaxRotationSpeedChanged;
	jmethodID jmid_HullProtectionChanged;
	jmethodID jmid_OutdoorChanged;
	jmethodID jmid_MaxPitchRollRotationSpeedChanged;
} s_cb_ardrone3_SpeedSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_SpeedSettingsState_cache.jmid_MaxVerticalSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxverticalspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SpeedSettingsState$Callback;FFF)V");
	s_cb_ardrone3_SpeedSettingsState_cache.jmid_MaxRotationSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxrotationspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SpeedSettingsState$Callback;FFF)V");
	s_cb_ardrone3_SpeedSettingsState_cache.jmid_HullProtectionChanged = (*env)->GetStaticMethodID(env, jcls, "hullprotectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SpeedSettingsState$Callback;I)V");
	s_cb_ardrone3_SpeedSettingsState_cache.jmid_OutdoorChanged = (*env)->GetStaticMethodID(env, jcls, "outdoorchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SpeedSettingsState$Callback;I)V");
	s_cb_ardrone3_SpeedSettingsState_cache.jmid_MaxPitchRollRotationSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxpitchrollrotationspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SpeedSettingsState$Callback;FFF)V");
}

static int evt_ardrone3_SpeedSettingsState_MaxVerticalSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_SpeedSettingsState_MaxVerticalSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SpeedSettingsState_cache.jmid_MaxVerticalSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_SpeedSettingsState_MaxRotationSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_SpeedSettingsState_MaxRotationSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SpeedSettingsState_cache.jmid_MaxRotationSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_SpeedSettingsState_HullProtectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t present;
	int res = arsdk_cmd_dec_Ardrone3_SpeedSettingsState_HullProtectionChanged(cmd, &present);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SpeedSettingsState_cache.jmid_HullProtectionChanged, callback, (jint)present);
	return 0;
}

static int evt_ardrone3_SpeedSettingsState_OutdoorChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t outdoor;
	int res = arsdk_cmd_dec_Ardrone3_SpeedSettingsState_OutdoorChanged(cmd, &outdoor);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SpeedSettingsState_cache.jmid_OutdoorChanged, callback, (jint)outdoor);
	return 0;
}

static int evt_ardrone3_SpeedSettingsState_MaxPitchRollRotationSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_SpeedSettingsState_MaxPitchRollRotationSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SpeedSettingsState_cache.jmid_MaxPitchRollRotationSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SpeedSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 12)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_SpeedSettingsState_MaxVerticalSpeedChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_SpeedSettingsState_MaxRotationSpeedChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_SpeedSettingsState_HullProtectionChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_SpeedSettingsState_OutdoorChanged(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_SpeedSettingsState_MaxPitchRollRotationSpeedChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Network_nativeEncodeWifiScan(JNIEnv *env, jclass jcls, jlong nativeCmd, jint band) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Network_WifiScan(cmd, band);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Network_nativeEncodeWifiAuthChannel(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Network_WifiAuthChannel(cmd);
	return res;
}

static struct {
	jmethodID jmid_WifiScanListChanged;
	jmethodID jmid_AllWifiScanChanged;
	jmethodID jmid_WifiAuthChannelListChanged;
	jmethodID jmid_AllWifiAuthChannelChanged;
} s_cb_ardrone3_NetworkState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024NetworkState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_NetworkState_cache.jmid_WifiScanListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiscanlistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkState$Callback;Ljava/lang/String;III)V");
	s_cb_ardrone3_NetworkState_cache.jmid_AllWifiScanChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiscanchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkState$Callback;)V");
	s_cb_ardrone3_NetworkState_cache.jmid_WifiAuthChannelListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiauthchannellistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkState$Callback;III)V");
	s_cb_ardrone3_NetworkState_cache.jmid_AllWifiAuthChannelChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiauthchannelchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$NetworkState$Callback;)V");
}

static int evt_ardrone3_NetworkState_WifiScanListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * ssid;
	int16_t rssi;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Ardrone3_NetworkState_WifiScanListChanged(cmd, &ssid, &rssi, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkState_cache.jmid_WifiScanListChanged, callback, (*env)->NewStringUTF(env, ssid), (jint)rssi, (jint)band, (jint)channel);
	return 0;
}

static int evt_ardrone3_NetworkState_AllWifiScanChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Ardrone3_NetworkState_AllWifiScanChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkState_cache.jmid_AllWifiScanChanged, callback);
	return 0;
}

static int evt_ardrone3_NetworkState_WifiAuthChannelListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t band;
	uint8_t channel;
	uint8_t in_or_out;
	int res = arsdk_cmd_dec_Ardrone3_NetworkState_WifiAuthChannelListChanged(cmd, &band, &channel, &in_or_out);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkState_cache.jmid_WifiAuthChannelListChanged, callback, (jint)band, (jint)channel, (jint)in_or_out);
	return 0;
}

static int evt_ardrone3_NetworkState_AllWifiAuthChannelChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Ardrone3_NetworkState_AllWifiAuthChannelChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_NetworkState_cache.jmid_AllWifiAuthChannelChanged, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024NetworkState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 14)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_NetworkState_WifiScanListChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_NetworkState_AllWifiScanChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_NetworkState_WifiAuthChannelListChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_NetworkState_AllWifiAuthChannelChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_ProductMotorVersionListChanged;
	jmethodID jmid_ProductGPSVersionChanged;
	jmethodID jmid_MotorErrorStateChanged;
	jmethodID jmid_MotorSoftwareVersionChanged;
	jmethodID jmid_MotorFlightsStatusChanged;
	jmethodID jmid_MotorErrorLastErrorChanged;
	jmethodID jmid_P7ID;
	jmethodID jmid_CPUID;
} s_cb_ardrone3_SettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_SettingsState_cache.jmid_ProductMotorVersionListChanged = (*env)->GetStaticMethodID(env, jcls, "productmotorversionlistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_ardrone3_SettingsState_cache.jmid_ProductGPSVersionChanged = (*env)->GetStaticMethodID(env, jcls, "productgpsversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_ardrone3_SettingsState_cache.jmid_MotorErrorStateChanged = (*env)->GetStaticMethodID(env, jcls, "motorerrorstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;II)V");
	s_cb_ardrone3_SettingsState_cache.jmid_MotorSoftwareVersionChanged = (*env)->GetStaticMethodID(env, jcls, "motorsoftwareversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_ardrone3_SettingsState_cache.jmid_MotorFlightsStatusChanged = (*env)->GetStaticMethodID(env, jcls, "motorflightsstatuschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;IIJ)V");
	s_cb_ardrone3_SettingsState_cache.jmid_MotorErrorLastErrorChanged = (*env)->GetStaticMethodID(env, jcls, "motorerrorlasterrorchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;I)V");
	s_cb_ardrone3_SettingsState_cache.jmid_P7ID = (*env)->GetStaticMethodID(env, jcls, "p7id", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_ardrone3_SettingsState_cache.jmid_CPUID = (*env)->GetStaticMethodID(env, jcls, "cpuid", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SettingsState$Callback;Ljava/lang/String;)V");
}

static int evt_ardrone3_SettingsState_ProductMotorVersionListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t motor_number;
	const char * type;
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_ProductMotorVersionListChanged(cmd, &motor_number, &type, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_ProductMotorVersionListChanged, callback, (jint)motor_number, (*env)->NewStringUTF(env, type), (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_ardrone3_SettingsState_ProductGPSVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_ProductGPSVersionChanged(cmd, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_ProductGPSVersionChanged, callback, (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_ardrone3_SettingsState_MotorErrorStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t motorIds;
	int32_t motorError;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_MotorErrorStateChanged(cmd, &motorIds, &motorError);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_MotorErrorStateChanged, callback, (jint)motorIds, (jint)motorError);
	return 0;
}

static int evt_ardrone3_SettingsState_MotorSoftwareVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * version;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_MotorSoftwareVersionChanged(cmd, &version);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_MotorSoftwareVersionChanged, callback, (*env)->NewStringUTF(env, version));
	return 0;
}

static int evt_ardrone3_SettingsState_MotorFlightsStatusChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t nbFlights;
	uint16_t lastFlightDuration;
	uint32_t totalFlightDuration;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_MotorFlightsStatusChanged(cmd, &nbFlights, &lastFlightDuration, &totalFlightDuration);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_MotorFlightsStatusChanged, callback, (jint)nbFlights, (jint)lastFlightDuration, (jlong)totalFlightDuration);
	return 0;
}

static int evt_ardrone3_SettingsState_MotorErrorLastErrorChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t motorError;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_MotorErrorLastErrorChanged(cmd, &motorError);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_MotorErrorLastErrorChanged, callback, (jint)motorError);
	return 0;
}

static int evt_ardrone3_SettingsState_P7ID(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serialID;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_P7ID(cmd, &serialID);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_P7ID, callback, (*env)->NewStringUTF(env, serialID));
	return 0;
}

static int evt_ardrone3_SettingsState_CPUID(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * id;
	int res = arsdk_cmd_dec_Ardrone3_SettingsState_CPUID(cmd, &id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SettingsState_cache.jmid_CPUID, callback, (*env)->NewStringUTF(env, id));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 16)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_SettingsState_ProductMotorVersionListChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_SettingsState_ProductGPSVersionChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_SettingsState_MotorErrorStateChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_SettingsState_MotorSoftwareVersionChanged(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_SettingsState_MotorFlightsStatusChanged(env, jcls, cmd, callback);
		case 5: return evt_ardrone3_SettingsState_MotorErrorLastErrorChanged(env, jcls, cmd, callback);
		case 6: return evt_ardrone3_SettingsState_P7ID(env, jcls, cmd, callback);
		case 7: return evt_ardrone3_SettingsState_CPUID(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodePictureFormatSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_PictureFormatSelection(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeAutoWhiteBalanceSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_AutoWhiteBalanceSelection(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeExpositionSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_ExpositionSelection(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeSaturationSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_SaturationSelection(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeTimelapseSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enabled, jfloat interval) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_TimelapseSelection(cmd, enabled, interval);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeVideoAutorecordSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enabled, jint mass_storage_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_VideoAutorecordSelection(cmd, enabled, mass_storage_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeVideoStabilizationMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_VideoStabilizationMode(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeVideoRecordingMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_VideoRecordingMode(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeVideoFramerate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint framerate) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_VideoFramerate(cmd, framerate);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettings_nativeEncodeVideoResolutions(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_PictureSettings_VideoResolutions(cmd, type);
	return res;
}

static struct {
	jmethodID jmid_PictureFormatChanged;
	jmethodID jmid_AutoWhiteBalanceChanged;
	jmethodID jmid_ExpositionChanged;
	jmethodID jmid_SaturationChanged;
	jmethodID jmid_TimelapseChanged;
	jmethodID jmid_VideoAutorecordChanged;
	jmethodID jmid_VideoStabilizationModeChanged;
	jmethodID jmid_VideoRecordingModeChanged;
	jmethodID jmid_VideoFramerateChanged;
	jmethodID jmid_VideoResolutionsChanged;
} s_cb_ardrone3_PictureSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_PictureSettingsState_cache.jmid_PictureFormatChanged = (*env)->GetStaticMethodID(env, jcls, "pictureformatchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;I)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_AutoWhiteBalanceChanged = (*env)->GetStaticMethodID(env, jcls, "autowhitebalancechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;I)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_ExpositionChanged = (*env)->GetStaticMethodID(env, jcls, "expositionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;FFF)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_SaturationChanged = (*env)->GetStaticMethodID(env, jcls, "saturationchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;FFF)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_TimelapseChanged = (*env)->GetStaticMethodID(env, jcls, "timelapsechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;IFFF)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoAutorecordChanged = (*env)->GetStaticMethodID(env, jcls, "videoautorecordchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;II)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoStabilizationModeChanged = (*env)->GetStaticMethodID(env, jcls, "videostabilizationmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;I)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoRecordingModeChanged = (*env)->GetStaticMethodID(env, jcls, "videorecordingmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;I)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoFramerateChanged = (*env)->GetStaticMethodID(env, jcls, "videoframeratechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;I)V");
	s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoResolutionsChanged = (*env)->GetStaticMethodID(env, jcls, "videoresolutionschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PictureSettingsState$Callback;I)V");
}

static int evt_ardrone3_PictureSettingsState_PictureFormatChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_PictureFormatChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_PictureFormatChanged, callback, (jint)type);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_AutoWhiteBalanceChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_AutoWhiteBalanceChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_AutoWhiteBalanceChanged, callback, (jint)type);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_ExpositionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float value;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_ExpositionChanged(cmd, &value, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_ExpositionChanged, callback, (jfloat)value, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_SaturationChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float value;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_SaturationChanged(cmd, &value, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_SaturationChanged, callback, (jfloat)value, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_TimelapseChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	float interval;
	float minInterval;
	float maxInterval;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_TimelapseChanged(cmd, &enabled, &interval, &minInterval, &maxInterval);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_TimelapseChanged, callback, (jint)enabled, (jfloat)interval, (jfloat)minInterval, (jfloat)maxInterval);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_VideoAutorecordChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	uint8_t mass_storage_id;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_VideoAutorecordChanged(cmd, &enabled, &mass_storage_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoAutorecordChanged, callback, (jint)enabled, (jint)mass_storage_id);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_VideoStabilizationModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_VideoStabilizationModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoStabilizationModeChanged, callback, (jint)mode);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_VideoRecordingModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_VideoRecordingModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoRecordingModeChanged, callback, (jint)mode);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_VideoFramerateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t framerate;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_VideoFramerateChanged(cmd, &framerate);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoFramerateChanged, callback, (jint)framerate);
	return 0;
}

static int evt_ardrone3_PictureSettingsState_VideoResolutionsChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Ardrone3_PictureSettingsState_VideoResolutionsChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PictureSettingsState_cache.jmid_VideoResolutionsChanged, callback, (jint)type);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PictureSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 20)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_PictureSettingsState_PictureFormatChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_PictureSettingsState_AutoWhiteBalanceChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_PictureSettingsState_ExpositionChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_PictureSettingsState_SaturationChanged(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_PictureSettingsState_TimelapseChanged(env, jcls, cmd, callback);
		case 5: return evt_ardrone3_PictureSettingsState_VideoAutorecordChanged(env, jcls, cmd, callback);
		case 6: return evt_ardrone3_PictureSettingsState_VideoStabilizationModeChanged(env, jcls, cmd, callback);
		case 7: return evt_ardrone3_PictureSettingsState_VideoRecordingModeChanged(env, jcls, cmd, callback);
		case 8: return evt_ardrone3_PictureSettingsState_VideoFramerateChanged(env, jcls, cmd, callback);
		case 9: return evt_ardrone3_PictureSettingsState_VideoResolutionsChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaStreaming_nativeEncodeVideoEnable(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_MediaStreaming_VideoEnable(cmd, enable);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaStreaming_nativeEncodeVideoStreamMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_MediaStreaming_VideoStreamMode(cmd, mode);
	return res;
}

static struct {
	jmethodID jmid_VideoEnableChanged;
	jmethodID jmid_VideoStreamModeChanged;
} s_cb_ardrone3_MediaStreamingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaStreamingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_MediaStreamingState_cache.jmid_VideoEnableChanged = (*env)->GetStaticMethodID(env, jcls, "videoenablechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaStreamingState$Callback;I)V");
	s_cb_ardrone3_MediaStreamingState_cache.jmid_VideoStreamModeChanged = (*env)->GetStaticMethodID(env, jcls, "videostreammodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$MediaStreamingState$Callback;I)V");
}

static int evt_ardrone3_MediaStreamingState_VideoEnableChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t enabled;
	int res = arsdk_cmd_dec_Ardrone3_MediaStreamingState_VideoEnableChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaStreamingState_cache.jmid_VideoEnableChanged, callback, (jint)enabled);
	return 0;
}

static int evt_ardrone3_MediaStreamingState_VideoStreamModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Ardrone3_MediaStreamingState_VideoStreamModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_MediaStreamingState_cache.jmid_VideoStreamModeChanged, callback, (jint)mode);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024MediaStreamingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 22)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_MediaStreamingState_VideoEnableChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_MediaStreamingState_VideoStreamModeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettings_nativeEncodeSetHome(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jdouble altitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_GPSSettings_SetHome(cmd, latitude, longitude, altitude);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettings_nativeEncodeResetHome(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_GPSSettings_ResetHome(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettings_nativeEncodeSendControllerGPS(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude, jdouble altitude, jdouble horizontalAccuracy, jdouble verticalAccuracy) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_GPSSettings_SendControllerGPS(cmd, latitude, longitude, altitude, horizontalAccuracy, verticalAccuracy);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettings_nativeEncodeHomeType(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_GPSSettings_HomeType(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettings_nativeEncodeReturnHomeDelay(JNIEnv *env, jclass jcls, jlong nativeCmd, jint delay) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_GPSSettings_ReturnHomeDelay(cmd, delay);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettings_nativeEncodeReturnHomeMinAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_GPSSettings_ReturnHomeMinAltitude(cmd, value);
	return res;
}

static struct {
	jmethodID jmid_HomeChanged;
	jmethodID jmid_ResetHomeChanged;
	jmethodID jmid_GPSFixStateChanged;
	jmethodID jmid_GPSUpdateStateChanged;
	jmethodID jmid_HomeTypeChanged;
	jmethodID jmid_ReturnHomeDelayChanged;
	jmethodID jmid_GeofenceCenterChanged;
	jmethodID jmid_ReturnHomeMinAltitudeChanged;
} s_cb_ardrone3_GPSSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_GPSSettingsState_cache.jmid_HomeChanged = (*env)->GetStaticMethodID(env, jcls, "homechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;DDD)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_ResetHomeChanged = (*env)->GetStaticMethodID(env, jcls, "resethomechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;DDD)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_GPSFixStateChanged = (*env)->GetStaticMethodID(env, jcls, "gpsfixstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;I)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_GPSUpdateStateChanged = (*env)->GetStaticMethodID(env, jcls, "gpsupdatestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;I)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_HomeTypeChanged = (*env)->GetStaticMethodID(env, jcls, "hometypechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;I)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_ReturnHomeDelayChanged = (*env)->GetStaticMethodID(env, jcls, "returnhomedelaychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;I)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_GeofenceCenterChanged = (*env)->GetStaticMethodID(env, jcls, "geofencecenterchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;DD)V");
	s_cb_ardrone3_GPSSettingsState_cache.jmid_ReturnHomeMinAltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "returnhomeminaltitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSSettingsState$Callback;FFF)V");
}

static int evt_ardrone3_GPSSettingsState_HomeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_HomeChanged(cmd, &latitude, &longitude, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_HomeChanged, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_ResetHomeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_ResetHomeChanged(cmd, &latitude, &longitude, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_ResetHomeChanged, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_GPSFixStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t fixed;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_GPSFixStateChanged(cmd, &fixed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_GPSFixStateChanged, callback, (jint)fixed);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_GPSUpdateStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_GPSUpdateStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_GPSUpdateStateChanged, callback, (jint)state);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_HomeTypeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_HomeTypeChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_HomeTypeChanged, callback, (jint)type);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_ReturnHomeDelayChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t delay;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_ReturnHomeDelayChanged(cmd, &delay);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_ReturnHomeDelayChanged, callback, (jint)delay);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_GeofenceCenterChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_GeofenceCenterChanged(cmd, &latitude, &longitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_GeofenceCenterChanged, callback, (jdouble)latitude, (jdouble)longitude);
	return 0;
}

static int evt_ardrone3_GPSSettingsState_ReturnHomeMinAltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float value;
	float min;
	float max;
	int res = arsdk_cmd_dec_Ardrone3_GPSSettingsState_ReturnHomeMinAltitudeChanged(cmd, &value, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSSettingsState_cache.jmid_ReturnHomeMinAltitudeChanged, callback, (jfloat)value, (jfloat)min, (jfloat)max);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 24)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_GPSSettingsState_HomeChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_GPSSettingsState_ResetHomeChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_GPSSettingsState_GPSFixStateChanged(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_GPSSettingsState_GPSUpdateStateChanged(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_GPSSettingsState_HomeTypeChanged(env, jcls, cmd, callback);
		case 5: return evt_ardrone3_GPSSettingsState_ReturnHomeDelayChanged(env, jcls, cmd, callback);
		case 6: return evt_ardrone3_GPSSettingsState_GeofenceCenterChanged(env, jcls, cmd, callback);
		case 7: return evt_ardrone3_GPSSettingsState_ReturnHomeMinAltitudeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_Orientation;
	jmethodID jmid_defaultCameraOrientation;
	jmethodID jmid_OrientationV2;
	jmethodID jmid_defaultCameraOrientationV2;
	jmethodID jmid_VelocityRange;
} s_cb_ardrone3_CameraState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024CameraState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_CameraState_cache.jmid_Orientation = (*env)->GetStaticMethodID(env, jcls, "orientation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$CameraState$Callback;II)V");
	s_cb_ardrone3_CameraState_cache.jmid_defaultCameraOrientation = (*env)->GetStaticMethodID(env, jcls, "defaultcameraorientation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$CameraState$Callback;II)V");
	s_cb_ardrone3_CameraState_cache.jmid_OrientationV2 = (*env)->GetStaticMethodID(env, jcls, "orientationv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$CameraState$Callback;FF)V");
	s_cb_ardrone3_CameraState_cache.jmid_defaultCameraOrientationV2 = (*env)->GetStaticMethodID(env, jcls, "defaultcameraorientationv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$CameraState$Callback;FF)V");
	s_cb_ardrone3_CameraState_cache.jmid_VelocityRange = (*env)->GetStaticMethodID(env, jcls, "velocityrange", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$CameraState$Callback;FF)V");
}

static int evt_ardrone3_CameraState_Orientation(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int8_t tilt;
	int8_t pan;
	int res = arsdk_cmd_dec_Ardrone3_CameraState_Orientation(cmd, &tilt, &pan);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_CameraState_cache.jmid_Orientation, callback, (jint)tilt, (jint)pan);
	return 0;
}

static int evt_ardrone3_CameraState_defaultCameraOrientation(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int8_t tilt;
	int8_t pan;
	int res = arsdk_cmd_dec_Ardrone3_CameraState_DefaultCameraOrientation(cmd, &tilt, &pan);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_CameraState_cache.jmid_defaultCameraOrientation, callback, (jint)tilt, (jint)pan);
	return 0;
}

static int evt_ardrone3_CameraState_OrientationV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float tilt;
	float pan;
	int res = arsdk_cmd_dec_Ardrone3_CameraState_OrientationV2(cmd, &tilt, &pan);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_CameraState_cache.jmid_OrientationV2, callback, (jfloat)tilt, (jfloat)pan);
	return 0;
}

static int evt_ardrone3_CameraState_defaultCameraOrientationV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float tilt;
	float pan;
	int res = arsdk_cmd_dec_Ardrone3_CameraState_DefaultCameraOrientationV2(cmd, &tilt, &pan);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_CameraState_cache.jmid_defaultCameraOrientationV2, callback, (jfloat)tilt, (jfloat)pan);
	return 0;
}

static int evt_ardrone3_CameraState_VelocityRange(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float max_tilt;
	float max_pan;
	int res = arsdk_cmd_dec_Ardrone3_CameraState_VelocityRange(cmd, &max_tilt, &max_pan);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_CameraState_cache.jmid_VelocityRange, callback, (jfloat)max_tilt, (jfloat)max_pan);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024CameraState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 25)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_CameraState_Orientation(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_CameraState_defaultCameraOrientation(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_CameraState_OrientationV2(env, jcls, cmd, callback);
		case 3: return evt_ardrone3_CameraState_defaultCameraOrientationV2(env, jcls, cmd, callback);
		case 4: return evt_ardrone3_CameraState_VelocityRange(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Antiflickering_nativeEncodeElectricFrequency(JNIEnv *env, jclass jcls, jlong nativeCmd, jint frequency) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Antiflickering_ElectricFrequency(cmd, frequency);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Antiflickering_nativeEncodeSetMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Antiflickering_SetMode(cmd, mode);
	return res;
}

static struct {
	jmethodID jmid_electricFrequencyChanged;
	jmethodID jmid_modeChanged;
} s_cb_ardrone3_AntiflickeringState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024AntiflickeringState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_AntiflickeringState_cache.jmid_electricFrequencyChanged = (*env)->GetStaticMethodID(env, jcls, "electricfrequencychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$AntiflickeringState$Callback;I)V");
	s_cb_ardrone3_AntiflickeringState_cache.jmid_modeChanged = (*env)->GetStaticMethodID(env, jcls, "modechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$AntiflickeringState$Callback;I)V");
}

static int evt_ardrone3_AntiflickeringState_electricFrequencyChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t frequency;
	int res = arsdk_cmd_dec_Ardrone3_AntiflickeringState_ElectricFrequencyChanged(cmd, &frequency);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_AntiflickeringState_cache.jmid_electricFrequencyChanged, callback, (jint)frequency);
	return 0;
}

static int evt_ardrone3_AntiflickeringState_modeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Ardrone3_AntiflickeringState_ModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_AntiflickeringState_cache.jmid_modeChanged, callback, (jint)mode);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024AntiflickeringState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 30)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_AntiflickeringState_electricFrequencyChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_AntiflickeringState_modeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_NumberOfSatelliteChanged;
	jmethodID jmid_HomeTypeAvailabilityChanged;
	jmethodID jmid_HomeTypeChosenChanged;
} s_cb_ardrone3_GPSState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_GPSState_cache.jmid_NumberOfSatelliteChanged = (*env)->GetStaticMethodID(env, jcls, "numberofsatellitechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSState$Callback;I)V");
	s_cb_ardrone3_GPSState_cache.jmid_HomeTypeAvailabilityChanged = (*env)->GetStaticMethodID(env, jcls, "hometypeavailabilitychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSState$Callback;II)V");
	s_cb_ardrone3_GPSState_cache.jmid_HomeTypeChosenChanged = (*env)->GetStaticMethodID(env, jcls, "hometypechosenchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$GPSState$Callback;I)V");
}

static int evt_ardrone3_GPSState_NumberOfSatelliteChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t numberOfSatellite;
	int res = arsdk_cmd_dec_Ardrone3_GPSState_NumberOfSatelliteChanged(cmd, &numberOfSatellite);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSState_cache.jmid_NumberOfSatelliteChanged, callback, (jint)numberOfSatellite);
	return 0;
}

static int evt_ardrone3_GPSState_HomeTypeAvailabilityChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	uint8_t available;
	int res = arsdk_cmd_dec_Ardrone3_GPSState_HomeTypeAvailabilityChanged(cmd, &type, &available);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSState_cache.jmid_HomeTypeAvailabilityChanged, callback, (jint)type, (jint)available);
	return 0;
}

static int evt_ardrone3_GPSState_HomeTypeChosenChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Ardrone3_GPSState_HomeTypeChosenChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_GPSState_cache.jmid_HomeTypeChosenChanged, callback, (jint)type);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024GPSState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 31)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_GPSState_NumberOfSatelliteChanged(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_GPSState_HomeTypeAvailabilityChanged(env, jcls, cmd, callback);
		case 2: return evt_ardrone3_GPSState_HomeTypeChosenChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_Features;
} s_cb_ardrone3_PROState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PROState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_PROState_cache.jmid_Features = (*env)->GetStaticMethodID(env, jcls, "features", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PROState$Callback;J)V");
}

static int evt_ardrone3_PROState_Features(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint64_t features;
	int res = arsdk_cmd_dec_Ardrone3_PROState_Features(cmd, &features);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PROState_cache.jmid_Features, callback, (jlong)features);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PROState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 32)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_PROState_Features(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_ConnectedAccessories;
	jmethodID jmid_Battery;
} s_cb_ardrone3_AccessoryState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024AccessoryState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_AccessoryState_cache.jmid_ConnectedAccessories = (*env)->GetStaticMethodID(env, jcls, "connectedaccessories", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$AccessoryState$Callback;IILjava/lang/String;Ljava/lang/String;I)V");
	s_cb_ardrone3_AccessoryState_cache.jmid_Battery = (*env)->GetStaticMethodID(env, jcls, "battery", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$AccessoryState$Callback;III)V");
}

static int evt_ardrone3_AccessoryState_ConnectedAccessories(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t id;
	int32_t accessory_type;
	const char * uid;
	const char * swVersion;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Ardrone3_AccessoryState_ConnectedAccessories(cmd, &id, &accessory_type, &uid, &swVersion, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_AccessoryState_cache.jmid_ConnectedAccessories, callback, (jint)id, (jint)accessory_type, (*env)->NewStringUTF(env, uid), (*env)->NewStringUTF(env, swVersion), (jint)list_flags);
	return 0;
}

static int evt_ardrone3_AccessoryState_Battery(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t id;
	uint8_t batteryLevel;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Ardrone3_AccessoryState_Battery(cmd, &id, &batteryLevel, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_AccessoryState_cache.jmid_Battery, callback, (jint)id, (jint)batteryLevel, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024AccessoryState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 33)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_AccessoryState_ConnectedAccessories(env, jcls, cmd, callback);
		case 1: return evt_ardrone3_AccessoryState_Battery(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_moveByEnd;
} s_cb_ardrone3_PilotingEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_PilotingEvent_cache.jmid_moveByEnd = (*env)->GetStaticMethodID(env, jcls, "movebyend", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$PilotingEvent$Callback;FFFFI)V");
}

static int evt_ardrone3_PilotingEvent_moveByEnd(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float dX;
	float dY;
	float dZ;
	float dPsi;
	int32_t error;
	int res = arsdk_cmd_dec_Ardrone3_PilotingEvent_MoveByEnd(cmd, &dX, &dY, &dZ, &dPsi, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_PilotingEvent_cache.jmid_moveByEnd, callback, (jfloat)dX, (jfloat)dY, (jfloat)dZ, (jfloat)dPsi, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024PilotingEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 34)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_PilotingEvent_moveByEnd(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Sound_nativeEncodeStartAlertSound(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Sound_StartAlertSound(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024Sound_nativeEncodeStopAlertSound(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Ardrone3_Sound_StopAlertSound(cmd);
	return res;
}

static struct {
	jmethodID jmid_AlertSound;
} s_cb_ardrone3_SoundState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SoundState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_ardrone3_SoundState_cache.jmid_AlertSound = (*env)->GetStaticMethodID(env, jcls, "alertsound", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureArdrone3$SoundState$Callback;I)V");
}

static int evt_ardrone3_SoundState_AlertSound(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Ardrone3_SoundState_AlertSound(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_ardrone3_SoundState_cache.jmid_AlertSound, callback, (jint)state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureArdrone3_00024SoundState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 1 || cmd->cls_id != 36)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_ardrone3_SoundState_AlertSound(env, jcls, cmd, callback);
	}
	return -1;
}

