/** Generated, do not edit ! */

static struct {
	jmethodID jmid_WifiList;
	jmethodID jmid_ConnexionChanged;
	jmethodID jmid_WifiAuthChannelListChanged;
	jmethodID jmid_AllWifiAuthChannelChanged;
	jmethodID jmid_WifiSignalChanged;
	jmethodID jmid_WifiAuthChannelListChangedV2;
	jmethodID jmid_WifiCountryChanged;
	jmethodID jmid_WifiEnvironmentChanged;
} s_cb_skyctrl_WifiState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024WifiState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_WifiState_cache.jmid_WifiList = (*env)->GetStaticMethodID(env, jcls, "wifilist", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;Ljava/lang/String;Ljava/lang/String;IIII)V");
	s_cb_skyctrl_WifiState_cache.jmid_ConnexionChanged = (*env)->GetStaticMethodID(env, jcls, "connexionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;Ljava/lang/String;I)V");
	s_cb_skyctrl_WifiState_cache.jmid_WifiAuthChannelListChanged = (*env)->GetStaticMethodID(env, jcls, "wifiauthchannellistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;III)V");
	s_cb_skyctrl_WifiState_cache.jmid_AllWifiAuthChannelChanged = (*env)->GetStaticMethodID(env, jcls, "allwifiauthchannelchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;)V");
	s_cb_skyctrl_WifiState_cache.jmid_WifiSignalChanged = (*env)->GetStaticMethodID(env, jcls, "wifisignalchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;I)V");
	s_cb_skyctrl_WifiState_cache.jmid_WifiAuthChannelListChangedV2 = (*env)->GetStaticMethodID(env, jcls, "wifiauthchannellistchangedv2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;IIII)V");
	s_cb_skyctrl_WifiState_cache.jmid_WifiCountryChanged = (*env)->GetStaticMethodID(env, jcls, "wificountrychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;Ljava/lang/String;)V");
	s_cb_skyctrl_WifiState_cache.jmid_WifiEnvironmentChanged = (*env)->GetStaticMethodID(env, jcls, "wifienvironmentchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$WifiState$Callback;I)V");
}

static int evt_skyctrl_WifiState_WifiList(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * bssid;
	const char * ssid;
	uint8_t secured;
	uint8_t saved;
	int32_t rssi;
	int32_t frequency;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_WifiList(cmd, &bssid, &ssid, &secured, &saved, &rssi, &frequency);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_WifiList, callback, (*env)->NewStringUTF(env, bssid), (*env)->NewStringUTF(env, ssid), (jint)secured, (jint)saved, (jint)rssi, (jint)frequency);
	return 0;
}

static int evt_skyctrl_WifiState_ConnexionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * ssid;
	int32_t status;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_ConnexionChanged(cmd, &ssid, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_ConnexionChanged, callback, (*env)->NewStringUTF(env, ssid), (jint)status);
	return 0;
}

static int evt_skyctrl_WifiState_WifiAuthChannelListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t band;
	uint8_t channel;
	uint8_t in_or_out;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_WifiAuthChannelListChanged(cmd, &band, &channel, &in_or_out);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_WifiAuthChannelListChanged, callback, (jint)band, (jint)channel, (jint)in_or_out);
	return 0;
}

static int evt_skyctrl_WifiState_AllWifiAuthChannelChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_WifiState_AllWifiAuthChannelChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_AllWifiAuthChannelChanged, callback);
	return 0;
}

static int evt_skyctrl_WifiState_WifiSignalChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t level;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_WifiSignalChanged(cmd, &level);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_WifiSignalChanged, callback, (jint)level);
	return 0;
}

static int evt_skyctrl_WifiState_WifiAuthChannelListChangedV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t band;
	uint8_t channel;
	uint8_t in_or_out;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_WifiAuthChannelListChangedV2(cmd, &band, &channel, &in_or_out, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_WifiAuthChannelListChangedV2, callback, (jint)band, (jint)channel, (jint)in_or_out, (jint)list_flags);
	return 0;
}

static int evt_skyctrl_WifiState_WifiCountryChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * code;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_WifiCountryChanged(cmd, &code);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_WifiCountryChanged, callback, (*env)->NewStringUTF(env, code));
	return 0;
}

