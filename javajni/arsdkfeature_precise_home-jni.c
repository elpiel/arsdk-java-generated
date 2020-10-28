/** Generated, do not edit ! */

static struct {
	jmethodID jmid_capabilities;
	jmethodID jmid_mode;
	jmethodID jmid_state;
} s_cb_precise_home_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePreciseHome_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_precise_home_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePreciseHome$Callback;I)V");
	s_cb_precise_home_cache.jmid_mode = (*env)->GetStaticMethodID(env, jcls, "mode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePreciseHome$Callback;I)V");
	s_cb_precise_home_cache.jmid_state = (*env)->GetStaticMethodID(env, jcls, "state", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePreciseHome$Callback;I)V");
}

static int evt_precise_home_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t modes;
	int res = arsdk_cmd_dec_Precise_home_Capabilities(cmd, &modes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_precise_home_cache.jmid_capabilities, callback, (jint)modes);
	return 0;
}

static int evt_precise_home_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Precise_home_Mode(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_precise_home_cache.jmid_mode, callback, (jint)mode);
	return 0;
}

static int evt_precise_home_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Precise_home_State(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_precise_home_cache.jmid_state, callback, (jint)state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePreciseHome_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 151 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_precise_home_capabilities(env, jcls, cmd, callback);
		case 2: return evt_precise_home_mode(env, jcls, cmd, callback);
		case 4: return evt_precise_home_state(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePreciseHome_nativeEncodeSetMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Precise_home_Set_mode(cmd, mode);
	return res;
}

