/** Generated, do not edit ! */

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024Piloting_nativeEncodePCMD(JNIEnv *env, jclass jcls, jlong nativeCmd, jint flag, jint throttle, jint roll) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_Piloting_PCMD(cmd, flag, throttle, roll);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024Piloting_nativeEncodeUserTakeOff(JNIEnv *env, jclass jcls, jlong nativeCmd, jint state) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_Piloting_UserTakeOff(cmd, state);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024Piloting_nativeEncodeMotorMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_Piloting_MotorMode(cmd, mode);
	return res;
}

static struct {
	jmethodID jmid_AlertStateChanged;
	jmethodID jmid_FlyingStateChanged;
	jmethodID jmid_MotorModeChanged;
	jmethodID jmid_AttitudeChanged;
	jmethodID jmid_AltitudeChanged;
} s_cb_powerup_PilotingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024PilotingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_PilotingState_cache.jmid_AlertStateChanged = (*env)->GetStaticMethodID(env, jcls, "alertstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$PilotingState$Callback;I)V");
	s_cb_powerup_PilotingState_cache.jmid_FlyingStateChanged = (*env)->GetStaticMethodID(env, jcls, "flyingstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$PilotingState$Callback;I)V");
	s_cb_powerup_PilotingState_cache.jmid_MotorModeChanged = (*env)->GetStaticMethodID(env, jcls, "motormodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$PilotingState$Callback;I)V");
	s_cb_powerup_PilotingState_cache.jmid_AttitudeChanged = (*env)->GetStaticMethodID(env, jcls, "attitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$PilotingState$Callback;FFF)V");
	s_cb_powerup_PilotingState_cache.jmid_AltitudeChanged = (*env)->GetStaticMethodID(env, jcls, "altitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$PilotingState$Callback;F)V");
}

static int evt_powerup_PilotingState_AlertStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Powerup_PilotingState_AlertStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_PilotingState_cache.jmid_AlertStateChanged, callback, (jint)state);
	return 0;
}

static int evt_powerup_PilotingState_FlyingStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Powerup_PilotingState_FlyingStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_PilotingState_cache.jmid_FlyingStateChanged, callback, (jint)state);
	return 0;
}

static int evt_powerup_PilotingState_MotorModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Powerup_PilotingState_MotorModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_PilotingState_cache.jmid_MotorModeChanged, callback, (jint)mode);
	return 0;
}

static int evt_powerup_PilotingState_AttitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float roll;
	float pitch;
	float yaw;
	int res = arsdk_cmd_dec_Powerup_PilotingState_AttitudeChanged(cmd, &roll, &pitch, &yaw);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_PilotingState_cache.jmid_AttitudeChanged, callback, (jfloat)roll, (jfloat)pitch, (jfloat)yaw);
	return 0;
}

static int evt_powerup_PilotingState_AltitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float altitude;
	int res = arsdk_cmd_dec_Powerup_PilotingState_AltitudeChanged(cmd, &altitude);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_PilotingState_cache.jmid_AltitudeChanged, callback, (jfloat)altitude);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024PilotingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 1)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_PilotingState_AlertStateChanged(env, jcls, cmd, callback);
		case 1: return evt_powerup_PilotingState_FlyingStateChanged(env, jcls, cmd, callback);
		case 2: return evt_powerup_PilotingState_MotorModeChanged(env, jcls, cmd, callback);
		case 3: return evt_powerup_PilotingState_AttitudeChanged(env, jcls, cmd, callback);
		case 4: return evt_powerup_PilotingState_AltitudeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024PilotingSettings_nativeEncodeSet(JNIEnv *env, jclass jcls, jlong nativeCmd, jint setting, jfloat value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_PilotingSettings_Set(cmd, setting, value);
	return res;
}

static struct {
	jmethodID jmid_settingChanged;
} s_cb_powerup_PilotingSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024PilotingSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_PilotingSettingsState_cache.jmid_settingChanged = (*env)->GetStaticMethodID(env, jcls, "settingchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$PilotingSettingsState$Callback;IFFFI)V");
}

static int evt_powerup_PilotingSettingsState_settingChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t setting;
	float current;
	float min;
	float max;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Powerup_PilotingSettingsState_SettingChanged(cmd, &setting, &current, &min, &max, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_PilotingSettingsState_cache.jmid_settingChanged, callback, (jint)setting, (jfloat)current, (jfloat)min, (jfloat)max, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024PilotingSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 3)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_PilotingSettingsState_settingChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaRecord_nativeEncodePictureV2(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_MediaRecord_PictureV2(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaRecord_nativeEncodeVideoV2(JNIEnv *env, jclass jcls, jlong nativeCmd, jint record) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_MediaRecord_VideoV2(cmd, record);
	return res;
}

static struct {
	jmethodID jmid_PictureStateChangedV2;
	jmethodID jmid_VideoStateChangedV2;
} s_cb_powerup_MediaRecordState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaRecordState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_MediaRecordState_cache.jmid_PictureStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "picturestatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$MediaRecordState$Callback;II)V");
	s_cb_powerup_MediaRecordState_cache.jmid_VideoStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "videostatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$MediaRecordState$Callback;II)V");
}

