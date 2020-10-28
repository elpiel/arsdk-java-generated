/** Generated, do not edit ! */

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Piloting_nativeEncodePCMD(JNIEnv *env, jclass jcls, jlong nativeCmd, jint flag, jint speed, jint turn) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Piloting_PCMD(cmd, flag, speed, turn);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Piloting_nativeEncodePosture(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Piloting_Posture(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Piloting_nativeEncodeAddCapOffset(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat offset) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Piloting_AddCapOffset(cmd, offset);
	return res;
}

static struct {
	jmethodID jmid_PostureChanged;
	jmethodID jmid_AlertStateChanged;
	jmethodID jmid_SpeedChanged;
} s_cb_jpsumo_PilotingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024PilotingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_PilotingState_cache.jmid_PostureChanged = (*env)->GetStaticMethodID(env, jcls, "posturechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$PilotingState$Callback;I)V");
	s_cb_jpsumo_PilotingState_cache.jmid_AlertStateChanged = (*env)->GetStaticMethodID(env, jcls, "alertstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$PilotingState$Callback;I)V");
	s_cb_jpsumo_PilotingState_cache.jmid_SpeedChanged = (*env)->GetStaticMethodID(env, jcls, "speedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$PilotingState$Callback;II)V");
}

static int evt_jpsumo_PilotingState_PostureChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Jpsumo_PilotingState_PostureChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_PilotingState_cache.jmid_PostureChanged, callback, (jint)state);
	return 0;
}

static int evt_jpsumo_PilotingState_AlertStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Jpsumo_PilotingState_AlertStateChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_PilotingState_cache.jmid_AlertStateChanged, callback, (jint)state);
	return 0;
}

