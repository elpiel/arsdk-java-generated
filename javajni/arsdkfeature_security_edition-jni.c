/** Generated, do not edit ! */

static struct {
	jmethodID jmid_capabilities;
	jmethodID jmid_log_storage_state;
} s_cb_security_edition_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSecurityEdition_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_security_edition_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSecurityEdition$Callback;I)V");
	s_cb_security_edition_cache.jmid_log_storage_state = (*env)->GetStaticMethodID(env, jcls, "logStorageState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSecurityEdition$Callback;I)V");
}

static int evt_security_edition_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t supported_capabilities;
	int res = arsdk_cmd_dec_Security_edition_Capabilities(cmd, &supported_capabilities);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_security_edition_cache.jmid_capabilities, callback, (jint)supported_capabilities);
	return 0;
}

static int evt_security_edition_log_storage_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t log_storage_state;
	int res = arsdk_cmd_dec_Security_edition_Log_storage_state(cmd, &log_storage_state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_security_edition_cache.jmid_log_storage_state, callback, (jint)log_storage_state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSecurityEdition_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 169 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_security_edition_capabilities(env, jcls, cmd, callback);
		case 3: return evt_security_edition_log_storage_state(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSecurityEdition_nativeEncodeDeactivateLogs(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Security_edition_Deactivate_logs(cmd);
	return res;
}