static int evt_powerup_MediaRecordState_PictureStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Powerup_MediaRecordState_PictureStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_MediaRecordState_cache.jmid_PictureStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

static int evt_powerup_MediaRecordState_VideoStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Powerup_MediaRecordState_VideoStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_MediaRecordState_cache.jmid_VideoStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaRecordState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 5)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_MediaRecordState_PictureStateChangedV2(env, jcls, cmd, callback);
		case 1: return evt_powerup_MediaRecordState_VideoStateChangedV2(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_PictureEventChanged;
	jmethodID jmid_VideoEventChanged;
} s_cb_powerup_MediaRecordEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaRecordEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_MediaRecordEvent_cache.jmid_PictureEventChanged = (*env)->GetStaticMethodID(env, jcls, "pictureeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$MediaRecordEvent$Callback;II)V");
	s_cb_powerup_MediaRecordEvent_cache.jmid_VideoEventChanged = (*env)->GetStaticMethodID(env, jcls, "videoeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$MediaRecordEvent$Callback;II)V");
}

static int evt_powerup_MediaRecordEvent_PictureEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Powerup_MediaRecordEvent_PictureEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_MediaRecordEvent_cache.jmid_PictureEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

static int evt_powerup_MediaRecordEvent_VideoEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Powerup_MediaRecordEvent_VideoEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_MediaRecordEvent_cache.jmid_VideoEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaRecordEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 6)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_MediaRecordEvent_PictureEventChanged(env, jcls, cmd, callback);
		case 1: return evt_powerup_MediaRecordEvent_VideoEventChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024NetworkSettings_nativeEncodeWifiSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jint band, jint channel) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_NetworkSettings_WifiSelection(cmd, type, band, channel);
	return res;
}

static struct {
	jmethodID jmid_WifiSelectionChanged;
} s_cb_powerup_NetworkSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024NetworkSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_NetworkSettingsState_cache.jmid_WifiSelectionChanged = (*env)->GetStaticMethodID(env, jcls, "wifiselectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$NetworkSettingsState$Callback;III)V");
}

static int evt_powerup_NetworkSettingsState_WifiSelectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Powerup_NetworkSettingsState_WifiSelectionChanged(cmd, &type, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_NetworkSettingsState_cache.jmid_WifiSelectionChanged, callback, (jint)type, (jint)band, (jint)channel);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024NetworkSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 8)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_NetworkSettingsState_WifiSelectionChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024Network_nativeEncodeWifiScan(JNIEnv *env, jclass jcls, jlong nativeCmd, jint band) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_Network_WifiScan(cmd, band);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024Network_nativeEncodeWifiAuthChannel(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_Network_WifiAuthChannel(cmd);
	return res;
}

static struct {
	jmethodID jmid_WifiScanListChanged;
	jmethodID jmid_AllWifiScanChanged;
	jmethodID jmid_WifiAuthChannelListChanged;
	jmethodID jmid_AllWifiAuthChannelChanged;
	jmethodID jmid_LinkQualityChanged;
} s_cb_powerup_NetworkState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024NetworkState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_NetworkState_cache.jmid_WifiScanListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiscanlistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$NetworkState$Callback;Ljava/lang/String;III)V");
	s_cb_powerup_NetworkState_cache.jmid_AllWifiScanChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiscanchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$NetworkState$Callback;)V");
	s_cb_powerup_NetworkState_cache.jmid_WifiAuthChannelListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiauthchannellistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$NetworkState$Callback;III)V");
	s_cb_powerup_NetworkState_cache.jmid_AllWifiAuthChannelChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiauthchannelchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$NetworkState$Callback;)V");
	s_cb_powerup_NetworkState_cache.jmid_LinkQualityChanged = (*env)->GetStaticMethodID(env, jcls, "linkqualitychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$NetworkState$Callback;I)V");
}

static int evt_powerup_NetworkState_WifiScanListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * ssid;
	int16_t rssi;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Powerup_NetworkState_WifiScanListChanged(cmd, &ssid, &rssi, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_NetworkState_cache.jmid_WifiScanListChanged, callback, (*env)->NewStringUTF(env, ssid), (jint)rssi, (jint)band, (jint)channel);
	return 0;
}