static int evt_jpsumo_PilotingState_SpeedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int8_t speed;
	int16_t realSpeed;
	int res = arsdk_cmd_dec_Jpsumo_PilotingState_SpeedChanged(cmd, &speed, &realSpeed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_PilotingState_cache.jmid_SpeedChanged, callback, (jint)speed, (jint)realSpeed);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024PilotingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 1)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_PilotingState_PostureChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_PilotingState_AlertStateChanged(env, jcls, cmd, callback);
		case 2: return evt_jpsumo_PilotingState_SpeedChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Animations_nativeEncodeJumpStop(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Animations_JumpStop(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Animations_nativeEncodeJumpCancel(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Animations_JumpCancel(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Animations_nativeEncodeJumpLoad(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Animations_JumpLoad(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Animations_nativeEncodeJump(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Animations_Jump(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Animations_nativeEncodeSimpleAnimation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Animations_SimpleAnimation(cmd, id);
	return res;
}

static struct {
	jmethodID jmid_JumpLoadChanged;
	jmethodID jmid_JumpTypeChanged;
	jmethodID jmid_JumpMotorProblemChanged;
} s_cb_jpsumo_AnimationsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024AnimationsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_AnimationsState_cache.jmid_JumpLoadChanged = (*env)->GetStaticMethodID(env, jcls, "jumploadchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$AnimationsState$Callback;I)V");
	s_cb_jpsumo_AnimationsState_cache.jmid_JumpTypeChanged = (*env)->GetStaticMethodID(env, jcls, "jumptypechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$AnimationsState$Callback;I)V");
	s_cb_jpsumo_AnimationsState_cache.jmid_JumpMotorProblemChanged = (*env)->GetStaticMethodID(env, jcls, "jumpmotorproblemchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$AnimationsState$Callback;I)V");
}

static int evt_jpsumo_AnimationsState_JumpLoadChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Jpsumo_AnimationsState_JumpLoadChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_AnimationsState_cache.jmid_JumpLoadChanged, callback, (jint)state);
	return 0;
}

static int evt_jpsumo_AnimationsState_JumpTypeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Jpsumo_AnimationsState_JumpTypeChanged(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_AnimationsState_cache.jmid_JumpTypeChanged, callback, (jint)state);
	return 0;
}

static int evt_jpsumo_AnimationsState_JumpMotorProblemChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t error;
	int res = arsdk_cmd_dec_Jpsumo_AnimationsState_JumpMotorProblemChanged(cmd, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_AnimationsState_cache.jmid_JumpMotorProblemChanged, callback, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024AnimationsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 3)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_AnimationsState_JumpLoadChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_AnimationsState_JumpTypeChanged(env, jcls, cmd, callback);
		case 2: return evt_jpsumo_AnimationsState_JumpMotorProblemChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_ProductGPSVersionChanged;
} s_cb_jpsumo_SettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024SettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_SettingsState_cache.jmid_ProductGPSVersionChanged = (*env)->GetStaticMethodID(env, jcls, "productgpsversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$SettingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
}

static int evt_jpsumo_SettingsState_ProductGPSVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Jpsumo_SettingsState_ProductGPSVersionChanged(cmd, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_SettingsState_cache.jmid_ProductGPSVersionChanged, callback, (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024SettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 5)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_SettingsState_ProductGPSVersionChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecord_nativeEncodePicture(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mass_storage_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_MediaRecord_Picture(cmd, mass_storage_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecord_nativeEncodeVideo(JNIEnv *env, jclass jcls, jlong nativeCmd, jint record, jint mass_storage_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_MediaRecord_Video(cmd, record, mass_storage_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecord_nativeEncodePictureV2(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_MediaRecord_PictureV2(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecord_nativeEncodeVideoV2(JNIEnv *env, jclass jcls, jlong nativeCmd, jint record) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_MediaRecord_VideoV2(cmd, record);
	return res;
}

static struct {
	jmethodID jmid_PictureStateChanged;
	jmethodID jmid_VideoStateChanged;
	jmethodID jmid_PictureStateChangedV2;
	jmethodID jmid_VideoStateChangedV2;
} s_cb_jpsumo_MediaRecordState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecordState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_MediaRecordState_cache.jmid_PictureStateChanged = (*env)->GetStaticMethodID(env, jcls, "picturestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaRecordState$Callback;II)V");
	s_cb_jpsumo_MediaRecordState_cache.jmid_VideoStateChanged = (*env)->GetStaticMethodID(env, jcls, "videostatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaRecordState$Callback;II)V");
	s_cb_jpsumo_MediaRecordState_cache.jmid_PictureStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "picturestatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaRecordState$Callback;II)V");
	s_cb_jpsumo_MediaRecordState_cache.jmid_VideoStateChangedV2 = (*env)->GetStaticMethodID(env, jcls, "videostatechangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaRecordState$Callback;II)V");
}

static int evt_jpsumo_MediaRecordState_PictureStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	uint8_t mass_storage_id;
	int res = arsdk_cmd_dec_Jpsumo_MediaRecordState_PictureStateChanged(cmd, &state, &mass_storage_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaRecordState_cache.jmid_PictureStateChanged, callback, (jint)state, (jint)mass_storage_id);
	return 0;
}

static int evt_jpsumo_MediaRecordState_VideoStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	uint8_t mass_storage_id;
	int res = arsdk_cmd_dec_Jpsumo_MediaRecordState_VideoStateChanged(cmd, &state, &mass_storage_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaRecordState_cache.jmid_VideoStateChanged, callback, (jint)state, (jint)mass_storage_id);
	return 0;
}

static int evt_jpsumo_MediaRecordState_PictureStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Jpsumo_MediaRecordState_PictureStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaRecordState_cache.jmid_PictureStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

static int evt_jpsumo_MediaRecordState_VideoStateChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Jpsumo_MediaRecordState_VideoStateChangedV2(cmd, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaRecordState_cache.jmid_VideoStateChangedV2, callback, (jint)state, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecordState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 7)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_MediaRecordState_PictureStateChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_MediaRecordState_VideoStateChanged(env, jcls, cmd, callback);
		case 2: return evt_jpsumo_MediaRecordState_PictureStateChangedV2(env, jcls, cmd, callback);
		case 3: return evt_jpsumo_MediaRecordState_VideoStateChangedV2(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024NetworkSettings_nativeEncodeWifiSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jint band, jint channel) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_NetworkSettings_WifiSelection(cmd, type, band, channel);
	return res;
}

static struct {
	jmethodID jmid_WifiSelectionChanged;
} s_cb_jpsumo_NetworkSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024NetworkSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_NetworkSettingsState_cache.jmid_WifiSelectionChanged = (*env)->GetStaticMethodID(env, jcls, "wifiselectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$NetworkSettingsState$Callback;III)V");
}

static int evt_jpsumo_NetworkSettingsState_WifiSelectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Jpsumo_NetworkSettingsState_WifiSelectionChanged(cmd, &type, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_NetworkSettingsState_cache.jmid_WifiSelectionChanged, callback, (jint)type, (jint)band, (jint)channel);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024NetworkSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 9)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_NetworkSettingsState_WifiSelectionChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Network_nativeEncodeWifiScan(JNIEnv *env, jclass jcls, jlong nativeCmd, jint band) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Network_WifiScan(cmd, band);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024Network_nativeEncodeWifiAuthChannel(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_Network_WifiAuthChannel(cmd);
	return res;
}

static struct {
	jmethodID jmid_WifiScanListChanged;
	jmethodID jmid_AllWifiScanChanged;
	jmethodID jmid_WifiAuthChannelListChanged;
	jmethodID jmid_AllWifiAuthChannelChanged;
	jmethodID jmid_LinkQualityChanged;
} s_cb_jpsumo_NetworkState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024NetworkState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_NetworkState_cache.jmid_WifiScanListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiscanlistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$NetworkState$Callback;Ljava/lang/String;III)V");
	s_cb_jpsumo_NetworkState_cache.jmid_AllWifiScanChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiscanchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$NetworkState$Callback;)V");
	s_cb_jpsumo_NetworkState_cache.jmid_WifiAuthChannelListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiauthchannellistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$NetworkState$Callback;III)V");
	s_cb_jpsumo_NetworkState_cache.jmid_AllWifiAuthChannelChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiauthchannelchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$NetworkState$Callback;)V");
	s_cb_jpsumo_NetworkState_cache.jmid_LinkQualityChanged = (*env)->GetStaticMethodID(env, jcls, "linkqualitychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$NetworkState$Callback;I)V");
}

