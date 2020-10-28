/** Generated, do not edit ! */

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeFlatTrim(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_FlatTrim(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeTakeOff(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_TakeOff(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodePCMD(JNIEnv *env, jclass jcls, jlong nativeCmd, jint flag, jint roll, jint pitch, jint yaw, jint gaz, jlong timestamp) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_PCMD(cmd, flag, roll, pitch, yaw, gaz, timestamp);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeLanding(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_Landing(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeEmergency(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_Emergency(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeAutoTakeOffMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint state) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_AutoTakeOffMode(cmd, state);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeFlyingMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_FlyingMode(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodePlaneGearBox(JNIEnv *env, jclass jcls, jlong nativeCmd, jint state) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_PlaneGearBox(cmd, state);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Piloting_nativeEncodeTogglePilotingMode(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Piloting_TogglePilotingMode(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettings_nativeEncodeMaxVerticalSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_SpeedSettings_MaxVerticalSpeed(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettings_nativeEncodeMaxRotationSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_SpeedSettings_MaxRotationSpeed(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettings_nativeEncodeWheels(JNIEnv *env, jclass jcls, jlong nativeCmd, jint present) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_SpeedSettings_Wheels(cmd, present);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettings_nativeEncodeMaxHorizontalSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_SpeedSettings_MaxHorizontalSpeed(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettings_nativeEncodeMaxPlaneModeRotationSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_SpeedSettings_MaxPlaneModeRotationSpeed(cmd, current);
	return res;
}

static struct {
	jmethodID jmid_PictureEventChanged;
} s_cb_minidrone_MediaRecordEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MediaRecordEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_MediaRecordEvent_cache.jmid_PictureEventChanged = (*env)->GetStaticMethodID(env, jcls, "pictureeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MediaRecordEvent$Callback;II)V");
}

static int evt_minidrone_MediaRecordEvent_PictureEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Minidrone_MediaRecordEvent_PictureEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MediaRecordEvent_cache.jmid_PictureEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MediaRecordEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 2)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_MediaRecordEvent_PictureEventChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_FlatTrimChanged;
	jmethodID jmid_FlyingStateChanged;
	jmethodID jmid_AlertStateChanged;
	jmethodID jmid_AutoTakeOffModeChanged;
	jmethodID jmid_FlyingModeChanged;
	jmethodID jmid_PlaneGearBoxChanged;
	jmethodID jmid_PilotingModeChanged;
} s_cb_minidrone_PilotingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_PilotingState_cache.jmid_FlatTrimChanged = (*env)->GetStaticMethodID(env, jcls, "flattrimchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;)V");
	s_cb_minidrone_PilotingState_cache.jmid_FlyingStateChanged = (*env)->GetStaticMethodID(env, jcls, "flyingstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;I)V");
	s_cb_minidrone_PilotingState_cache.jmid_AlertStateChanged = (*env)->GetStaticMethodID(env, jcls, "alertstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;I)V");
	s_cb_minidrone_PilotingState_cache.jmid_AutoTakeOffModeChanged = (*env)->GetStaticMethodID(env, jcls, "autotakeoffmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;I)V");
	s_cb_minidrone_PilotingState_cache.jmid_FlyingModeChanged = (*env)->GetStaticMethodID(env, jcls, "flyingmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;I)V");
	s_cb_minidrone_PilotingState_cache.jmid_PlaneGearBoxChanged = (*env)->GetStaticMethodID(env, jcls, "planegearboxchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;I)V");
	s_cb_minidrone_PilotingState_cache.jmid_PilotingModeChanged = (*env)->GetStaticMethodID(env, jcls, "pilotingmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingState$Callback;I)V");
}

static int evt_minidrone_PilotingState_FlatTrimChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Minidrone_PilotingState_FlatTrimChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_FlatTrimChanged, callback);
	return 0;
}

static int evt_minidrone_PilotingState_FlyingStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Minidrone_PilotingState_FlyingStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_FlyingStateChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_PilotingState_AlertStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Minidrone_PilotingState_AlertStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_AlertStateChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_PilotingState_AutoTakeOffModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Minidrone_PilotingState_AutoTakeOffModeChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_AutoTakeOffModeChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_PilotingState_FlyingModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Minidrone_PilotingState_FlyingModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_FlyingModeChanged, callback, (jint)mode);
	return 0;
}

static int evt_minidrone_PilotingState_PlaneGearBoxChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Minidrone_PilotingState_PlaneGearBoxChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_PlaneGearBoxChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_PilotingState_PilotingModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Minidrone_PilotingState_PilotingModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingState_cache.jmid_PilotingModeChanged, callback, (jint)mode);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 3)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_PilotingState_FlatTrimChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_PilotingState_FlyingStateChanged(env, jcls, cmd, callback);
		case 2: return evt_minidrone_PilotingState_AlertStateChanged(env, jcls, cmd, callback);
		case 3: return evt_minidrone_PilotingState_AutoTakeOffModeChanged(env, jcls, cmd, callback);
		case 4: return evt_minidrone_PilotingState_FlyingModeChanged(env, jcls, cmd, callback);
		case 5: return evt_minidrone_PilotingState_PlaneGearBoxChanged(env, jcls, cmd, callback);
		case 6: return evt_minidrone_PilotingState_PilotingModeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Animations_nativeEncodeFlip(JNIEnv *env, jclass jcls, jlong nativeCmd, jint direction) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Animations_Flip(cmd, direction);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Animations_nativeEncodeCap(JNIEnv *env, jclass jcls, jlong nativeCmd, jint offset) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Animations_Cap(cmd, offset);
	return res;
}

static struct {
	jmethodID jmid_MaxVerticalSpeedChanged;
	jmethodID jmid_MaxRotationSpeedChanged;
	jmethodID jmid_WheelsChanged;
	jmethodID jmid_MaxHorizontalSpeedChanged;
	jmethodID jmid_MaxPlaneModeRotationSpeedChanged;
} s_cb_minidrone_SpeedSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxVerticalSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxverticalspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SpeedSettingsState$Callback;FFF)V");
	s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxRotationSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxrotationspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SpeedSettingsState$Callback;FFF)V");
	s_cb_minidrone_SpeedSettingsState_cache.jmid_WheelsChanged = (*env)->GetStaticMethodID(env, jcls, "wheelschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SpeedSettingsState$Callback;I)V");
	s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxHorizontalSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxhorizontalspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SpeedSettingsState$Callback;FFF)V");
	s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxPlaneModeRotationSpeedChanged = (*env)->GetStaticMethodID(env, jcls, "maxplanemoderotationspeedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SpeedSettingsState$Callback;FFF)V");
}