static int evt_skyctrl_WifiState_WifiEnvironmentChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t environment;
	int res = arsdk_cmd_dec_Skyctrl_WifiState_WifiEnvironmentChanged(cmd, &environment);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_WifiState_cache.jmid_WifiEnvironmentChanged, callback, (jint)environment);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024WifiState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_WifiState_WifiList(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_WifiState_ConnexionChanged(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_WifiState_WifiAuthChannelListChanged(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_WifiState_AllWifiAuthChannelChanged(env, jcls, cmd, callback);
		case 4: return evt_skyctrl_WifiState_WifiSignalChanged(env, jcls, cmd, callback);
		case 5: return evt_skyctrl_WifiState_WifiAuthChannelListChangedV2(env, jcls, cmd, callback);
		case 6: return evt_skyctrl_WifiState_WifiCountryChanged(env, jcls, cmd, callback);
		case 7: return evt_skyctrl_WifiState_WifiEnvironmentChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Wifi_nativeEncodeRequestWifiList(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Wifi_RequestWifiList(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Wifi_nativeEncodeRequestCurrentWifi(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Wifi_RequestCurrentWifi(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Wifi_nativeEncodeConnectToWifi(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring bssid, jstring ssid, jstring passphrase) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_bssid = (*env)->GetStringUTFChars(env, bssid, NULL);
	const char* c_ssid = (*env)->GetStringUTFChars(env, ssid, NULL);
	const char* c_passphrase = (*env)->GetStringUTFChars(env, passphrase, NULL);
	int res = arsdk_cmd_enc_Skyctrl_Wifi_ConnectToWifi(cmd, c_bssid, c_ssid, c_passphrase);
	if (c_bssid != NULL) (*env)->ReleaseStringUTFChars(env, bssid, c_bssid);
	if (c_ssid != NULL) (*env)->ReleaseStringUTFChars(env, ssid, c_ssid);
	if (c_passphrase != NULL) (*env)->ReleaseStringUTFChars(env, passphrase, c_passphrase);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Wifi_nativeEncodeForgetWifi(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring ssid) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_ssid = (*env)->GetStringUTFChars(env, ssid, NULL);
	int res = arsdk_cmd_enc_Skyctrl_Wifi_ForgetWifi(cmd, c_ssid);
	if (c_ssid != NULL) (*env)->ReleaseStringUTFChars(env, ssid, c_ssid);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Wifi_nativeEncodeWifiAuthChannel(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Wifi_WifiAuthChannel(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Device_nativeEncodeRequestDeviceList(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Device_RequestDeviceList(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Device_nativeEncodeRequestCurrentDevice(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Device_RequestCurrentDevice(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Device_nativeEncodeConnectToDevice(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring deviceName) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_deviceName = (*env)->GetStringUTFChars(env, deviceName, NULL);
	int res = arsdk_cmd_enc_Skyctrl_Device_ConnectToDevice(cmd, c_deviceName);
	if (c_deviceName != NULL) (*env)->ReleaseStringUTFChars(env, deviceName, c_deviceName);
	return res;
}

static struct {
	jmethodID jmid_DeviceList;
	jmethodID jmid_ConnexionChanged;
} s_cb_skyctrl_DeviceState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024DeviceState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_DeviceState_cache.jmid_DeviceList = (*env)->GetStaticMethodID(env, jcls, "devicelist", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$DeviceState$Callback;Ljava/lang/String;)V");
	s_cb_skyctrl_DeviceState_cache.jmid_ConnexionChanged = (*env)->GetStaticMethodID(env, jcls, "connexionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$DeviceState$Callback;ILjava/lang/String;I)V");
}

static int evt_skyctrl_DeviceState_DeviceList(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * name;
	int res = arsdk_cmd_dec_Skyctrl_DeviceState_DeviceList(cmd, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_DeviceState_cache.jmid_DeviceList, callback, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_skyctrl_DeviceState_ConnexionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t status;
	const char * deviceName;
	uint16_t deviceProductID;
	int res = arsdk_cmd_dec_Skyctrl_DeviceState_ConnexionChanged(cmd, &status, &deviceName, &deviceProductID);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_DeviceState_cache.jmid_ConnexionChanged, callback, (jint)status, (*env)->NewStringUTF(env, deviceName), (jint)deviceProductID);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024DeviceState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 3)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_DeviceState_DeviceList(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_DeviceState_ConnexionChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Settings_nativeEncodeAllSettings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Settings_AllSettings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Settings_nativeEncodeReset(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Settings_Reset(cmd);
	return res;
}

static struct {
	jmethodID jmid_AllSettingsChanged;
	jmethodID jmid_ResetChanged;
	jmethodID jmid_ProductSerialChanged;
	jmethodID jmid_ProductVariantChanged;
	jmethodID jmid_ProductVersionChanged;
	jmethodID jmid_CPUID;
} s_cb_skyctrl_SettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024SettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_SettingsState_cache.jmid_AllSettingsChanged = (*env)->GetStaticMethodID(env, jcls, "allsettingschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SettingsState$Callback;)V");
	s_cb_skyctrl_SettingsState_cache.jmid_ResetChanged = (*env)->GetStaticMethodID(env, jcls, "resetchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SettingsState$Callback;)V");
	s_cb_skyctrl_SettingsState_cache.jmid_ProductSerialChanged = (*env)->GetStaticMethodID(env, jcls, "productserialchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_skyctrl_SettingsState_cache.jmid_ProductVariantChanged = (*env)->GetStaticMethodID(env, jcls, "productvariantchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SettingsState$Callback;I)V");
	s_cb_skyctrl_SettingsState_cache.jmid_ProductVersionChanged = (*env)->GetStaticMethodID(env, jcls, "productversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SettingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_skyctrl_SettingsState_cache.jmid_CPUID = (*env)->GetStaticMethodID(env, jcls, "cpuid", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SettingsState$Callback;Ljava/lang/String;)V");
}

static int evt_skyctrl_SettingsState_AllSettingsChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_SettingsState_AllSettingsChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SettingsState_cache.jmid_AllSettingsChanged, callback);
	return 0;
}

static int evt_skyctrl_SettingsState_ResetChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_SettingsState_ResetChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SettingsState_cache.jmid_ResetChanged, callback);
	return 0;
}

static int evt_skyctrl_SettingsState_ProductSerialChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * serialNumber;
	int res = arsdk_cmd_dec_Skyctrl_SettingsState_ProductSerialChanged(cmd, &serialNumber);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SettingsState_cache.jmid_ProductSerialChanged, callback, (*env)->NewStringUTF(env, serialNumber));
	return 0;
}

static int evt_skyctrl_SettingsState_ProductVariantChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t variant;
	int res = arsdk_cmd_dec_Skyctrl_SettingsState_ProductVariantChanged(cmd, &variant);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SettingsState_cache.jmid_ProductVariantChanged, callback, (jint)variant);
	return 0;
}

static int evt_skyctrl_SettingsState_ProductVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Skyctrl_SettingsState_ProductVersionChanged(cmd, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SettingsState_cache.jmid_ProductVersionChanged, callback, (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_skyctrl_SettingsState_CPUID(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * id;
	int res = arsdk_cmd_dec_Skyctrl_SettingsState_CPUID(cmd, &id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SettingsState_cache.jmid_CPUID, callback, (*env)->NewStringUTF(env, id));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024SettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 5)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_SettingsState_AllSettingsChanged(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_SettingsState_ResetChanged(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_SettingsState_ProductSerialChanged(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_SettingsState_ProductVariantChanged(env, jcls, cmd, callback);
		case 4: return evt_skyctrl_SettingsState_ProductVersionChanged(env, jcls, cmd, callback);
		case 5: return evt_skyctrl_SettingsState_CPUID(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Common_nativeEncodeAllStates(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Common_AllStates(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Common_nativeEncodeCurrentDateTime(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring datetime) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_datetime = (*env)->GetStringUTFChars(env, datetime, NULL);
	int res = arsdk_cmd_enc_Skyctrl_Common_CurrentDateTime(cmd, c_datetime);
	if (c_datetime != NULL) (*env)->ReleaseStringUTFChars(env, datetime, c_datetime);
	return res;
}

static struct {
	jmethodID jmid_AllStatesChanged;
	jmethodID jmid_CurrentDateTimeChanged;
} s_cb_skyctrl_CommonState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CommonState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_CommonState_cache.jmid_AllStatesChanged = (*env)->GetStaticMethodID(env, jcls, "allstateschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CommonState$Callback;)V");
	s_cb_skyctrl_CommonState_cache.jmid_CurrentDateTimeChanged = (*env)->GetStaticMethodID(env, jcls, "currentdatetimechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CommonState$Callback;Ljava/lang/String;)V");
}

static int evt_skyctrl_CommonState_AllStatesChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_CommonState_AllStatesChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CommonState_cache.jmid_AllStatesChanged, callback);
	return 0;
}

static int evt_skyctrl_CommonState_CurrentDateTimeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * datetime;
	int res = arsdk_cmd_dec_Skyctrl_CommonState_CurrentDateTimeChanged(cmd, &datetime);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CommonState_cache.jmid_CurrentDateTimeChanged, callback, (*env)->NewStringUTF(env, datetime));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CommonState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 7)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_CommonState_AllStatesChanged(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_CommonState_CurrentDateTimeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_BatteryChanged;
	jmethodID jmid_GpsFixChanged;
	jmethodID jmid_GpsPositionChanged;
	jmethodID jmid_BatteryState;
	jmethodID jmid_AttitudeChanged;
} s_cb_skyctrl_SkyControllerState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024SkyControllerState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_SkyControllerState_cache.jmid_BatteryChanged = (*env)->GetStaticMethodID(env, jcls, "batterychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SkyControllerState$Callback;I)V");
	s_cb_skyctrl_SkyControllerState_cache.jmid_GpsFixChanged = (*env)->GetStaticMethodID(env, jcls, "gpsfixchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SkyControllerState$Callback;I)V");
	s_cb_skyctrl_SkyControllerState_cache.jmid_GpsPositionChanged = (*env)->GetStaticMethodID(env, jcls, "gpspositionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SkyControllerState$Callback;DDDF)V");
	s_cb_skyctrl_SkyControllerState_cache.jmid_BatteryState = (*env)->GetStaticMethodID(env, jcls, "batterystate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SkyControllerState$Callback;I)V");
	s_cb_skyctrl_SkyControllerState_cache.jmid_AttitudeChanged = (*env)->GetStaticMethodID(env, jcls, "attitudechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$SkyControllerState$Callback;FFFF)V");
}

static int evt_skyctrl_SkyControllerState_BatteryChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t percent;
	int res = arsdk_cmd_dec_Skyctrl_SkyControllerState_BatteryChanged(cmd, &percent);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SkyControllerState_cache.jmid_BatteryChanged, callback, (jint)percent);
	return 0;
}

static int evt_skyctrl_SkyControllerState_GpsFixChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t fixed;
	int res = arsdk_cmd_dec_Skyctrl_SkyControllerState_GpsFixChanged(cmd, &fixed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SkyControllerState_cache.jmid_GpsFixChanged, callback, (jint)fixed);
	return 0;
}

static int evt_skyctrl_SkyControllerState_GpsPositionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	double altitude;
	float heading;
	int res = arsdk_cmd_dec_Skyctrl_SkyControllerState_GpsPositionChanged(cmd, &latitude, &longitude, &altitude, &heading);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SkyControllerState_cache.jmid_GpsPositionChanged, callback, (jdouble)latitude, (jdouble)longitude, (jdouble)altitude, (jfloat)heading);
	return 0;
}