static int evt_jpsumo_NetworkState_WifiScanListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * ssid;
	int16_t rssi;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Jpsumo_NetworkState_WifiScanListChanged(cmd, &ssid, &rssi, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_NetworkState_cache.jmid_WifiScanListChanged, callback, (*env)->NewStringUTF(env, ssid), (jint)rssi, (jint)band, (jint)channel);
	return 0;
}

static int evt_jpsumo_NetworkState_AllWifiScanChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Jpsumo_NetworkState_AllWifiScanChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_NetworkState_cache.jmid_AllWifiScanChanged, callback);
	return 0;
}

static int evt_jpsumo_NetworkState_WifiAuthChannelListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t band;
	uint8_t channel;
	uint8_t in_or_out;
	int res = arsdk_cmd_dec_Jpsumo_NetworkState_WifiAuthChannelListChanged(cmd, &band, &channel, &in_or_out);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_NetworkState_cache.jmid_WifiAuthChannelListChanged, callback, (jint)band, (jint)channel, (jint)in_or_out);
	return 0;
}

static int evt_jpsumo_NetworkState_AllWifiAuthChannelChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Jpsumo_NetworkState_AllWifiAuthChannelChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_NetworkState_cache.jmid_AllWifiAuthChannelChanged, callback);
	return 0;
}