static int evt_minidrone_SpeedSettingsState_MaxVerticalSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Minidrone_SpeedSettingsState_MaxVerticalSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxVerticalSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_minidrone_SpeedSettingsState_MaxRotationSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Minidrone_SpeedSettingsState_MaxRotationSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxRotationSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_minidrone_SpeedSettingsState_WheelsChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t present;
	int res = arsdk_cmd_dec_Minidrone_SpeedSettingsState_WheelsChanged(cmd, &present);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SpeedSettingsState_cache.jmid_WheelsChanged, callback, (jint)present);
	return 0;
}

static int evt_minidrone_SpeedSettingsState_MaxHorizontalSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Minidrone_SpeedSettingsState_MaxHorizontalSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxHorizontalSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_minidrone_SpeedSettingsState_MaxPlaneModeRotationSpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Minidrone_SpeedSettingsState_MaxPlaneModeRotationSpeedChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SpeedSettingsState_cache.jmid_MaxPlaneModeRotationSpeedChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SpeedSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 5)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_SpeedSettingsState_MaxVerticalSpeedChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_SpeedSettingsState_MaxRotationSpeedChanged(env, jcls, cmd, callback);
		case 2: return evt_minidrone_SpeedSettingsState_WheelsChanged(env, jcls, cmd, callback);
		case 3: return evt_minidrone_SpeedSettingsState_MaxHorizontalSpeedChanged(env, jcls, cmd, callback);
		case 4: return evt_minidrone_SpeedSettingsState_MaxPlaneModeRotationSpeedChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MediaRecord_nativeEncodePicture(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mass_storage_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_MediaRecord_Picture(cmd, mass_storage_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MediaRecord_nativeEncodePictureV2(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_MediaRecord_PictureV2(cmd);
	return res;
}

static struct {
	jmethodID jmid_PictureStateChanged;
	jmethodID jmid_PictureStateChangedV2;
} s_cb_minidrone_MediaRecordState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MediaRecordState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_MediaRecordState_cache.jmid_PictureStateChanged = (*env)->GetStaticMethodID(env, jcls, "picturestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MediaRecordState$Callback;II)V");
	s_cb_minidrone_MediaRecordState_cache.jmid_PictureStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "picturestatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MediaRecordState$Callback;II)V");
}