static int evt_skyctrl_SkyControllerState_BatteryState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Skyctrl_SkyControllerState_BatteryState(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SkyControllerState_cache.jmid_BatteryState, callback, (jint)state);
	return 0;
}

static int evt_skyctrl_SkyControllerState_AttitudeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float q0;
	float q1;
	float q2;
	float q3;
	int res = arsdk_cmd_dec_Skyctrl_SkyControllerState_AttitudeChanged(cmd, &q0, &q1, &q2, &q3);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_SkyControllerState_cache.jmid_AttitudeChanged, callback, (jfloat)q0, (jfloat)q1, (jfloat)q2, (jfloat)q3);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024SkyControllerState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 8)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_SkyControllerState_BatteryChanged(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_SkyControllerState_GpsFixChanged(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_SkyControllerState_GpsPositionChanged(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_SkyControllerState_BatteryState(env, jcls, cmd, callback);
		case 4: return evt_skyctrl_SkyControllerState_AttitudeChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AccessPointSettings_nativeEncodeAccessPointSSID(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring ssid) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_ssid = (*env)->GetStringUTFChars(env, ssid, NULL);
	int res = arsdk_cmd_enc_Skyctrl_AccessPointSettings_AccessPointSSID(cmd, c_ssid);
	if (c_ssid != NULL) (*env)->ReleaseStringUTFChars(env, ssid, c_ssid);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AccessPointSettings_nativeEncodeAccessPointChannel(JNIEnv *env, jclass jcls, jlong nativeCmd, jint channel) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AccessPointSettings_AccessPointChannel(cmd, channel);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AccessPointSettings_nativeEncodeWifiSelection(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jint band, jint channel) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AccessPointSettings_WifiSelection(cmd, type, band, channel);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AccessPointSettings_nativeEncodeWifiSecurity(JNIEnv *env, jclass jcls, jlong nativeCmd, jint security_type, jstring key) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_key = (*env)->GetStringUTFChars(env, key, NULL);
	int res = arsdk_cmd_enc_Skyctrl_AccessPointSettings_WifiSecurity(cmd, security_type, c_key);
	if (c_key != NULL) (*env)->ReleaseStringUTFChars(env, key, c_key);
	return res;
}

static struct {
	jmethodID jmid_AccessPointSSIDChanged;
	jmethodID jmid_AccessPointChannelChanged;
	jmethodID jmid_WifiSelectionChanged;
	jmethodID jmid_WifiSecurityChanged;
} s_cb_skyctrl_AccessPointSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AccessPointSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_AccessPointSettingsState_cache.jmid_AccessPointSSIDChanged = (*env)->GetStaticMethodID(env, jcls, "accesspointssidchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AccessPointSettingsState$Callback;Ljava/lang/String;)V");
	s_cb_skyctrl_AccessPointSettingsState_cache.jmid_AccessPointChannelChanged = (*env)->GetStaticMethodID(env, jcls, "accesspointchannelchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AccessPointSettingsState$Callback;I)V");
	s_cb_skyctrl_AccessPointSettingsState_cache.jmid_WifiSelectionChanged = (*env)->GetStaticMethodID(env, jcls, "wifiselectionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AccessPointSettingsState$Callback;III)V");
	s_cb_skyctrl_AccessPointSettingsState_cache.jmid_WifiSecurityChanged = (*env)->GetStaticMethodID(env, jcls, "wifisecuritychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AccessPointSettingsState$Callback;ILjava/lang/String;)V");
}

static int evt_skyctrl_AccessPointSettingsState_AccessPointSSIDChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * ssid;
	int res = arsdk_cmd_dec_Skyctrl_AccessPointSettingsState_AccessPointSSIDChanged(cmd, &ssid);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AccessPointSettingsState_cache.jmid_AccessPointSSIDChanged, callback, (*env)->NewStringUTF(env, ssid));
	return 0;
}