static int evt_jpsumo_NetworkState_LinkQualityChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t quality;
	int res = arsdk_cmd_dec_Jpsumo_NetworkState_LinkQualityChanged(cmd, &quality);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_NetworkState_cache.jmid_LinkQualityChanged, callback, (jint)quality);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024NetworkState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 11)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_NetworkState_WifiScanListChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_NetworkState_AllWifiScanChanged(env, jcls, cmd, callback);
		case 2: return evt_jpsumo_NetworkState_WifiAuthChannelListChanged(env, jcls, cmd, callback);
		case 3: return evt_jpsumo_NetworkState_AllWifiAuthChannelChanged(env, jcls, cmd, callback);
		case 4: return evt_jpsumo_NetworkState_LinkQualityChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024AudioSettings_nativeEncodeMasterVolume(JNIEnv *env, jclass jcls, jlong nativeCmd, jint volume) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_AudioSettings_MasterVolume(cmd, volume);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024AudioSettings_nativeEncodeTheme(JNIEnv *env, jclass jcls, jlong nativeCmd, jint theme) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_AudioSettings_Theme(cmd, theme);
	return res;
}

static struct {
	jmethodID jmid_MasterVolumeChanged;
	jmethodID jmid_ThemeChanged;
} s_cb_jpsumo_AudioSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024AudioSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_AudioSettingsState_cache.jmid_MasterVolumeChanged = (*env)->GetStaticMethodID(env, jcls, "mastervolumechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$AudioSettingsState$Callback;I)V");
	s_cb_jpsumo_AudioSettingsState_cache.jmid_ThemeChanged = (*env)->GetStaticMethodID(env, jcls, "themechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$AudioSettingsState$Callback;I)V");
}

static int evt_jpsumo_AudioSettingsState_MasterVolumeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t volume;
	int res = arsdk_cmd_dec_Jpsumo_AudioSettingsState_MasterVolumeChanged(cmd, &volume);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_AudioSettingsState_cache.jmid_MasterVolumeChanged, callback, (jint)volume);
	return 0;
}

static int evt_jpsumo_AudioSettingsState_ThemeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t theme;
	int res = arsdk_cmd_dec_Jpsumo_AudioSettingsState_ThemeChanged(cmd, &theme);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_AudioSettingsState_cache.jmid_ThemeChanged, callback, (jint)theme);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024AudioSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 13)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_AudioSettingsState_MasterVolumeChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_AudioSettingsState_ThemeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024RoadPlan_nativeEncodeAllScriptsMetadata(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_RoadPlan_AllScriptsMetadata(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024RoadPlan_nativeEncodeScriptUploaded(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring uuid, jstring md5Hash) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_uuid = (*env)->GetStringUTFChars(env, uuid, NULL);
	const char* c_md5Hash = (*env)->GetStringUTFChars(env, md5Hash, NULL);
	int res = arsdk_cmd_enc_Jpsumo_RoadPlan_ScriptUploaded(cmd, c_uuid, c_md5Hash);
	if (c_uuid != NULL) (*env)->ReleaseStringUTFChars(env, uuid, c_uuid);
	if (c_md5Hash != NULL) (*env)->ReleaseStringUTFChars(env, md5Hash, c_md5Hash);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024RoadPlan_nativeEncodeScriptDelete(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring uuid) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_uuid = (*env)->GetStringUTFChars(env, uuid, NULL);
	int res = arsdk_cmd_enc_Jpsumo_RoadPlan_ScriptDelete(cmd, c_uuid);
	if (c_uuid != NULL) (*env)->ReleaseStringUTFChars(env, uuid, c_uuid);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024RoadPlan_nativeEncodePlayScript(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring uuid) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_uuid = (*env)->GetStringUTFChars(env, uuid, NULL);
	int res = arsdk_cmd_enc_Jpsumo_RoadPlan_PlayScript(cmd, c_uuid);
	if (c_uuid != NULL) (*env)->ReleaseStringUTFChars(env, uuid, c_uuid);
	return res;
}

static struct {
	jmethodID jmid_ScriptMetadataListChanged;
	jmethodID jmid_AllScriptsMetadataChanged;
	jmethodID jmid_ScriptUploadChanged;
	jmethodID jmid_ScriptDeleteChanged;
	jmethodID jmid_PlayScriptChanged;
} s_cb_jpsumo_RoadPlanState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024RoadPlanState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_RoadPlanState_cache.jmid_ScriptMetadataListChanged = (*env)->GetStaticMethodID(env, jcls, "scriptmetadatalistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$RoadPlanState$Callback;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V");
	s_cb_jpsumo_RoadPlanState_cache.jmid_AllScriptsMetadataChanged = (*env)->GetStaticMethodID(env, jcls, "allscriptsmetadatachanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$RoadPlanState$Callback;)V");
	s_cb_jpsumo_RoadPlanState_cache.jmid_ScriptUploadChanged = (*env)->GetStaticMethodID(env, jcls, "scriptuploadchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$RoadPlanState$Callback;I)V");
	s_cb_jpsumo_RoadPlanState_cache.jmid_ScriptDeleteChanged = (*env)->GetStaticMethodID(env, jcls, "scriptdeletechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$RoadPlanState$Callback;I)V");
	s_cb_jpsumo_RoadPlanState_cache.jmid_PlayScriptChanged = (*env)->GetStaticMethodID(env, jcls, "playscriptchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$RoadPlanState$Callback;I)V");
}