static int evt_minidrone_MediaRecordState_PictureStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	uint8_t mass_storage_id;
	int res = arsdk_cmd_dec_Minidrone_MediaRecordState_PictureStateChanged(cmd, &state, &mass_storage_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MediaRecordState_cache.jmid_PictureStateChanged, callback, (jint)state, (jint)mass_storage_id);
	return 0;
}

static int evt_minidrone_MediaRecordState_PictureStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Minidrone_MediaRecordState_PictureStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MediaRecordState_cache.jmid_PictureStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MediaRecordState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 7)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_MediaRecordState_PictureStateChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_MediaRecordState_PictureStateChangedV2(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettings_nativeEncodeMaxAltitude(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_PilotingSettings_MaxAltitude(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettings_nativeEncodeMaxTilt(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat current) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_PilotingSettings_MaxTilt(cmd, current);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettings_nativeEncodeBankedTurn(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_PilotingSettings_BankedTurn(cmd, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettings_nativeEncodeMaxThrottle(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat max) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_PilotingSettings_MaxThrottle(cmd, max);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettings_nativeEncodePreferredPilotingMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_PilotingSettings_PreferredPilotingMode(cmd, mode);
	return res;
}

static struct {
	jmethodID jmid_MaxAltitudeChanged;
	jmethodID jmid_MaxTiltChanged;
	jmethodID jmid_BankedTurnChanged;
	jmethodID jmid_MaxThrottleChanged;
	jmethodID jmid_PreferredPilotingModeChanged;
} s_cb_minidrone_PilotingSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_PilotingSettingsState_cache.jmid_MaxAltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "maxaltitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingSettingsState$Callback;FFF)V");
	s_cb_minidrone_PilotingSettingsState_cache.jmid_MaxTiltChanged = (*env)->GetStaticMethodID(env, jcls, "maxtiltchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingSettingsState$Callback;FFF)V");
	s_cb_minidrone_PilotingSettingsState_cache.jmid_BankedTurnChanged = (*env)->GetStaticMethodID(env, jcls, "bankedturnchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingSettingsState$Callback;I)V");
	s_cb_minidrone_PilotingSettingsState_cache.jmid_MaxThrottleChanged = (*env)->GetStaticMethodID(env, jcls, "maxthrottlechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingSettingsState$Callback;F)V");
	s_cb_minidrone_PilotingSettingsState_cache.jmid_PreferredPilotingModeChanged = (*env)->GetStaticMethodID(env, jcls, "preferredpilotingmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$PilotingSettingsState$Callback;I)V");
}

static int evt_minidrone_PilotingSettingsState_MaxAltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Minidrone_PilotingSettingsState_MaxAltitudeChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingSettingsState_cache.jmid_MaxAltitudeChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_minidrone_PilotingSettingsState_MaxTiltChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float current;
	float min;
	float max;
	int res = arsdk_cmd_dec_Minidrone_PilotingSettingsState_MaxTiltChanged(cmd, &current, &min, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingSettingsState_cache.jmid_MaxTiltChanged, callback, (jfloat)current, (jfloat)min, (jfloat)max);
	return 0;
}

static int evt_minidrone_PilotingSettingsState_BankedTurnChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Minidrone_PilotingSettingsState_BankedTurnChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingSettingsState_cache.jmid_BankedTurnChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_PilotingSettingsState_MaxThrottleChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float max;
	int res = arsdk_cmd_dec_Minidrone_PilotingSettingsState_MaxThrottleChanged(cmd, &max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingSettingsState_cache.jmid_MaxThrottleChanged, callback, (jfloat)max);
	return 0;
}