static int evt_skyctrl_AccessPointSettingsState_AccessPointChannelChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t channel;
	int res = arsdk_cmd_dec_Skyctrl_AccessPointSettingsState_AccessPointChannelChanged(cmd, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AccessPointSettingsState_cache.jmid_AccessPointChannelChanged, callback, (jint)channel);
	return 0;
}

static int evt_skyctrl_AccessPointSettingsState_WifiSelectionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Skyctrl_AccessPointSettingsState_WifiSelectionChanged(cmd, &type, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AccessPointSettingsState_cache.jmid_WifiSelectionChanged, callback, (jint)type, (jint)band, (jint)channel);
	return 0;
}

static int evt_skyctrl_AccessPointSettingsState_WifiSecurityChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t security_type;
	const char * key;
	int res = arsdk_cmd_dec_Skyctrl_AccessPointSettingsState_WifiSecurityChanged(cmd, &security_type, &key);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AccessPointSettingsState_cache.jmid_WifiSecurityChanged, callback, (jint)security_type, (*env)->NewStringUTF(env, key));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AccessPointSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 10)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_AccessPointSettingsState_AccessPointSSIDChanged(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_AccessPointSettingsState_AccessPointChannelChanged(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_AccessPointSettingsState_WifiSelectionChanged(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_AccessPointSettingsState_WifiSecurityChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Camera_nativeEncodeResetOrientation(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Camera_ResetOrientation(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonMappings_nativeEncodeGetCurrentButtonMappings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_ButtonMappings_GetCurrentButtonMappings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonMappings_nativeEncodeGetAvailableButtonMappings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_ButtonMappings_GetAvailableButtonMappings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonMappings_nativeEncodeSetButtonMapping(JNIEnv *env, jclass jcls, jlong nativeCmd, jint key_id, jstring mapping_uid) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_mapping_uid = (*env)->GetStringUTFChars(env, mapping_uid, NULL);
	int res = arsdk_cmd_enc_Skyctrl_ButtonMappings_SetButtonMapping(cmd, key_id, c_mapping_uid);
	if (c_mapping_uid != NULL) (*env)->ReleaseStringUTFChars(env, mapping_uid, c_mapping_uid);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonMappings_nativeEncodeDefaultButtonMapping(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_ButtonMappings_DefaultButtonMapping(cmd);
	return res;
}

static struct {
	jmethodID jmid_currentButtonMappings;
	jmethodID jmid_allCurrentButtonMappingsSent;
	jmethodID jmid_availableButtonMappings;
	jmethodID jmid_allAvailableButtonsMappingsSent;
} s_cb_skyctrl_ButtonMappingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonMappingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_ButtonMappingsState_cache.jmid_currentButtonMappings = (*env)->GetStaticMethodID(env, jcls, "currentbuttonmappings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$ButtonMappingsState$Callback;ILjava/lang/String;)V");
	s_cb_skyctrl_ButtonMappingsState_cache.jmid_allCurrentButtonMappingsSent = (*env)->GetStaticMethodID(env, jcls, "allcurrentbuttonmappingssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$ButtonMappingsState$Callback;)V");
	s_cb_skyctrl_ButtonMappingsState_cache.jmid_availableButtonMappings = (*env)->GetStaticMethodID(env, jcls, "availablebuttonmappings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$ButtonMappingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_skyctrl_ButtonMappingsState_cache.jmid_allAvailableButtonsMappingsSent = (*env)->GetStaticMethodID(env, jcls, "allavailablebuttonsmappingssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$ButtonMappingsState$Callback;)V");
}

static int evt_skyctrl_ButtonMappingsState_currentButtonMappings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t key_id;
	const char * mapping_uid;
	int res = arsdk_cmd_dec_Skyctrl_ButtonMappingsState_CurrentButtonMappings(cmd, &key_id, &mapping_uid);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_ButtonMappingsState_cache.jmid_currentButtonMappings, callback, (jint)key_id, (*env)->NewStringUTF(env, mapping_uid));
	return 0;
}

static int evt_skyctrl_ButtonMappingsState_allCurrentButtonMappingsSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_ButtonMappingsState_AllCurrentButtonMappingsSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_ButtonMappingsState_cache.jmid_allCurrentButtonMappingsSent, callback);
	return 0;
}

