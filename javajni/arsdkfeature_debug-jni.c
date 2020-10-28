/** Generated, do not edit ! */

static struct {
	jmethodID jmid_settings_info;
	jmethodID jmid_settings_list;
} s_cb_debug_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDebug_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_debug_cache.jmid_settings_info = (*env)->GetStaticMethodID(env, jcls, "settingsInfo", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDebug$Callback;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_debug_cache.jmid_settings_list = (*env)->GetStaticMethodID(env, jcls, "settingsList", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureDebug$Callback;ILjava/lang/String;)V");
}

static int evt_debug_settings_info(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t list_flags;
	uint16_t id;
	const char * label;
	int32_t type;
	int32_t mode;
	const char * range_min;
	const char * range_max;
	const char * range_step;
	const char * value;
	int res = arsdk_cmd_dec_Debug_Settings_info(cmd, &list_flags, &id, &label, &type, &mode, &range_min, &range_max, &range_step, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_debug_cache.jmid_settings_info, callback, (jint)list_flags, (jint)id, (*env)->NewStringUTF(env, label), (jint)type, (jint)mode, (*env)->NewStringUTF(env, range_min), (*env)->NewStringUTF(env, range_max), (*env)->NewStringUTF(env, range_step), (*env)->NewStringUTF(env, value));
	return 0;
}

static int evt_debug_settings_list(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t id;
	const char * value;
	int res = arsdk_cmd_dec_Debug_Settings_list(cmd, &id, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_debug_cache.jmid_settings_list, callback, (jint)id, (*env)->NewStringUTF(env, value));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDebug_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 139 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 2: return evt_debug_settings_info(env, jcls, cmd, callback);
		case 3: return evt_debug_settings_list(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDebug_nativeEncodeGetAllSettings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Debug_Get_all_settings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureDebug_nativeEncodeSetSetting(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id, jstring value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_value = (*env)->GetStringUTFChars(env, value, NULL);
	int res = arsdk_cmd_enc_Debug_Set_setting(cmd, id, c_value);
	if (c_value != NULL) (*env)->ReleaseStringUTFChars(env, value, c_value);
	return res;
}

