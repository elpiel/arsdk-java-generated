/** Generated, do not edit ! */

static struct {
	jmethodID jmid_grab_state;
	jmethodID jmid_grab_button_event;
	jmethodID jmid_grab_axis_event;
	jmethodID jmid_button_mapping_item;
	jmethodID jmid_axis_mapping_item;
	jmethodID jmid_application_axis_event;
	jmethodID jmid_application_button_event;
	jmethodID jmid_expo_map_item;
	jmethodID jmid_inverted_map_item;
	jmethodID jmid_active_product;
	jmethodID jmid_volatile_mapping_state;
} s_cb_mapper_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_mapper_cache.jmid_grab_state = (*env)->GetStaticMethodID(env, jcls, "grabState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JJJ)V");
	s_cb_mapper_cache.jmid_grab_button_event = (*env)->GetStaticMethodID(env, jcls, "grabButtonEvent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JI)V");
	s_cb_mapper_cache.jmid_grab_axis_event = (*env)->GetStaticMethodID(env, jcls, "grabAxisEvent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JI)V");
	s_cb_mapper_cache.jmid_button_mapping_item = (*env)->GetStaticMethodID(env, jcls, "buttonMappingItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JIIJI)V");
	s_cb_mapper_cache.jmid_axis_mapping_item = (*env)->GetStaticMethodID(env, jcls, "axisMappingItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JIIIJI)V");
	s_cb_mapper_cache.jmid_application_axis_event = (*env)->GetStaticMethodID(env, jcls, "applicationAxisEvent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;II)V");
	s_cb_mapper_cache.jmid_application_button_event = (*env)->GetStaticMethodID(env, jcls, "applicationButtonEvent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;I)V");
	s_cb_mapper_cache.jmid_expo_map_item = (*env)->GetStaticMethodID(env, jcls, "expoMapItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JIIII)V");
	s_cb_mapper_cache.jmid_inverted_map_item = (*env)->GetStaticMethodID(env, jcls, "invertedMapItem", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;JIIII)V");
	s_cb_mapper_cache.jmid_active_product = (*env)->GetStaticMethodID(env, jcls, "activeProduct", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;I)V");
	s_cb_mapper_cache.jmid_volatile_mapping_state = (*env)->GetStaticMethodID(env, jcls, "volatileMappingState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureMapper$Callback;I)V");
}

static int evt_mapper_grab_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t buttons;
	uint32_t axes;
	uint32_t buttons_state;
	int res = arsdk_cmd_dec_Mapper_Grab_state(cmd, &buttons, &axes, &buttons_state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_grab_state, callback, (jlong)buttons, (jlong)axes, (jlong)buttons_state);
	return 0;
}

static int evt_mapper_grab_button_event(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t button;
	int32_t event;
	int res = arsdk_cmd_dec_Mapper_Grab_button_event(cmd, &button, &event);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_grab_button_event, callback, (jlong)button, (jint)event);
	return 0;
}

static int evt_mapper_grab_axis_event(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t axis;
	int8_t value;
	int res = arsdk_cmd_dec_Mapper_Grab_axis_event(cmd, &axis, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_grab_axis_event, callback, (jlong)axis, (jint)value);
	return 0;
}

static int evt_mapper_button_mapping_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t uid;
	uint16_t product;
	int32_t action;
	uint32_t buttons;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Mapper_Button_mapping_item(cmd, &uid, &product, &action, &buttons, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_button_mapping_item, callback, (jlong)uid, (jint)product, (jint)action, (jlong)buttons, (jint)list_flags);
	return 0;
}

static int evt_mapper_axis_mapping_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t uid;
	uint16_t product;
	int32_t action;
	int32_t axis;
	uint32_t buttons;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Mapper_Axis_mapping_item(cmd, &uid, &product, &action, &axis, &buttons, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_axis_mapping_item, callback, (jlong)uid, (jint)product, (jint)action, (jint)axis, (jlong)buttons, (jint)list_flags);
	return 0;
}

static int evt_mapper_application_axis_event(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t action;
	int8_t value;
	int res = arsdk_cmd_dec_Mapper_Application_axis_event(cmd, &action, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_application_axis_event, callback, (jint)action, (jint)value);
	return 0;
}

static int evt_mapper_application_button_event(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t action;
	int res = arsdk_cmd_dec_Mapper_Application_button_event(cmd, &action);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_application_button_event, callback, (jint)action);
	return 0;
}

static int evt_mapper_expo_map_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t uid;
	uint16_t product;
	int32_t axis;
	int32_t expo;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Mapper_Expo_map_item(cmd, &uid, &product, &axis, &expo, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_expo_map_item, callback, (jlong)uid, (jint)product, (jint)axis, (jint)expo, (jint)list_flags);
	return 0;
}

static int evt_mapper_inverted_map_item(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t uid;
	uint16_t product;
	int32_t axis;
	uint8_t inverted;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Mapper_Inverted_map_item(cmd, &uid, &product, &axis, &inverted, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_inverted_map_item, callback, (jlong)uid, (jint)product, (jint)axis, (jint)inverted, (jint)list_flags);
	return 0;
}

static int evt_mapper_active_product(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t product;
	int res = arsdk_cmd_dec_Mapper_Active_product(cmd, &product);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_active_product, callback, (jint)product);
	return 0;
}

static int evt_mapper_volatile_mapping_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t active;
	int res = arsdk_cmd_dec_Mapper_Volatile_mapping_state(cmd, &active);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_mapper_cache.jmid_volatile_mapping_state, callback, (jint)active);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 138 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 2: return evt_mapper_grab_state(env, jcls, cmd, callback);
		case 3: return evt_mapper_grab_button_event(env, jcls, cmd, callback);
		case 4: return evt_mapper_grab_axis_event(env, jcls, cmd, callback);
		case 7: return evt_mapper_button_mapping_item(env, jcls, cmd, callback);
		case 8: return evt_mapper_axis_mapping_item(env, jcls, cmd, callback);
		case 9: return evt_mapper_application_axis_event(env, jcls, cmd, callback);
		case 10: return evt_mapper_application_button_event(env, jcls, cmd, callback);
		case 13: return evt_mapper_expo_map_item(env, jcls, cmd, callback);
		case 15: return evt_mapper_inverted_map_item(env, jcls, cmd, callback);
		case 16: return evt_mapper_active_product(env, jcls, cmd, callback);
		case 19: return evt_mapper_volatile_mapping_state(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeGrab(JNIEnv *env, jclass jcls, jlong nativeCmd, jlong buttons, jlong axes) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Grab(cmd, buttons, axes);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeMapButtonAction(JNIEnv *env, jclass jcls, jlong nativeCmd, jint product, jint action, jlong buttons) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Map_button_action(cmd, product, action, buttons);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeMapAxisAction(JNIEnv *env, jclass jcls, jlong nativeCmd, jint product, jint action, jint axis, jlong buttons) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Map_axis_action(cmd, product, action, axis, buttons);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeResetMapping(JNIEnv *env, jclass jcls, jlong nativeCmd, jint product) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Reset_mapping(cmd, product);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeSetExpo(JNIEnv *env, jclass jcls, jlong nativeCmd, jint product, jint axis, jint expo) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Set_expo(cmd, product, axis, expo);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeSetInverted(JNIEnv *env, jclass jcls, jlong nativeCmd, jint product, jint axis, jint inverted) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Set_inverted(cmd, product, axis, inverted);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeEnterVolatileMapping(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Enter_volatile_mapping(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureMapper_nativeEncodeExitVolatileMapping(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Mapper_Exit_volatile_mapping(cmd);
	return res;
}