static int evt_minidrone_PilotingSettingsState_PreferredPilotingModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Minidrone_PilotingSettingsState_PreferredPilotingModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_PilotingSettingsState_cache.jmid_PreferredPilotingModeChanged, callback, (jint)mode);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024PilotingSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 9)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_PilotingSettingsState_MaxAltitudeChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_PilotingSettingsState_MaxTiltChanged(env, jcls, cmd, callback);
		case 2: return evt_minidrone_PilotingSettingsState_BankedTurnChanged(env, jcls, cmd, callback);
		case 3: return evt_minidrone_PilotingSettingsState_MaxThrottleChanged(env, jcls, cmd, callback);
		case 4: return evt_minidrone_PilotingSettingsState_PreferredPilotingModeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Settings_nativeEncodeCutOutMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Settings_CutOutMode(cmd, enable);
	return res;
}

static struct {
	jmethodID jmid_ProductMotorsVersionChanged;
	jmethodID jmid_ProductInertialVersionChanged;
	jmethodID jmid_CutOutModeChanged;
} s_cb_minidrone_SettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_SettingsState_cache.jmid_ProductMotorsVersionChanged = (*env)->GetStaticMethodID(env, jcls, "productmotorsversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SettingsState$Callback;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_minidrone_SettingsState_cache.jmid_ProductInertialVersionChanged = (*env)->GetStaticMethodID(env, jcls, "productinertialversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SettingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_minidrone_SettingsState_cache.jmid_CutOutModeChanged = (*env)->GetStaticMethodID(env, jcls, "cutoutmodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$SettingsState$Callback;I)V");
}

static int evt_minidrone_SettingsState_ProductMotorsVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t motor;
	const char * type;
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Minidrone_SettingsState_ProductMotorsVersionChanged(cmd, &motor, &type, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SettingsState_cache.jmid_ProductMotorsVersionChanged, callback, (jint)motor, (*env)->NewStringUTF(env, type), (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_minidrone_SettingsState_ProductInertialVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Minidrone_SettingsState_ProductInertialVersionChanged(cmd, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SettingsState_cache.jmid_ProductInertialVersionChanged, callback, (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_minidrone_SettingsState_CutOutModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enable;
	int res = arsdk_cmd_dec_Minidrone_SettingsState_CutOutModeChanged(cmd, &enable);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_SettingsState_cache.jmid_CutOutModeChanged, callback, (jint)enable);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024SettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 11)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_SettingsState_ProductMotorsVersionChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_SettingsState_ProductInertialVersionChanged(env, jcls, cmd, callback);
		case 2: return evt_minidrone_SettingsState_CutOutModeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_FloodControlChanged;
} s_cb_minidrone_FloodControlState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024FloodControlState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_FloodControlState_cache.jmid_FloodControlChanged = (*env)->GetStaticMethodID(env, jcls, "floodcontrolchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$FloodControlState$Callback;I)V");
}

