/** Generated, do not edit ! */

static struct {
	jmethodID jmid_mode;
	jmethodID jmid_capabilities;
	jmethodID jmid_palette_part;
	jmethodID jmid_palette_settings;
	jmethodID jmid_rendering;
	jmethodID jmid_emissivity;
	jmethodID jmid_background_temperature;
	jmethodID jmid_sensitivity;
	jmethodID jmid_shutter_mode;
} s_cb_thermal_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_thermal_cache.jmid_mode = (*env)->GetStaticMethodID(env, jcls, "mode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;I)V");
	s_cb_thermal_cache.jmid_capabilities = (*env)->GetStaticMethodID(env, jcls, "capabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;I)V");
	s_cb_thermal_cache.jmid_palette_part = (*env)->GetStaticMethodID(env, jcls, "palettePart", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;FFFFI)V");
	s_cb_thermal_cache.jmid_palette_settings = (*env)->GetStaticMethodID(env, jcls, "paletteSettings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;IFFIIIF)V");
	s_cb_thermal_cache.jmid_rendering = (*env)->GetStaticMethodID(env, jcls, "rendering", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;IF)V");
	s_cb_thermal_cache.jmid_emissivity = (*env)->GetStaticMethodID(env, jcls, "emissivity", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;F)V");
	s_cb_thermal_cache.jmid_background_temperature = (*env)->GetStaticMethodID(env, jcls, "backgroundTemperature", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;F)V");
	s_cb_thermal_cache.jmid_sensitivity = (*env)->GetStaticMethodID(env, jcls, "sensitivity", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;I)V");
	s_cb_thermal_cache.jmid_shutter_mode = (*env)->GetStaticMethodID(env, jcls, "shutterMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureThermal$Callback;I)V");
}

static int evt_thermal_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int res = arsdk_cmd_dec_Thermal_Mode(cmd, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_mode, callback, (jint)mode);
	return 0;
}

static int evt_thermal_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t modes;
	int res = arsdk_cmd_dec_Thermal_Capabilities(cmd, &modes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_capabilities, callback, (jint)modes);
	return 0;
}

static int evt_thermal_palette_part(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float red;
	float green;
	float blue;
	float index;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Thermal_Palette_part(cmd, &red, &green, &blue, &index, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_palette_part, callback, (jfloat)red, (jfloat)green, (jfloat)blue, (jfloat)index, (jint)list_flags);
	return 0;
}

static int evt_thermal_palette_settings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	float lowest_temp;
	float highest_temp;
	int32_t outside_colorization;
	int32_t relative_range;
	int32_t spot_type;
	float spot_threshold;
	int res = arsdk_cmd_dec_Thermal_Palette_settings(cmd, &mode, &lowest_temp, &highest_temp, &outside_colorization, &relative_range, &spot_type, &spot_threshold);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_palette_settings, callback, (jint)mode, (jfloat)lowest_temp, (jfloat)highest_temp, (jint)outside_colorization, (jint)relative_range, (jint)spot_type, (jfloat)spot_threshold);
	return 0;
}

static int evt_thermal_rendering(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	float blending_rate;
	int res = arsdk_cmd_dec_Thermal_Rendering(cmd, &mode, &blending_rate);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_rendering, callback, (jint)mode, (jfloat)blending_rate);
	return 0;
}

static int evt_thermal_emissivity(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float emissivity;
	int res = arsdk_cmd_dec_Thermal_Emissivity(cmd, &emissivity);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_emissivity, callback, (jfloat)emissivity);
	return 0;
}

static int evt_thermal_background_temperature(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float background_temperature;
	int res = arsdk_cmd_dec_Thermal_Background_temperature(cmd, &background_temperature);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_background_temperature, callback, (jfloat)background_temperature);
	return 0;
}

static int evt_thermal_sensitivity(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t current_range;
	int res = arsdk_cmd_dec_Thermal_Sensitivity(cmd, &current_range);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_sensitivity, callback, (jint)current_range);
	return 0;
}

static int evt_thermal_shutter_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t current_trigger;
	int res = arsdk_cmd_dec_Thermal_Shutter_mode(cmd, &current_trigger);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_thermal_cache.jmid_shutter_mode, callback, (jint)current_trigger);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 152 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 2: return evt_thermal_mode(env, jcls, cmd, callback);
		case 3: return evt_thermal_capabilities(env, jcls, cmd, callback);
		case 5: return evt_thermal_palette_part(env, jcls, cmd, callback);
		case 7: return evt_thermal_palette_settings(env, jcls, cmd, callback);
		case 9: return evt_thermal_rendering(env, jcls, cmd, callback);
		case 11: return evt_thermal_emissivity(env, jcls, cmd, callback);
		case 13: return evt_thermal_background_temperature(env, jcls, cmd, callback);
		case 15: return evt_thermal_sensitivity(env, jcls, cmd, callback);
		case 17: return evt_thermal_shutter_mode(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_mode(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetPalettePart(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat red, jfloat green, jfloat blue, jfloat index, jint list_flags) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_palette_part(cmd, red, green, blue, index, list_flags);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetPaletteSettings(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode, jfloat lowest_temp, jfloat highest_temp, jint outside_colorization, jint relative_range, jint spot_type, jfloat spot_threshold) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_palette_settings(cmd, mode, lowest_temp, highest_temp, outside_colorization, relative_range, spot_type, spot_threshold);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetRendering(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode, jfloat blending_rate) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_rendering(cmd, mode, blending_rate);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetEmissivity(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat emissivity) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_emissivity(cmd, emissivity);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetBackgroundTemperature(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat background_temperature) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_background_temperature(cmd, background_temperature);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetSensitivity(JNIEnv *env, jclass jcls, jlong nativeCmd, jint range) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_sensitivity(cmd, range);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeSetShutterMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint trigger) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Set_shutter_mode(cmd, trigger);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureThermal_nativeEncodeTriggShutter(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Thermal_Trigg_shutter(cmd);
	return res;
}

