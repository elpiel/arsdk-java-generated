/** Generated, do not edit ! */

static struct {
	jmethodID jmid_info;
	jmethodID jmid_monitor;
	jmethodID jmid_state;
	jmethodID jmid_format_result;
	jmethodID jmid_capabilities;
	jmethodID jmid_supported_formatting_types;
	jmethodID jmid_format_progress;
	jmethodID jmid_decryption;
	jmethodID jmid_sdcard_uuid;
} s_cb_user_storage_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_user_storage_cache.jmid_info = (*env)->GetStaticMethodID(env, jcls, "info", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;Ljava/lang/String;J)V");
	s_cb_user_storage_cache.jmid_monitor = (*env)->GetStaticMethodID(env, jcls, "monitor", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;J)V");
	s_cb_user_storage_cache.jmid_state = (*env)->GetStaticMethodID(env, jcls, "state", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;IIIII)V");
	s_cb_user_storage_cache.jmid_format_result = (*env)->GetStaticMethodID(env, jcls, "formatResult", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;I)V");
	s_cb_user_storage_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;I)V");
	s_cb_user_storage_cache.jmid_supported_formatting_types = (*env)->GetStaticMethodID(env, jcls, "supportedFormattingTypes", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;I)V");
	s_cb_user_storage_cache.jmid_format_progress = (*env)->GetStaticMethodID(env, jcls, "formatProgress", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;II)V");
	s_cb_user_storage_cache.jmid_decryption = (*env)->GetStaticMethodID(env, jcls, "decryption", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;I)V");
	s_cb_user_storage_cache.jmid_sdcard_uuid = (*env)->GetStaticMethodID(env, jcls, "sdcardUuid", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureUserStorage$Callback;Ljava/lang/String;)V");
}

static int evt_user_storage_info(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * name;
	uint64_t capacity;
	int res = arsdk_cmd_dec_User_storage_Info(cmd, &name, &capacity);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_info, callback, (*env)->NewStringUTF(env, name), (jlong)capacity);
	return 0;
}

static int evt_user_storage_monitor(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint64_t available_bytes;
	int res = arsdk_cmd_dec_User_storage_Monitor(cmd, &available_bytes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_monitor, callback, (jlong)available_bytes);
	return 0;
}

static int evt_user_storage_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t physical_state;
	int32_t file_system_state;
	uint8_t attribute;
	uint8_t monitor_enabled;
	uint8_t monitor_period;
	int res = arsdk_cmd_dec_User_storage_State(cmd, &physical_state, &file_system_state, &attribute, &monitor_enabled, &monitor_period);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_state, callback, (jint)physical_state, (jint)file_system_state, (jint)attribute, (jint)monitor_enabled, (jint)monitor_period);
	return 0;
}

static int evt_user_storage_format_result(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t result;
	int res = arsdk_cmd_dec_User_storage_Format_result(cmd, &result);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_format_result, callback, (jint)result);
	return 0;
}

static int evt_user_storage_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t supported_features;
	int res = arsdk_cmd_dec_User_storage_Capabilities(cmd, &supported_features);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_capabilities, callback, (jint)supported_features);
	return 0;
}

static int evt_user_storage_supported_formatting_types(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t supported_types;
	int res = arsdk_cmd_dec_User_storage_Supported_formatting_types(cmd, &supported_types);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_supported_formatting_types, callback, (jint)supported_types);
	return 0;
}

static int evt_user_storage_format_progress(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t step;
	uint8_t percentage;
	int res = arsdk_cmd_dec_User_storage_Format_progress(cmd, &step, &percentage);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_format_progress, callback, (jint)step, (jint)percentage);
	return 0;
}

static int evt_user_storage_decryption(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t result;
	int res = arsdk_cmd_dec_User_storage_Decryption(cmd, &result);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_decryption, callback, (jint)result);
	return 0;
}

static int evt_user_storage_sdcard_uuid(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * uuid;
	int res = arsdk_cmd_dec_User_storage_Sdcard_uuid(cmd, &uuid);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_user_storage_cache.jmid_sdcard_uuid, callback, (*env)->NewStringUTF(env, uuid));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 145 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_user_storage_info(env, jcls, cmd, callback);
		case 2: return evt_user_storage_monitor(env, jcls, cmd, callback);
		case 3: return evt_user_storage_state(env, jcls, cmd, callback);
		case 7: return evt_user_storage_format_result(env, jcls, cmd, callback);
		case 8: return evt_user_storage_capabilities(env, jcls, cmd, callback);
		case 9: return evt_user_storage_supported_formatting_types(env, jcls, cmd, callback);
		case 11: return evt_user_storage_format_progress(env, jcls, cmd, callback);
		case 14: return evt_user_storage_decryption(env, jcls, cmd, callback);
		case 15: return evt_user_storage_sdcard_uuid(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeEncodeFormat(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring label) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_label = (*env)->GetStringUTFChars(env, label, NULL);
	int res = arsdk_cmd_enc_User_storage_Format(cmd, c_label);
	if (c_label != NULL) (*env)->ReleaseStringUTFChars(env, label, c_label);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeEncodeStartMonitoring(JNIEnv *env, jclass jcls, jlong nativeCmd, jint period) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_User_storage_Start_monitoring(cmd, period);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeEncodeStopMonitoring(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_User_storage_Stop_monitoring(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeEncodeFormatWithType(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring label, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_label = (*env)->GetStringUTFChars(env, label, NULL);
	int res = arsdk_cmd_enc_User_storage_Format_with_type(cmd, c_label, type);
	if (c_label != NULL) (*env)->ReleaseStringUTFChars(env, label, c_label);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeEncodeEncryptionPassword(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring password, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_password = (*env)->GetStringUTFChars(env, password, NULL);
	int res = arsdk_cmd_enc_User_storage_Encryption_password(cmd, c_password, type);
	if (c_password != NULL) (*env)->ReleaseStringUTFChars(env, password, c_password);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureUserStorage_nativeEncodeFormatWithEncryption(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring label, jstring password, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_label = (*env)->GetStringUTFChars(env, label, NULL);
	const char* c_password = (*env)->GetStringUTFChars(env, password, NULL);
	int res = arsdk_cmd_enc_User_storage_Format_with_encryption(cmd, c_label, c_password, type);
	if (c_label != NULL) (*env)->ReleaseStringUTFChars(env, label, c_label);
	if (c_password != NULL) (*env)->ReleaseStringUTFChars(env, password, c_password);
	return res;
}