static int evt_minidrone_FloodControlState_FloodControlChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t delay;
	int res = arsdk_cmd_dec_Minidrone_FloodControlState_FloodControlChanged(cmd, &delay);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_FloodControlState_cache.jmid_FloodControlChanged, callback, (jint)delay);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024FloodControlState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 12)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_FloodControlState_FloodControlChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024GPS_nativeEncodeControllerLatitudeForRun(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_GPS_ControllerLatitudeForRun(cmd, latitude);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024GPS_nativeEncodeControllerLongitudeForRun(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble longitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_GPS_ControllerLongitudeForRun(cmd, longitude);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Configuration_nativeEncodeControllerType(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_type = (*env)->GetStringUTFChars(env, type, NULL);
	int res = arsdk_cmd_enc_Minidrone_Configuration_ControllerType(cmd, c_type);
	if (c_type != NULL) (*env)->ReleaseStringUTFChars(env, type, c_type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Configuration_nativeEncodeControllerName(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring name) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_name = (*env)->GetStringUTFChars(env, name, NULL);
	int res = arsdk_cmd_enc_Minidrone_Configuration_ControllerName(cmd, c_name);
	if (c_name != NULL) (*env)->ReleaseStringUTFChars(env, name, c_name);
	return res;
}

static struct {
	jmethodID jmid_LightState;
	jmethodID jmid_ClawState;
	jmethodID jmid_GunState;
} s_cb_minidrone_UsbAccessoryState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024UsbAccessoryState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_UsbAccessoryState_cache.jmid_LightState = (*env)->GetStaticMethodID(env, jcls, "lightstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$UsbAccessoryState$Callback;IIII)V");
	s_cb_minidrone_UsbAccessoryState_cache.jmid_ClawState = (*env)->GetStaticMethodID(env, jcls, "clawstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$UsbAccessoryState$Callback;III)V");
	s_cb_minidrone_UsbAccessoryState_cache.jmid_GunState = (*env)->GetStaticMethodID(env, jcls, "gunstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$UsbAccessoryState$Callback;III)V");
}

static int evt_minidrone_UsbAccessoryState_LightState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t id;
	int32_t state;
	uint8_t intensity;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Minidrone_UsbAccessoryState_LightState(cmd, &id, &state, &intensity, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_UsbAccessoryState_cache.jmid_LightState, callback, (jint)id, (jint)state, (jint)intensity, (jint)list_flags);
	return 0;
}

static int evt_minidrone_UsbAccessoryState_ClawState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t id;
	int32_t state;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Minidrone_UsbAccessoryState_ClawState(cmd, &id, &state, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_UsbAccessoryState_cache.jmid_ClawState, callback, (jint)id, (jint)state, (jint)list_flags);
	return 0;
}

static int evt_minidrone_UsbAccessoryState_GunState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t id;
	int32_t state;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Minidrone_UsbAccessoryState_GunState(cmd, &id, &state, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_UsbAccessoryState_cache.jmid_GunState, callback, (jint)id, (jint)state, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024UsbAccessoryState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 15)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_UsbAccessoryState_LightState(env, jcls, cmd, callback);
		case 1: return evt_minidrone_UsbAccessoryState_ClawState(env, jcls, cmd, callback);
		case 2: return evt_minidrone_UsbAccessoryState_GunState(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024UsbAccessory_nativeEncodeLightControl(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id, jint mode, jint intensity) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_UsbAccessory_LightControl(cmd, id, mode, intensity);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024UsbAccessory_nativeEncodeClawControl(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id, jint action) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_UsbAccessory_ClawControl(cmd, id, action);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024UsbAccessory_nativeEncodeGunControl(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id, jint action) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_UsbAccessory_GunControl(cmd, id, action);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024RemoteController_nativeEncodeSetPairedRemote(JNIEnv *env, jclass jcls, jlong nativeCmd, jint msb_mac, jint mid_mac, jint lsb_mac) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_RemoteController_SetPairedRemote(cmd, msb_mac, mid_mac, lsb_mac);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024RemoteController_nativeEncodeRawMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enabled) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_RemoteController_RawMode(cmd, enabled);
	return res;
}

static struct {
	jmethodID jmid_DronePosition;
	jmethodID jmid_DroneSpeed;
	jmethodID jmid_DroneAltitude;
	jmethodID jmid_DroneQuaternion;
} s_cb_minidrone_NavigationDataState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024NavigationDataState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_NavigationDataState_cache.jmid_DronePosition = (*env)->GetStaticMethodID(env, jcls, "droneposition", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$NavigationDataState$Callback;FFIII)V");
	s_cb_minidrone_NavigationDataState_cache.jmid_DroneSpeed = (*env)->GetStaticMethodID(env, jcls, "dronespeed", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$NavigationDataState$Callback;FFFI)V");
	s_cb_minidrone_NavigationDataState_cache.jmid_DroneAltitude = (*env)->GetStaticMethodID(env, jcls, "dronealtitude", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$NavigationDataState$Callback;FI)V");
	s_cb_minidrone_NavigationDataState_cache.jmid_DroneQuaternion = (*env)->GetStaticMethodID(env, jcls, "dronequaternion", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$NavigationDataState$Callback;FFFFI)V");
}

