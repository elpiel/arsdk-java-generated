/** Generated, do not edit ! */

static struct {
	jmethodID jmid_capabilities;
	jmethodID jmid_switch_state;
} s_cb_leds_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureLeds_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_leds_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureLeds$Callback;I)V");
	s_cb_leds_cache.jmid_switch_state = (*env)->GetStaticMethodID(env, jcls, "switchState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureLeds$Callback;I)V");
}

static int evt_leds_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t supported_capabilities;
	int res = arsdk_cmd_dec_Leds_Capabilities(cmd, &supported_capabilities);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_leds_cache.jmid_capabilities, callback, (jint)supported_capabilities);
	return 0;
}

static int evt_leds_switch_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t switch_state;
	int res = arsdk_cmd_dec_Leds_Switch_state(cmd, &switch_state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_leds_cache.jmid_switch_state, callback, (jint)switch_state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureLeds_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 154 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_leds_capabilities(env, jcls, cmd, callback);
		case 4: return evt_leds_switch_state(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureLeds_nativeEncodeActivate(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Leds_Activate(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureLeds_nativeEncodeDeactivate(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Leds_Deactivate(cmd);
	return res;
}

