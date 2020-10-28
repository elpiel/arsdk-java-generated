/** Generated, do not edit ! */

static struct {
	jmethodID jmid_state;
	jmethodID jmid_counters;
} s_cb_mediastore_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMediastore_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_mediastore_cache.jmid_state = (*env)->GetStaticMethodID(env, jcls, "state", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMediastore$Callback;I)V");
	s_cb_mediastore_cache.jmid_counters = (*env)->GetStaticMethodID(env, jcls, "counters", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMediastore$Callback;IIII)V");
}

static int evt_mediastore_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Mediastore_State(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mediastore_cache.jmid_state, callback, (jint)state);
	return 0;
}

static int evt_mediastore_counters(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t video_media_count;
	int32_t photo_media_count;
	int32_t video_resource_count;
	int32_t photo_resource_count;
	int res = arsdk_cmd_dec_Mediastore_Counters(cmd, &video_media_count, &photo_media_count, &video_resource_count, &photo_resource_count);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mediastore_cache.jmid_counters, callback, (jint)video_media_count, (jint)photo_media_count, (jint)video_resource_count, (jint)photo_resource_count);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMediastore_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 150 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_mediastore_state(env, jcls, cmd, callback);
		case 2: return evt_mediastore_counters(env, jcls, cmd, callback);
	}
	return -1;
}