static int evt_minidrone_NavigationDataState_DronePosition(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float posx;
	float posy;
	int16_t posz;
	int16_t psi;
	int16_t ts;
	int res = arsdk_cmd_dec_Minidrone_NavigationDataState_DronePosition(cmd, &posx, &posy, &posz, &psi, &ts);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_NavigationDataState_cache.jmid_DronePosition, callback, (jfloat)posx, (jfloat)posy, (jint)posz, (jint)psi, (jint)ts);
	return 0;
}

static int evt_minidrone_NavigationDataState_DroneSpeed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float speed_x;
	float speed_y;
	float speed_z;
	uint16_t ts;
	int res = arsdk_cmd_dec_Minidrone_NavigationDataState_DroneSpeed(cmd, &speed_x, &speed_y, &speed_z, &ts);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_NavigationDataState_cache.jmid_DroneSpeed, callback, (jfloat)speed_x, (jfloat)speed_y, (jfloat)speed_z, (jint)ts);
	return 0;
}

static int evt_minidrone_NavigationDataState_DroneAltitude(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float altitude;
	uint16_t ts;
	int res = arsdk_cmd_dec_Minidrone_NavigationDataState_DroneAltitude(cmd, &altitude, &ts);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_NavigationDataState_cache.jmid_DroneAltitude, callback, (jfloat)altitude, (jint)ts);
	return 0;
}

static int evt_minidrone_NavigationDataState_DroneQuaternion(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float q_w;
	float q_x;
	float q_y;
	float q_z;
	uint16_t ts;
	int res = arsdk_cmd_dec_Minidrone_NavigationDataState_DroneQuaternion(cmd, &q_w, &q_x, &q_y, &q_z, &ts);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_NavigationDataState_cache.jmid_DroneQuaternion, callback, (jfloat)q_w, (jfloat)q_x, (jfloat)q_y, (jfloat)q_z, (jint)ts);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024NavigationDataState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 18)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_NavigationDataState_DronePosition(env, jcls, cmd, callback);
		case 1: return evt_minidrone_NavigationDataState_DroneSpeed(env, jcls, cmd, callback);
		case 2: return evt_minidrone_NavigationDataState_DroneAltitude(env, jcls, cmd, callback);
		case 4: return evt_minidrone_NavigationDataState_DroneQuaternion(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_PowerModeChanged;
	jmethodID jmid_ProductSerialChanged;
	jmethodID jmid_StateChanged;
	jmethodID jmid_VersionChanged;
	jmethodID jmid_PictureChanged;
	jmethodID jmid_VideoStateChanged;
	jmethodID jmid_MassStorageFormatChanged;
} s_cb_minidrone_MinicamState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MinicamState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_MinicamState_cache.jmid_PowerModeChanged = (*env)->GetStaticMethodID(env, jcls, "powermodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;I)V");
	s_cb_minidrone_MinicamState_cache.jmid_ProductSerialChanged = (*env)->GetStaticMethodID(env, jcls, "productserialchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;Ljava/lang/String;)V");
	s_cb_minidrone_MinicamState_cache.jmid_StateChanged = (*env)->GetStaticMethodID(env, jcls, "statechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;I)V");
	s_cb_minidrone_MinicamState_cache.jmid_VersionChanged = (*env)->GetStaticMethodID(env, jcls, "versionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_minidrone_MinicamState_cache.jmid_PictureChanged = (*env)->GetStaticMethodID(env, jcls, "picturechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;II)V");
	s_cb_minidrone_MinicamState_cache.jmid_VideoStateChanged = (*env)->GetStaticMethodID(env, jcls, "videostatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;II)V");
	s_cb_minidrone_MinicamState_cache.jmid_MassStorageFormatChanged = (*env)->GetStaticMethodID(env, jcls, "massstorageformatchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$MinicamState$Callback;I)V");
}

static int evt_minidrone_MinicamState_PowerModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t power_mode;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_PowerModeChanged(cmd, &power_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_PowerModeChanged, callback, (jint)power_mode);
	return 0;
}

static int evt_minidrone_MinicamState_ProductSerialChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serial_number;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_ProductSerialChanged(cmd, &serial_number);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_ProductSerialChanged, callback, (*env)->NewStringUTF(env, serial_number));
	return 0;
}