static int evt_jpsumo_RoadPlanState_ScriptMetadataListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * uuid;
	uint8_t version;
	const char * product;
	const char * name;
	uint64_t lastModified;
	int res = arsdk_cmd_dec_Jpsumo_RoadPlanState_ScriptMetadataListChanged(cmd, &uuid, &version, &product, &name, &lastModified);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_RoadPlanState_cache.jmid_ScriptMetadataListChanged, callback, (*env)->NewStringUTF(env, uuid), (jint)version, (*env)->NewStringUTF(env, product), (*env)->NewStringUTF(env, name), (jlong)lastModified);
	return 0;
}

static int evt_jpsumo_RoadPlanState_AllScriptsMetadataChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Jpsumo_RoadPlanState_AllScriptsMetadataChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_RoadPlanState_cache.jmid_AllScriptsMetadataChanged, callback);
	return 0;
}

static int evt_jpsumo_RoadPlanState_ScriptUploadChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t resultCode;
	int res = arsdk_cmd_dec_Jpsumo_RoadPlanState_ScriptUploadChanged(cmd, &resultCode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_RoadPlanState_cache.jmid_ScriptUploadChanged, callback, (jint)resultCode);
	return 0;
}

static int evt_jpsumo_RoadPlanState_ScriptDeleteChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t resultCode;
	int res = arsdk_cmd_dec_Jpsumo_RoadPlanState_ScriptDeleteChanged(cmd, &resultCode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_RoadPlanState_cache.jmid_ScriptDeleteChanged, callback, (jint)resultCode);
	return 0;
}

static int evt_jpsumo_RoadPlanState_PlayScriptChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t resultCode;
	int res = arsdk_cmd_dec_Jpsumo_RoadPlanState_PlayScriptChanged(cmd, &resultCode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_RoadPlanState_cache.jmid_PlayScriptChanged, callback, (jint)resultCode);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024RoadPlanState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 15)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_RoadPlanState_ScriptMetadataListChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_RoadPlanState_AllScriptsMetadataChanged(env, jcls, cmd, callback);
		case 2: return evt_jpsumo_RoadPlanState_ScriptUploadChanged(env, jcls, cmd, callback);
		case 3: return evt_jpsumo_RoadPlanState_ScriptDeleteChanged(env, jcls, cmd, callback);
		case 4: return evt_jpsumo_RoadPlanState_PlayScriptChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024SpeedSettings_nativeEncodeOutdoor(JNIEnv *env, jclass jcls, jlong nativeCmd, jint outdoor) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_SpeedSettings_Outdoor(cmd, outdoor);
	return res;
}