static int evt_skyctrl_ButtonMappingsState_availableButtonMappings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * mapping_uid;
	const char * name;
	int res = arsdk_cmd_dec_Skyctrl_ButtonMappingsState_AvailableButtonMappings(cmd, &mapping_uid, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_ButtonMappingsState_cache.jmid_availableButtonMappings, callback, (*env)->NewStringUTF(env, mapping_uid), (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_skyctrl_ButtonMappingsState_allAvailableButtonsMappingsSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_ButtonMappingsState_AllAvailableButtonsMappingsSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_ButtonMappingsState_cache.jmid_allAvailableButtonsMappingsSent, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonMappingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 13)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_ButtonMappingsState_currentButtonMappings(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_ButtonMappingsState_allCurrentButtonMappingsSent(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_ButtonMappingsState_availableButtonMappings(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_ButtonMappingsState_allAvailableButtonsMappingsSent(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisMappings_nativeEncodeGetCurrentAxisMappings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AxisMappings_GetCurrentAxisMappings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisMappings_nativeEncodeGetAvailableAxisMappings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AxisMappings_GetAvailableAxisMappings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisMappings_nativeEncodeSetAxisMapping(JNIEnv *env, jclass jcls, jlong nativeCmd, jint axis_id, jstring mapping_uid) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_mapping_uid = (*env)->GetStringUTFChars(env, mapping_uid, NULL);
	int res = arsdk_cmd_enc_Skyctrl_AxisMappings_SetAxisMapping(cmd, axis_id, c_mapping_uid);
	if (c_mapping_uid != NULL) (*env)->ReleaseStringUTFChars(env, mapping_uid, c_mapping_uid);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisMappings_nativeEncodeDefaultAxisMapping(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AxisMappings_DefaultAxisMapping(cmd);
	return res;
}

static struct {
	jmethodID jmid_currentAxisMappings;
	jmethodID jmid_allCurrentAxisMappingsSent;
	jmethodID jmid_availableAxisMappings;
	jmethodID jmid_allAvailableAxisMappingsSent;
} s_cb_skyctrl_AxisMappingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisMappingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_AxisMappingsState_cache.jmid_currentAxisMappings = (*env)->GetStaticMethodID(env, jcls, "currentaxismappings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisMappingsState$Callback;ILjava/lang/String;)V");
	s_cb_skyctrl_AxisMappingsState_cache.jmid_allCurrentAxisMappingsSent = (*env)->GetStaticMethodID(env, jcls, "allcurrentaxismappingssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisMappingsState$Callback;)V");
	s_cb_skyctrl_AxisMappingsState_cache.jmid_availableAxisMappings = (*env)->GetStaticMethodID(env, jcls, "availableaxismappings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisMappingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_skyctrl_AxisMappingsState_cache.jmid_allAvailableAxisMappingsSent = (*env)->GetStaticMethodID(env, jcls, "allavailableaxismappingssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisMappingsState$Callback;)V");
}

static int evt_skyctrl_AxisMappingsState_currentAxisMappings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t axis_id;
	const char * mapping_uid;
	int res = arsdk_cmd_dec_Skyctrl_AxisMappingsState_CurrentAxisMappings(cmd, &axis_id, &mapping_uid);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisMappingsState_cache.jmid_currentAxisMappings, callback, (jint)axis_id, (*env)->NewStringUTF(env, mapping_uid));
	return 0;
}

static int evt_skyctrl_AxisMappingsState_allCurrentAxisMappingsSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_AxisMappingsState_AllCurrentAxisMappingsSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisMappingsState_cache.jmid_allCurrentAxisMappingsSent, callback);
	return 0;
}