static int evt_minidrone_MinicamState_StateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_StateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_StateChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_MinicamState_VersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_VersionChanged(cmd, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_VersionChanged, callback, (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_minidrone_MinicamState_PictureChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t result;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_PictureChanged(cmd, &state, &result);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_PictureChanged, callback, (jint)state, (jint)result);
	return 0;
}

static int evt_minidrone_MinicamState_VideoStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_VideoStateChanged(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_VideoStateChanged, callback, (jint)state, (jint)error);
	return 0;
}

static int evt_minidrone_MinicamState_MassStorageFormatChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Minidrone_MinicamState_MassStorageFormatChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_MinicamState_cache.jmid_MassStorageFormatChanged, callback, (jint)state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024MinicamState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 19)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_MinicamState_PowerModeChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_MinicamState_ProductSerialChanged(env, jcls, cmd, callback);
		case 2: return evt_minidrone_MinicamState_StateChanged(env, jcls, cmd, callback);
		case 3: return evt_minidrone_MinicamState_VersionChanged(env, jcls, cmd, callback);
		case 4: return evt_minidrone_MinicamState_PictureChanged(env, jcls, cmd, callback);
		case 5: return evt_minidrone_MinicamState_VideoStateChanged(env, jcls, cmd, callback);
		case 6: return evt_minidrone_MinicamState_MassStorageFormatChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024VideoSettings_nativeEncodeAutorecord(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_VideoSettings_Autorecord(cmd, enable);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024VideoSettings_nativeEncodeElectricFrequency(JNIEnv *env, jclass jcls, jlong nativeCmd, jint frequency) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_VideoSettings_ElectricFrequency(cmd, frequency);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024VideoSettings_nativeEncodeVideoResolution(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_VideoSettings_VideoResolution(cmd, type);
	return res;
}

static struct {
	jmethodID jmid_AutorecordChanged;
	jmethodID jmid_ElectricFrequencyChanged;
	jmethodID jmid_VideoResolutionChanged;
} s_cb_minidrone_VideoSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024VideoSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_VideoSettingsState_cache.jmid_AutorecordChanged = (*env)->GetStaticMethodID(env, jcls, "autorecordchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$VideoSettingsState$Callback;I)V");
	s_cb_minidrone_VideoSettingsState_cache.jmid_ElectricFrequencyChanged = (*env)->GetStaticMethodID(env, jcls, "electricfrequencychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$VideoSettingsState$Callback;I)V");
	s_cb_minidrone_VideoSettingsState_cache.jmid_VideoResolutionChanged = (*env)->GetStaticMethodID(env, jcls, "videoresolutionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$VideoSettingsState$Callback;I)V");
}

static int evt_minidrone_VideoSettingsState_AutorecordChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Minidrone_VideoSettingsState_AutorecordChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_VideoSettingsState_cache.jmid_AutorecordChanged, callback, (jint)enabled);
	return 0;
}

static int evt_minidrone_VideoSettingsState_ElectricFrequencyChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t frequency;
	int res = arsdk_cmd_dec_Minidrone_VideoSettingsState_ElectricFrequencyChanged(cmd, &frequency);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_VideoSettingsState_cache.jmid_ElectricFrequencyChanged, callback, (jint)frequency);
	return 0;
}