static struct {
	jmethodID jmid_OutdoorChanged;
} s_cb_jpsumo_SpeedSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024SpeedSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_SpeedSettingsState_cache.jmid_OutdoorChanged = (*env)->GetStaticMethodID(env, jcls, "outdoorchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$SpeedSettingsState$Callback;I)V");
}

static int evt_jpsumo_SpeedSettingsState_OutdoorChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t outdoor;
	int res = arsdk_cmd_dec_Jpsumo_SpeedSettingsState_OutdoorChanged(cmd, &outdoor);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_SpeedSettingsState_cache.jmid_OutdoorChanged, callback, (jint)outdoor);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024SpeedSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 17)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_SpeedSettingsState_OutdoorChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaStreaming_nativeEncodeVideoEnable(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_MediaStreaming_VideoEnable(cmd, enable);
	return res;
}

static struct {
	jmethodID jmid_VideoEnableChanged;
} s_cb_jpsumo_MediaStreamingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaStreamingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_MediaStreamingState_cache.jmid_VideoEnableChanged = (*env)->GetStaticMethodID(env, jcls, "videoenablechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaStreamingState$Callback;I)V");
}

static int evt_jpsumo_MediaStreamingState_VideoEnableChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t enabled;
	int res = arsdk_cmd_dec_Jpsumo_MediaStreamingState_VideoEnableChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaStreamingState_cache.jmid_VideoEnableChanged, callback, (jint)enabled);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaStreamingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 19)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_MediaStreamingState_VideoEnableChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_PictureEventChanged;
	jmethodID jmid_VideoEventChanged;
} s_cb_jpsumo_MediaRecordEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecordEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_MediaRecordEvent_cache.jmid_PictureEventChanged = (*env)->GetStaticMethodID(env, jcls, "pictureeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaRecordEvent$Callback;II)V");
	s_cb_jpsumo_MediaRecordEvent_cache.jmid_VideoEventChanged = (*env)->GetStaticMethodID(env, jcls, "videoeventchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$MediaRecordEvent$Callback;II)V");
}

static int evt_jpsumo_MediaRecordEvent_PictureEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Jpsumo_MediaRecordEvent_PictureEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaRecordEvent_cache.jmid_PictureEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

static int evt_jpsumo_MediaRecordEvent_VideoEventChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t event;
	int32_t error;
	int res = arsdk_cmd_dec_Jpsumo_MediaRecordEvent_VideoEventChanged(cmd, &event, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_MediaRecordEvent_cache.jmid_VideoEventChanged, callback, (jint)event, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024MediaRecordEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 20)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_MediaRecordEvent_PictureEventChanged(env, jcls, cmd, callback);
		case 1: return evt_jpsumo_MediaRecordEvent_VideoEventChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024VideoSettings_nativeEncodeAutorecord(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enabled) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Jpsumo_VideoSettings_Autorecord(cmd, enabled);
	return res;
}

static struct {
	jmethodID jmid_AutorecordChanged;
} s_cb_jpsumo_VideoSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024VideoSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_jpsumo_VideoSettingsState_cache.jmid_AutorecordChanged = (*env)->GetStaticMethodID(env, jcls, "autorecordchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureJpsumo$VideoSettingsState$Callback;I)V");
}

static int evt_jpsumo_VideoSettingsState_AutorecordChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Jpsumo_VideoSettingsState_AutorecordChanged(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_jpsumo_VideoSettingsState_cache.jmid_AutorecordChanged, callback, (jint)enabled);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureJpsumo_00024VideoSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 3 || cmd->cls_id != 22)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_jpsumo_VideoSettingsState_AutorecordChanged(env, jcls, cmd, callback);
	}
	return -1;
}

