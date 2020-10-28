/** Generated, do not edit ! */

static struct {
	jmethodID jmid_style;
	jmethodID jmid_capabilities;
} s_cb_piloting_style_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePilotingStyle_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_piloting_style_cache.jmid_style = (*env)->GetStaticMethodID(env, jcls, "style", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePilotingStyle$Callback;I)V");
	s_cb_piloting_style_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeaturePilotingStyle$Callback;I)V");
}

static int evt_piloting_style_style(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t style;
	int res = arsdk_cmd_dec_Piloting_style_Style(cmd, &style);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_piloting_style_cache.jmid_style, callback, (jint)style);
	return 0;
}

static int evt_piloting_style_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t styles;
	int res = arsdk_cmd_dec_Piloting_style_Capabilities(cmd, &styles);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_piloting_style_cache.jmid_capabilities, callback, (jint)styles);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePilotingStyle_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 155 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_piloting_style_style(env, jcls, cmd, callback);
		case 3: return evt_piloting_style_capabilities(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeaturePilotingStyle_nativeEncodeSetStyle(JNIEnv *env, jclass jcls, jlong nativeCmd, jint style) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Piloting_style_Set_style(cmd, style);
	return res;
}