static int evt_skyctrl_AxisMappingsState_availableAxisMappings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * mapping_uid;
	const char * name;
	int res = arsdk_cmd_dec_Skyctrl_AxisMappingsState_AvailableAxisMappings(cmd, &mapping_uid, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisMappingsState_cache.jmid_availableAxisMappings, callback, (*env)->NewStringUTF(env, mapping_uid), (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_skyctrl_AxisMappingsState_allAvailableAxisMappingsSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_AxisMappingsState_AllAvailableAxisMappingsSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisMappingsState_cache.jmid_allAvailableAxisMappingsSent, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisMappingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 15)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_AxisMappingsState_currentAxisMappings(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_AxisMappingsState_allCurrentAxisMappingsSent(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_AxisMappingsState_availableAxisMappings(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_AxisMappingsState_allAvailableAxisMappingsSent(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisFilters_nativeEncodeGetCurrentAxisFilters(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AxisFilters_GetCurrentAxisFilters(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisFilters_nativeEncodeGetPresetAxisFilters(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AxisFilters_GetPresetAxisFilters(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisFilters_nativeEncodeSetAxisFilter(JNIEnv *env, jclass jcls, jlong nativeCmd, jint axis_id, jstring filter_uid_or_builder) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_filter_uid_or_builder = (*env)->GetStringUTFChars(env, filter_uid_or_builder, NULL);
	int res = arsdk_cmd_enc_Skyctrl_AxisFilters_SetAxisFilter(cmd, axis_id, c_filter_uid_or_builder);
	if (c_filter_uid_or_builder != NULL) (*env)->ReleaseStringUTFChars(env, filter_uid_or_builder, c_filter_uid_or_builder);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisFilters_nativeEncodeDefaultAxisFilters(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_AxisFilters_DefaultAxisFilters(cmd);
	return res;
}

static struct {
	jmethodID jmid_currentAxisFilters;
	jmethodID jmid_allCurrentFiltersSent;
	jmethodID jmid_presetAxisFilters;
	jmethodID jmid_allPresetFiltersSent;
} s_cb_skyctrl_AxisFiltersState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisFiltersState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_AxisFiltersState_cache.jmid_currentAxisFilters = (*env)->GetStaticMethodID(env, jcls, "currentaxisfilters", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisFiltersState$Callback;ILjava/lang/String;)V");
	s_cb_skyctrl_AxisFiltersState_cache.jmid_allCurrentFiltersSent = (*env)->GetStaticMethodID(env, jcls, "allcurrentfilterssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisFiltersState$Callback;)V");
	s_cb_skyctrl_AxisFiltersState_cache.jmid_presetAxisFilters = (*env)->GetStaticMethodID(env, jcls, "presetaxisfilters", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisFiltersState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_skyctrl_AxisFiltersState_cache.jmid_allPresetFiltersSent = (*env)->GetStaticMethodID(env, jcls, "allpresetfilterssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$AxisFiltersState$Callback;)V");
}

static int evt_skyctrl_AxisFiltersState_currentAxisFilters(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t axis_id;
	const char * filter_uid_or_builder;
	int res = arsdk_cmd_dec_Skyctrl_AxisFiltersState_CurrentAxisFilters(cmd, &axis_id, &filter_uid_or_builder);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisFiltersState_cache.jmid_currentAxisFilters, callback, (jint)axis_id, (*env)->NewStringUTF(env, filter_uid_or_builder));
	return 0;
}

static int evt_skyctrl_AxisFiltersState_allCurrentFiltersSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_AxisFiltersState_AllCurrentFiltersSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisFiltersState_cache.jmid_allCurrentFiltersSent, callback);
	return 0;
}

static int evt_skyctrl_AxisFiltersState_presetAxisFilters(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * filter_uid;
	const char * name;
	int res = arsdk_cmd_dec_Skyctrl_AxisFiltersState_PresetAxisFilters(cmd, &filter_uid, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisFiltersState_cache.jmid_presetAxisFilters, callback, (*env)->NewStringUTF(env, filter_uid), (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_skyctrl_AxisFiltersState_allPresetFiltersSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_AxisFiltersState_AllPresetFiltersSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_AxisFiltersState_cache.jmid_allPresetFiltersSent, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024AxisFiltersState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 17)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_AxisFiltersState_currentAxisFilters(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_AxisFiltersState_allCurrentFiltersSent(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_AxisFiltersState_presetAxisFilters(env, jcls, cmd, callback);
		case 3: return evt_skyctrl_AxisFiltersState_allPresetFiltersSent(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024GamepadInfos_nativeEncodeGetGamepadControls(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_GamepadInfos_GetGamepadControls(cmd);
	return res;
}

static struct {
	jmethodID jmid_gamepadControl;
	jmethodID jmid_allGamepadControlsSent;
} s_cb_skyctrl_GamepadInfosState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024GamepadInfosState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_GamepadInfosState_cache.jmid_gamepadControl = (*env)->GetStaticMethodID(env, jcls, "gamepadcontrol", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$GamepadInfosState$Callback;IILjava/lang/String;)V");
	s_cb_skyctrl_GamepadInfosState_cache.jmid_allGamepadControlsSent = (*env)->GetStaticMethodID(env, jcls, "allgamepadcontrolssent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$GamepadInfosState$Callback;)V");
}

static int evt_skyctrl_GamepadInfosState_gamepadControl(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int32_t id;
	const char * name;
	int res = arsdk_cmd_dec_Skyctrl_GamepadInfosState_GamepadControl(cmd, &type, &id, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_GamepadInfosState_cache.jmid_gamepadControl, callback, (jint)type, (jint)id, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_skyctrl_GamepadInfosState_allGamepadControlsSent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_GamepadInfosState_AllGamepadControlsSent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_GamepadInfosState_cache.jmid_allGamepadControlsSent, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024GamepadInfosState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 19)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_GamepadInfosState_gamepadControl(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_GamepadInfosState_allGamepadControlsSent(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CoPiloting_nativeEncodeSetPilotingSource(JNIEnv *env, jclass jcls, jlong nativeCmd, jint source) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_CoPiloting_SetPilotingSource(cmd, source);
	return res;
}

static struct {
	jmethodID jmid_pilotingSource;
} s_cb_skyctrl_CoPilotingState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CoPilotingState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_CoPilotingState_cache.jmid_pilotingSource = (*env)->GetStaticMethodID(env, jcls, "pilotingsource", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CoPilotingState$Callback;I)V");
}

static int evt_skyctrl_CoPilotingState_pilotingSource(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t source;
	int res = arsdk_cmd_dec_Skyctrl_CoPilotingState_PilotingSource(cmd, &source);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CoPilotingState_cache.jmid_pilotingSource, callback, (jint)source);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CoPilotingState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 21)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_CoPilotingState_pilotingSource(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Calibration_nativeEncodeEnableMagnetoCalibrationQualityUpdates(JNIEnv *env, jclass jcls, jlong nativeCmd, jint enable) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Calibration_EnableMagnetoCalibrationQualityUpdates(cmd, enable);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Calibration_nativeEncodeStartCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Calibration_StartCalibration(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Calibration_nativeEncodeAbortCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Calibration_AbortCalibration(cmd);
	return res;
}

static struct {
	jmethodID jmid_MagnetoCalibrationState;
	jmethodID jmid_MagnetoCalibrationQualityUpdatesState;
	jmethodID jmid_MagnetoCalibrationStateV2;
} s_cb_skyctrl_CalibrationState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CalibrationState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_CalibrationState_cache.jmid_MagnetoCalibrationState = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CalibrationState$Callback;IIII)V");
	s_cb_skyctrl_CalibrationState_cache.jmid_MagnetoCalibrationQualityUpdatesState = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationqualityupdatesstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CalibrationState$Callback;I)V");
	s_cb_skyctrl_CalibrationState_cache.jmid_MagnetoCalibrationStateV2 = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationstatev2", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CalibrationState$Callback;I)V");
}

static int evt_skyctrl_CalibrationState_MagnetoCalibrationState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t status;
	uint8_t X_Quality;
	uint8_t Y_Quality;
	uint8_t Z_Quality;
	int res = arsdk_cmd_dec_Skyctrl_CalibrationState_MagnetoCalibrationState(cmd, &status, &X_Quality, &Y_Quality, &Z_Quality);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CalibrationState_cache.jmid_MagnetoCalibrationState, callback, (jint)status, (jint)X_Quality, (jint)Y_Quality, (jint)Z_Quality);
	return 0;
}

static int evt_skyctrl_CalibrationState_MagnetoCalibrationQualityUpdatesState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Skyctrl_CalibrationState_MagnetoCalibrationQualityUpdatesState(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CalibrationState_cache.jmid_MagnetoCalibrationQualityUpdatesState, callback, (jint)enabled);
	return 0;
}

static int evt_skyctrl_CalibrationState_MagnetoCalibrationStateV2(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Skyctrl_CalibrationState_MagnetoCalibrationStateV2(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CalibrationState_cache.jmid_MagnetoCalibrationStateV2, callback, (jint)state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CalibrationState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 23)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_CalibrationState_MagnetoCalibrationState(env, jcls, cmd, callback);
		case 1: return evt_skyctrl_CalibrationState_MagnetoCalibrationQualityUpdatesState(env, jcls, cmd, callback);
		case 2: return evt_skyctrl_CalibrationState_MagnetoCalibrationStateV2(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_Settings;
} s_cb_skyctrl_ButtonEvents_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonEvents_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_ButtonEvents_cache.jmid_Settings = (*env)->GetStaticMethodID(env, jcls, "settings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$ButtonEvents$Callback;)V");
}

static int evt_skyctrl_ButtonEvents_Settings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Skyctrl_ButtonEvents_Settings(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_ButtonEvents_cache.jmid_Settings, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024ButtonEvents_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 24)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_ButtonEvents_Settings(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024Factory_nativeEncodeReset(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Skyctrl_Factory_Reset(cmd);
	return res;
}

static struct {
	jmethodID jmid_Shutdown;
} s_cb_skyctrl_CommonEventState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CommonEventState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_skyctrl_CommonEventState_cache.jmid_Shutdown = (*env)->GetStaticMethodID(env, jcls, "shutdown", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSkyctrl$CommonEventState$Callback;I)V");
}

static int evt_skyctrl_CommonEventState_Shutdown(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t reason;
	int res = arsdk_cmd_dec_Skyctrl_CommonEventState_Shutdown(cmd, &reason);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_skyctrl_CommonEventState_cache.jmid_Shutdown, callback, (jint)reason);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSkyctrl_00024CommonEventState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 4 || cmd->cls_id != 26)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_skyctrl_CommonEventState_Shutdown(env, jcls, cmd, callback);
	}
	return -1;
}

