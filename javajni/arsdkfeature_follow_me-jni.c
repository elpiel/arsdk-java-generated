/** Generated, do not edit ! */

static struct {
	jmethodID jmid_state;
	jmethodID jmid_mode_info;
	jmethodID jmid_geographic_config;
	jmethodID jmid_relative_config;
	jmethodID jmid_target_trajectory;
	jmethodID jmid_helicoid_anim_config;
	jmethodID jmid_swing_anim_config;
	jmethodID jmid_boomerang_anim_config;
	jmethodID jmid_candle_anim_config;
	jmethodID jmid_dolly_slide_anim_config;
	jmethodID jmid_target_framing_position_changed;
	jmethodID jmid_target_image_detection_state;
	jmethodID jmid_target_is_controller;
	jmethodID jmid_leash_config;
} s_cb_follow_me_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_follow_me_cache.jmid_state = (*env)->GetStaticMethodID(env, jcls, "state", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IIII)V");
	s_cb_follow_me_cache.jmid_mode_info = (*env)->GetStaticMethodID(env, jcls, "modeInfo", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;III)V");
	s_cb_follow_me_cache.jmid_geographic_config = (*env)->GetStaticMethodID(env, jcls, "geographicConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFFF)V");
	s_cb_follow_me_cache.jmid_relative_config = (*env)->GetStaticMethodID(env, jcls, "relativeConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFFF)V");
	s_cb_follow_me_cache.jmid_target_trajectory = (*env)->GetStaticMethodID(env, jcls, "targetTrajectory", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;DDFFFF)V");
	s_cb_follow_me_cache.jmid_helicoid_anim_config = (*env)->GetStaticMethodID(env, jcls, "helicoidAnimConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFFF)V");
	s_cb_follow_me_cache.jmid_swing_anim_config = (*env)->GetStaticMethodID(env, jcls, "swingAnimConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFF)V");
	s_cb_follow_me_cache.jmid_boomerang_anim_config = (*env)->GetStaticMethodID(env, jcls, "boomerangAnimConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFF)V");
	s_cb_follow_me_cache.jmid_candle_anim_config = (*env)->GetStaticMethodID(env, jcls, "candleAnimConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFF)V");
	s_cb_follow_me_cache.jmid_dolly_slide_anim_config = (*env)->GetStaticMethodID(env, jcls, "dollySlideAnimConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFFF)V");
	s_cb_follow_me_cache.jmid_target_framing_position_changed = (*env)->GetStaticMethodID(env, jcls, "targetFramingPositionChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;II)V");
	s_cb_follow_me_cache.jmid_target_image_detection_state = (*env)->GetStaticMethodID(env, jcls, "targetImageDetectionState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;I)V");
	s_cb_follow_me_cache.jmid_target_is_controller = (*env)->GetStaticMethodID(env, jcls, "targetIsController", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;I)V");
	s_cb_follow_me_cache.jmid_leash_config = (*env)->GetStaticMethodID(env, jcls, "leashConfig", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureFollowMe$Callback;IFFF)V");
}

static int evt_follow_me_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int32_t behavior;
	int32_t animation;
	uint16_t animation_available;
	int res = arsdk_cmd_dec_Follow_me_State(cmd, &mode, &behavior, &animation, &animation_available);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_state, callback, (jint)mode, (jint)behavior, (jint)animation, (jint)animation_available);
	return 0;
}

static int evt_follow_me_mode_info(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	uint16_t missing_requirements;
	uint16_t improvements;
	int res = arsdk_cmd_dec_Follow_me_Mode_info(cmd, &mode, &missing_requirements, &improvements);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_mode_info, callback, (jint)mode, (jint)missing_requirements, (jint)improvements);
	return 0;
}

static int evt_follow_me_geographic_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float distance;
	float elevation;
	float azimuth;
	int res = arsdk_cmd_dec_Follow_me_Geographic_config(cmd, &use_default, &distance, &elevation, &azimuth);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_geographic_config, callback, (jint)use_default, (jfloat)distance, (jfloat)elevation, (jfloat)azimuth);
	return 0;
}

static int evt_follow_me_relative_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float distance;
	float elevation;
	float azimuth;
	int res = arsdk_cmd_dec_Follow_me_Relative_config(cmd, &use_default, &distance, &elevation, &azimuth);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_relative_config, callback, (jint)use_default, (jfloat)distance, (jfloat)elevation, (jfloat)azimuth);
	return 0;
}

static int evt_follow_me_target_trajectory(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	double latitude;
	double longitude;
	float altitude;
	float north_speed;
	float east_speed;
	float down_speed;
	int res = arsdk_cmd_dec_Follow_me_Target_trajectory(cmd, &latitude, &longitude, &altitude, &north_speed, &east_speed, &down_speed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_target_trajectory, callback, (jdouble)latitude, (jdouble)longitude, (jfloat)altitude, (jfloat)north_speed, (jfloat)east_speed, (jfloat)down_speed);
	return 0;
}

static int evt_follow_me_helicoid_anim_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float speed;
	float revolution_nb;
	float vertical_distance;
	int res = arsdk_cmd_dec_Follow_me_Helicoid_anim_config(cmd, &use_default, &speed, &revolution_nb, &vertical_distance);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_helicoid_anim_config, callback, (jint)use_default, (jfloat)speed, (jfloat)revolution_nb, (jfloat)vertical_distance);
	return 0;
}

static int evt_follow_me_swing_anim_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float speed;
	float vertical_distance;
	int res = arsdk_cmd_dec_Follow_me_Swing_anim_config(cmd, &use_default, &speed, &vertical_distance);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_swing_anim_config, callback, (jint)use_default, (jfloat)speed, (jfloat)vertical_distance);
	return 0;
}