static int evt_minidrone_VideoSettingsState_VideoResolutionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int res = arsdk_cmd_dec_Minidrone_VideoSettingsState_VideoResolutionChanged(cmd, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_VideoSettingsState_cache.jmid_VideoResolutionChanged, callback, (jint)type);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024VideoSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 21)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_VideoSettingsState_AutorecordChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_VideoSettingsState_ElectricFrequencyChanged(env, jcls, cmd, callback);
		case 2: return evt_minidrone_VideoSettingsState_VideoResolutionChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Minicam_nativeEncodePicture(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Minicam_Picture(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Minicam_nativeEncodeVideo(JNIEnv *env, jclass jcls, jlong nativeCmd, jint record) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Minicam_Video(cmd, record);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024Minicam_nativeEncodeMassStorageFormat(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Minidrone_Minicam_MassStorageFormat(cmd);
	return res;
}

static struct {
	jmethodID jmid_ConnectionChanged;
	jmethodID jmid_RecordButtonPressed;
	jmethodID jmid_TakePictureButtonPressed;
	jmethodID jmid_RawMode;
	jmethodID jmid_RawCommands;
	jmethodID jmid_BatteryLevel;
} s_cb_minidrone_RemoteControllerState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024RemoteControllerState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_minidrone_RemoteControllerState_cache.jmid_ConnectionChanged = (*env)->GetStaticMethodID(env, jcls, "connectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$RemoteControllerState$Callback;I)V");
	s_cb_minidrone_RemoteControllerState_cache.jmid_RecordButtonPressed = (*env)->GetStaticMethodID(env, jcls, "recordbuttonpressed", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$RemoteControllerState$Callback;)V");
	s_cb_minidrone_RemoteControllerState_cache.jmid_TakePictureButtonPressed = (*env)->GetStaticMethodID(env, jcls, "takepicturebuttonpressed", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$RemoteControllerState$Callback;)V");
	s_cb_minidrone_RemoteControllerState_cache.jmid_RawMode = (*env)->GetStaticMethodID(env, jcls, "rawmode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$RemoteControllerState$Callback;I)V");
	s_cb_minidrone_RemoteControllerState_cache.jmid_RawCommands = (*env)->GetStaticMethodID(env, jcls, "rawcommands", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$RemoteControllerState$Callback;IIIII)V");
	s_cb_minidrone_RemoteControllerState_cache.jmid_BatteryLevel = (*env)->GetStaticMethodID(env, jcls, "batterylevel", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMinidrone$RemoteControllerState$Callback;I)V");
}

static int evt_minidrone_RemoteControllerState_ConnectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Minidrone_RemoteControllerState_ConnectionChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_RemoteControllerState_cache.jmid_ConnectionChanged, callback, (jint)state);
	return 0;
}

static int evt_minidrone_RemoteControllerState_RecordButtonPressed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Minidrone_RemoteControllerState_RecordButtonPressed(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_RemoteControllerState_cache.jmid_RecordButtonPressed, callback);
	return 0;
}

static int evt_minidrone_RemoteControllerState_TakePictureButtonPressed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Minidrone_RemoteControllerState_TakePictureButtonPressed(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_RemoteControllerState_cache.jmid_TakePictureButtonPressed, callback);
	return 0;
}

static int evt_minidrone_RemoteControllerState_RawMode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Minidrone_RemoteControllerState_RawMode(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_RemoteControllerState_cache.jmid_RawMode, callback, (jint)enabled);
	return 0;
}

static int evt_minidrone_RemoteControllerState_RawCommands(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int8_t joy0x;
	int8_t joy0y;
	int8_t joy1x;
	int8_t joy1y;
	uint16_t buttons;
	int res = arsdk_cmd_dec_Minidrone_RemoteControllerState_RawCommands(cmd, &joy0x, &joy0y, &joy1x, &joy1y, &buttons);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_RemoteControllerState_cache.jmid_RawCommands, callback, (jint)joy0x, (jint)joy0y, (jint)joy1x, (jint)joy1y, (jint)buttons);
	return 0;
}

static int evt_minidrone_RemoteControllerState_BatteryLevel(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int8_t level;
	int res = arsdk_cmd_dec_Minidrone_RemoteControllerState_BatteryLevel(cmd, &level);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_minidrone_RemoteControllerState_cache.jmid_BatteryLevel, callback, (jint)level);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMinidrone_00024RemoteControllerState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 2 || cmd->cls_id != 25)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_minidrone_RemoteControllerState_ConnectionChanged(env, jcls, cmd, callback);
		case 1: return evt_minidrone_RemoteControllerState_RecordButtonPressed(env, jcls, cmd, callback);
		case 2: return evt_minidrone_RemoteControllerState_TakePictureButtonPressed(env, jcls, cmd, callback);
		case 3: return evt_minidrone_RemoteControllerState_RawMode(env, jcls, cmd, callback);
		case 4: return evt_minidrone_RemoteControllerState_RawCommands(env, jcls, cmd, callback);
		case 5: return evt_minidrone_RemoteControllerState_BatteryLevel(env, jcls, cmd, callback);
	}
	return -1;
}