static int evt_powerup_NetworkState_AllWifiScanChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Powerup_NetworkState_AllWifiScanChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_NetworkState_cache.jmid_AllWifiScanChanged, callback);
	return 0;
}

static int evt_powerup_NetworkState_WifiAuthChannelListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t band;
	uint8_t channel;
	uint8_t in_or_out;
	int res = arsdk_cmd_dec_Powerup_NetworkState_WifiAuthChannelListChanged(cmd, &band, &channel, &in_or_out);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_NetworkState_cache.jmid_WifiAuthChannelListChanged, callback, (jint)band, (jint)channel, (jint)in_or_out);
	return 0;
}

static int evt_powerup_NetworkState_AllWifiAuthChannelChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Powerup_NetworkState_AllWifiAuthChannelChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_NetworkState_cache.jmid_AllWifiAuthChannelChanged, callback);
	return 0;
}

static int evt_powerup_NetworkState_LinkQualityChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t quality;
	int res = arsdk_cmd_dec_Powerup_NetworkState_LinkQualityChanged(cmd, &quality);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_NetworkState_cache.jmid_LinkQualityChanged, callback, (jint)quality);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024NetworkState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 10)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_NetworkState_WifiScanListChanged(env, jcls, cmd, callback);
		case 1: return evt_powerup_NetworkState_AllWifiScanChanged(env, jcls, cmd, callback);
		case 2: return evt_powerup_NetworkState_WifiAuthChannelListChanged(env, jcls, cmd, callback);
		case 3: return evt_powerup_NetworkState_AllWifiAuthChannelChanged(env, jcls, cmd, callback);
		case 4: return evt_powerup_NetworkState_LinkQualityChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaStreaming_nativeEncodeVideoEnable(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_MediaStreaming_VideoEnable(cmd, enable);
	return res;
}

static struct {
	jmethodID jmid_VideoEnableChanged;
} s_cb_powerup_MediaStreamingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaStreamingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_MediaStreamingState_cache.jmid_VideoEnableChanged = (*env)->GetStaticMethodID(env, jcls, "videoenablechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$MediaStreamingState$Callback;I)V");
}

static int evt_powerup_MediaStreamingState_VideoEnableChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t enabled;
	int res = arsdk_cmd_dec_Powerup_MediaStreamingState_VideoEnableChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_MediaStreamingState_cache.jmid_VideoEnableChanged, callback, (jint)enabled);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024MediaStreamingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 12)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_MediaStreamingState_VideoEnableChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024VideoSettings_nativeEncodeAutorecord(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_VideoSettings_Autorecord(cmd, enable);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024VideoSettings_nativeEncodeVideoMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_VideoSettings_VideoMode(cmd, mode);
	return res;
}

static struct {
	jmethodID jmid_AutorecordChanged;
	jmethodID jmid_VideoModeChanged;
} s_cb_powerup_VideoSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024VideoSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_VideoSettingsState_cache.jmid_AutorecordChanged = (*env)->GetStaticMethodID(env, jcls, "autorecordchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$VideoSettingsState$Callback;I)V");
	s_cb_powerup_VideoSettingsState_cache.jmid_VideoModeChanged = (*env)->GetStaticMethodID(env, jcls, "videomodechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$VideoSettingsState$Callback;I)V");
}

static int evt_powerup_VideoSettingsState_AutorecordChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Powerup_VideoSettingsState_AutorecordChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_VideoSettingsState_cache.jmid_AutorecordChanged, callback, (jint)enabled);
	return 0;
}

static int evt_powerup_VideoSettingsState_VideoModeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Powerup_VideoSettingsState_VideoModeChanged(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_VideoSettingsState_cache.jmid_VideoModeChanged, callback, (jint)mode);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024VideoSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 14)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_VideoSettingsState_AutorecordChanged(env, jcls, cmd, callback);
		case 1: return evt_powerup_VideoSettingsState_VideoModeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024Sounds_nativeEncodeBuzz(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Powerup_Sounds_Buzz(cmd, enable);
	return res;
}

static struct {
	jmethodID jmid_buzzChanged;
} s_cb_powerup_SoundsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024SoundsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_powerup_SoundsState_cache.jmid_buzzChanged = (*env)->GetStaticMethodID(env, jcls, "buzzchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePowerup$SoundsState$Callback;I)V");
}

static int evt_powerup_SoundsState_buzzChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Powerup_SoundsState_BuzzChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_powerup_SoundsState_cache.jmid_buzzChanged, callback, (jint)enabled);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePowerup_00024SoundsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 8 || cmd->cls_id != 16)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_powerup_SoundsState_buzzChanged(env, jcls, cmd, callback);
	}
	return -1;
}

