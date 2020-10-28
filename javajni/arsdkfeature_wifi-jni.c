/** Generated, do not edit ! */

static struct {
	jmethodID jmid_scanned_item;
	jmethodID jmid_authorized_channel;
	jmethodID jmid_ap_channel_changed;
	jmethodID jmid_security_changed;
	jmethodID jmid_country_changed;
	jmethodID jmid_environment_changed;
	jmethodID jmid_rssi_changed;
	jmethodID jmid_supported_countries;
	jmethodID jmid_supported_security_types;
} s_cb_wifi_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_wifi_cache.jmid_scanned_item = (*env)->GetStaticMethodID(env, jcls, "scannedItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;Ljava/lang/String;IIII)V");
	s_cb_wifi_cache.jmid_authorized_channel = (*env)->GetStaticMethodID(env, jcls, "authorizedChannel", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;IIII)V");
	s_cb_wifi_cache.jmid_ap_channel_changed = (*env)->GetStaticMethodID(env, jcls, "apChannelChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;III)V");
	s_cb_wifi_cache.jmid_security_changed = (*env)->GetStaticMethodID(env, jcls, "securityChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;ILjava/lang/String;I)V");
	s_cb_wifi_cache.jmid_country_changed = (*env)->GetStaticMethodID(env, jcls, "countryChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;ILjava/lang/String;)V");
	s_cb_wifi_cache.jmid_environment_changed = (*env)->GetStaticMethodID(env, jcls, "environmentChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;I)V");
	s_cb_wifi_cache.jmid_rssi_changed = (*env)->GetStaticMethodID(env, jcls, "rssiChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;I)V");
	s_cb_wifi_cache.jmid_supported_countries = (*env)->GetStaticMethodID(env, jcls, "supportedCountries", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;Ljava/lang/String;)V");
	s_cb_wifi_cache.jmid_supported_security_types = (*env)->GetStaticMethodID(env, jcls, "supportedSecurityTypes", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureWifi$Callback;I)V");
}

static int evt_wifi_scanned_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * ssid;
	int16_t rssi;
	int32_t band;
	uint8_t channel;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Wifi_Scanned_item(cmd, &ssid, &rssi, &band, &channel, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_scanned_item, callback, (*env)->NewStringUTF(env, ssid), (jint)rssi, (jint)band, (jint)channel, (jint)list_flags);
	return 0;
}

static int evt_wifi_authorized_channel(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t band;
	uint8_t channel;
	uint8_t environment;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Wifi_Authorized_channel(cmd, &band, &channel, &environment, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_authorized_channel, callback, (jint)band, (jint)channel, (jint)environment, (jint)list_flags);
	return 0;
}

static int evt_wifi_ap_channel_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	int32_t band;
	uint8_t channel;
	int res = arsdk_cmd_dec_Wifi_Ap_channel_changed(cmd, &type, &band, &channel);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_ap_channel_changed, callback, (jint)type, (jint)band, (jint)channel);
	return 0;
}

static int evt_wifi_security_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	const char * key;
	int32_t key_type;
	int res = arsdk_cmd_dec_Wifi_Security_changed(cmd, &type, &key, &key_type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_security_changed, callback, (jint)type, (*env)->NewStringUTF(env, key), (jint)key_type);
	return 0;
}

static int evt_wifi_country_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t selection_mode;
	const char * code;
	int res = arsdk_cmd_dec_Wifi_Country_changed(cmd, &selection_mode, &code);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_country_changed, callback, (jint)selection_mode, (*env)->NewStringUTF(env, code));
	return 0;
}

static int evt_wifi_environment_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t environment;
	int res = arsdk_cmd_dec_Wifi_Environment_changed(cmd, &environment);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_environment_changed, callback, (jint)environment);
	return 0;
}

static int evt_wifi_rssi_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int16_t rssi;
	int res = arsdk_cmd_dec_Wifi_Rssi_changed(cmd, &rssi);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_rssi_changed, callback, (jint)rssi);
	return 0;
}

static int evt_wifi_supported_countries(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * countries;
	int res = arsdk_cmd_dec_Wifi_Supported_countries(cmd, &countries);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_supported_countries, callback, (*env)->NewStringUTF(env, countries));
	return 0;
}

static int evt_wifi_supported_security_types(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t types;
	int res = arsdk_cmd_dec_Wifi_Supported_security_types(cmd, &types);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_wifi_cache.jmid_supported_security_types, callback, (jint)types);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 135 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 2: return evt_wifi_scanned_item(env, jcls, cmd, callback);
		case 4: return evt_wifi_authorized_channel(env, jcls, cmd, callback);
		case 6: return evt_wifi_ap_channel_changed(env, jcls, cmd, callback);
		case 8: return evt_wifi_security_changed(env, jcls, cmd, callback);
		case 10: return evt_wifi_country_changed(env, jcls, cmd, callback);
		case 12: return evt_wifi_environment_changed(env, jcls, cmd, callback);
		case 13: return evt_wifi_rssi_changed(env, jcls, cmd, callback);
		case 14: return evt_wifi_supported_countries(env, jcls, cmd, callback);
		case 15: return evt_wifi_supported_security_types(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeEncodeScan(JNIEnv *env, jclass jcls, jlong nativeCmd, jint band) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Wifi_Scan(cmd, band);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeEncodeUpdateAuthorizedChannels(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Wifi_Update_authorized_channels(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeEncodeSetApChannel(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jint band, jint channel) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Wifi_Set_ap_channel(cmd, type, band, channel);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeEncodeSetSecurity(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type, jstring key, jint key_type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_key = (*env)->GetStringUTFChars(env, key, NULL);
	int res = arsdk_cmd_enc_Wifi_Set_security(cmd, type, c_key, key_type);
	if (c_key != NULL) (*env)->ReleaseStringUTFChars(env, key, c_key);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeEncodeSetCountry(JNIEnv *env, jclass jcls, jlong nativeCmd, jint selection_mode, jstring code) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_code = (*env)->GetStringUTFChars(env, code, NULL);
	int res = arsdk_cmd_enc_Wifi_Set_country(cmd, selection_mode, c_code);
	if (c_code != NULL) (*env)->ReleaseStringUTFChars(env, code, c_code);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureWifi_nativeEncodeSetEnvironment(JNIEnv *env, jclass jcls, jlong nativeCmd, jint environment) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Wifi_Set_environment(cmd, environment);
	return res;
}