static int evt_follow_me_boomerang_anim_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float speed;
	float distance;
	int res = arsdk_cmd_dec_Follow_me_Boomerang_anim_config(cmd, &use_default, &speed, &distance);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_boomerang_anim_config, callback, (jint)use_default, (jfloat)speed, (jfloat)distance);
	return 0;
}

static int evt_follow_me_candle_anim_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float speed;
	float vertical_distance;
	int res = arsdk_cmd_dec_Follow_me_Candle_anim_config(cmd, &use_default, &speed, &vertical_distance);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_candle_anim_config, callback, (jint)use_default, (jfloat)speed, (jfloat)vertical_distance);
	return 0;
}

static int evt_follow_me_dolly_slide_anim_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float speed;
	float angle;
	float horizontal_distance;
	int res = arsdk_cmd_dec_Follow_me_Dolly_slide_anim_config(cmd, &use_default, &speed, &angle, &horizontal_distance);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_dolly_slide_anim_config, callback, (jint)use_default, (jfloat)speed, (jfloat)angle, (jfloat)horizontal_distance);
	return 0;
}

static int evt_follow_me_target_framing_position_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int8_t horizontal;
	int8_t vertical;
	int res = arsdk_cmd_dec_Follow_me_Target_framing_position_changed(cmd, &horizontal, &vertical);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_target_framing_position_changed, callback, (jint)horizontal, (jint)vertical);
	return 0;
}

static int evt_follow_me_target_image_detection_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Follow_me_Target_image_detection_state(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_target_image_detection_state, callback, (jint)state);
	return 0;
}

static int evt_follow_me_target_is_controller(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	int res = arsdk_cmd_dec_Follow_me_Target_is_controller(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_target_is_controller, callback, (jint)state);
	return 0;
}

static int evt_follow_me_leash_config(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t use_default;
	float distance;
	float elevation;
	float azimuth;
	int res = arsdk_cmd_dec_Follow_me_Leash_config(cmd, &use_default, &distance, &elevation, &azimuth);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_follow_me_cache.jmid_leash_config, callback, (jint)use_default, (jfloat)distance, (jfloat)elevation, (jfloat)azimuth);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 134 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 3: return evt_follow_me_state(env, jcls, cmd, callback);
		case 4: return evt_follow_me_mode_info(env, jcls, cmd, callback);
		case 7: return evt_follow_me_geographic_config(env, jcls, cmd, callback);
		case 9: return evt_follow_me_relative_config(env, jcls, cmd, callback);
		case 10: return evt_follow_me_target_trajectory(env, jcls, cmd, callback);
		case 13: return evt_follow_me_helicoid_anim_config(env, jcls, cmd, callback);
		case 15: return evt_follow_me_swing_anim_config(env, jcls, cmd, callback);
		case 17: return evt_follow_me_boomerang_anim_config(env, jcls, cmd, callback);
		case 19: return evt_follow_me_candle_anim_config(env, jcls, cmd, callback);
		case 21: return evt_follow_me_dolly_slide_anim_config(env, jcls, cmd, callback);
		case 23: return evt_follow_me_target_framing_position_changed(env, jcls, cmd, callback);
		case 25: return evt_follow_me_target_image_detection_state(env, jcls, cmd, callback);
		case 27: return evt_follow_me_target_is_controller(env, jcls, cmd, callback);
		case 29: return evt_follow_me_leash_config(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStart(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Start(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStop(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Stop(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeConfigureGeographic(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat distance, jfloat elevation, jfloat azimuth) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Configure_geographic(cmd, use_default, distance, elevation, azimuth);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeConfigureRelative(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat distance, jfloat elevation, jfloat azimuth) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Configure_relative(cmd, use_default, distance, elevation, azimuth);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStopAnimation(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Stop_animation(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStartHelicoidAnim(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat speed, jfloat revolution_number, jfloat vertical_distance) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Start_helicoid_anim(cmd, use_default, speed, revolution_number, vertical_distance);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStartSwingAnim(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat speed, jfloat vertical_distance) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Start_swing_anim(cmd, use_default, speed, vertical_distance);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStartBoomerangAnim(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat speed, jfloat distance) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Start_boomerang_anim(cmd, use_default, speed, distance);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStartCandleAnim(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat speed, jfloat vertical_distance) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Start_candle_anim(cmd, use_default, speed, vertical_distance);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeStartDollySlideAnim(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat speed, jfloat angle, jfloat horizontal_distance) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Start_dolly_slide_anim(cmd, use_default, speed, angle, horizontal_distance);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeTargetFramingPosition(JNIEnv *env, jclass jcls, jlong nativeCmd, jint horizontal, jint vertical) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Target_framing_position(cmd, horizontal, vertical);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeTargetImageDetection(JNIEnv *env, jclass jcls, jlong nativeCmd, jfloat target_azimuth, jfloat target_elevation, jfloat change_of_scale, jint confidence_index, jint is_new_selection, jlong timestamp) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Target_image_detection(cmd, target_azimuth, target_elevation, change_of_scale, confidence_index, is_new_selection, timestamp);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeSetTargetIsController(JNIEnv *env, jclass jcls, jlong nativeCmd, jint target_is_controller) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Set_target_is_controller(cmd, target_is_controller);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureFollowMe_nativeEncodeConfigureLeash(JNIEnv *env, jclass jcls, jlong nativeCmd, jint use_default, jfloat distance, jfloat elevation, jfloat azimuth) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Follow_me_Configure_leash(cmd, use_default, distance, elevation, azimuth);
	return res;
}

