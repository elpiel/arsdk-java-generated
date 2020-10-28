/** Generated, do not edit ! */

static struct {
	jmethodID jmid_button_mapping_item;
	jmethodID jmid_axis_mapping_item;
} s_cb_mapper_mini_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapperMini_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_mapper_mini_cache.jmid_button_mapping_item = (*env)->GetStaticMethodID(env, jcls, "buttonMappingItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapperMini$Callback;IIIJI)V");
	s_cb_mapper_mini_cache.jmid_axis_mapping_item = (*env)->GetStaticMethodID(env, jcls, "axisMappingItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapperMini$Callback;IIIIJI)V");
}

static int evt_mapper_mini_button_mapping_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t uid;
	uint8_t modes;
	int32_t action;
	uint32_t buttons;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Mapper_mini_Button_mapping_item(cmd, &uid, &modes, &action, &buttons, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_mini_cache.jmid_button_mapping_item, callback, (jint)uid, (jint)modes, (jint)action, (jlong)buttons, (jint)list_flags);
	return 0;
}

static int evt_mapper_mini_axis_mapping_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t uid;
	uint8_t modes;
	int32_t action;
	int8_t axis;
	uint32_t buttons;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Mapper_mini_Axis_mapping_item(cmd, &uid, &modes, &action, &axis, &buttons, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_mini_cache.jmid_axis_mapping_item, callback, (jint)uid, (jint)modes, (jint)action, (jint)axis, (jlong)buttons, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapperMini_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 141 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 3: return evt_mapper_mini_button_mapping_item(env, jcls, cmd, callback);
		case 4: return evt_mapper_mini_axis_mapping_item(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapperMini_nativeEncodeMapButtonAction(JNIEnv *env, jclass jcls, jlong nativeCmd, jint modes, jint action, jlong buttons) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_mini_Map_button_action(cmd, modes, action, buttons);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapperMini_nativeEncodeMapAxisAction(JNIEnv *env, jclass jcls, jlong nativeCmd, jint modes, jint action, jint axis, jlong buttons) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_mini_Map_axis_action(cmd, modes, action, axis, buttons);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapperMini_nativeEncodeResetMapping(JNIEnv *env, jclass jcls, jlong nativeCmd, jint modes) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_mini_Reset_mapping(cmd, modes);
	return res;
}

