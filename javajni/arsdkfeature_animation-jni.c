/** Generated, do not edit ! */

static struct {
	jmethodID jmid_availability;
	jmethodID jmid_state;
	jmethodID jmid_flip_state;
	jmethodID jmid_horizontal_panorama_state;
	jmethodID jmid_dronie_state;
	jmethodID jmid_horizontal_reveal_state;
	jmethodID jmid_vertical_reveal_state;
	jmethodID jmid_spiral_state;
	jmethodID jmid_parabola_state;
	jmethodID jmid_candle_state;
	jmethodID jmid_dolly_slide_state;
	jmethodID jmid_vertigo_state;
	jmethodID jmid_twist_up_state;
	jmethodID jmid_position_twist_up_state;
	jmethodID jmid_horizontal_180_photo_panorama_state;
	jmethodID jmid_vertical_180_photo_panorama_state;
	jmethodID jmid_spherical_photo_panorama_state;
} s_cb_animation_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_animation_cache.jmid_availability = (*env)->GetStaticMethodID(env, jcls, "availability", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;I)V");
	s_cb_animation_cache.jmid_state = (*env)->GetStaticMethodID(env, jcls, "state", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;II)V");
	s_cb_animation_cache.jmid_flip_state = (*env)->GetStaticMethodID(env, jcls, "flipState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;II)V");
	s_cb_animation_cache.jmid_horizontal_panorama_state = (*env)->GetStaticMethodID(env, jcls, "horizontalPanoramaState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFF)V");
	s_cb_animation_cache.jmid_dronie_state = (*env)->GetStaticMethodID(env, jcls, "dronieState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFI)V");
	s_cb_animation_cache.jmid_horizontal_reveal_state = (*env)->GetStaticMethodID(env, jcls, "horizontalRevealState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFI)V");
	s_cb_animation_cache.jmid_vertical_reveal_state = (*env)->GetStaticMethodID(env, jcls, "verticalRevealState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFFFI)V");
	s_cb_animation_cache.jmid_spiral_state = (*env)->GetStaticMethodID(env, jcls, "spiralState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFFFI)V");
	s_cb_animation_cache.jmid_parabola_state = (*env)->GetStaticMethodID(env, jcls, "parabolaState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFI)V");
	s_cb_animation_cache.jmid_candle_state = (*env)->GetStaticMethodID(env, jcls, "candleState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFI)V");
	s_cb_animation_cache.jmid_dolly_slide_state = (*env)->GetStaticMethodID(env, jcls, "dollySlideState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFFI)V");
	s_cb_animation_cache.jmid_vertigo_state = (*env)->GetStaticMethodID(env, jcls, "vertigoState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFII)V");
	s_cb_animation_cache.jmid_twist_up_state = (*env)->GetStaticMethodID(env, jcls, "twistUpState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFFFI)V");
	s_cb_animation_cache.jmid_position_twist_up_state = (*env)->GetStaticMethodID(env, jcls, "positionTwistUpState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;IFFFFI)V");
	s_cb_animation_cache.jmid_horizontal_180_photo_panorama_state = (*env)->GetStaticMethodID(env, jcls, "horizontal180PhotoPanoramaState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;I)V");
	s_cb_animation_cache.jmid_vertical_180_photo_panorama_state = (*env)->GetStaticMethodID(env, jcls, "vertical180PhotoPanoramaState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;I)V");
	s_cb_animation_cache.jmid_spherical_photo_panorama_state = (*env)->GetStaticMethodID(env, jcls, "sphericalPhotoPanoramaState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureAnimation$Callback;I)V");
}

static int evt_animation_availability(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t values;
	int res = arsdk_cmd_dec_Animation_Availability(cmd, &values);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_availability, callback, (jint)values);
	return 0;
}

static int evt_animation_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t type;
	uint8_t percent;
	int res = arsdk_cmd_dec_Animation_State(cmd, &type, &percent);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_state, callback, (jint)type, (jint)percent);
	return 0;
}

static int evt_animation_flip_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int32_t type;
	int res = arsdk_cmd_dec_Animation_Flip_state(cmd, &state, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_flip_state, callback, (jint)state, (jint)type);
	return 0;
}

static int evt_animation_horizontal_panorama_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float rotation_angle;
	float rotation_speed;
	int res = arsdk_cmd_dec_Animation_Horizontal_panorama_state(cmd, &state, &rotation_angle, &rotation_speed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_horizontal_panorama_state, callback, (jint)state, (jfloat)rotation_angle, (jfloat)rotation_speed);
	return 0;
}

static int evt_animation_dronie_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float distance;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Dronie_state(cmd, &state, &speed, &distance, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_dronie_state, callback, (jint)state, (jfloat)speed, (jfloat)distance, (jint)play_mode);
	return 0;
}

static int evt_animation_horizontal_reveal_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float distance;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Horizontal_reveal_state(cmd, &state, &speed, &distance, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_horizontal_reveal_state, callback, (jint)state, (jfloat)speed, (jfloat)distance, (jint)play_mode);
	return 0;
}

static int evt_animation_vertical_reveal_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float vertical_distance;
	float rotation_angle;
	float rotation_speed;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Vertical_reveal_state(cmd, &state, &speed, &vertical_distance, &rotation_angle, &rotation_speed, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_vertical_reveal_state, callback, (jint)state, (jfloat)speed, (jfloat)vertical_distance, (jfloat)rotation_angle, (jfloat)rotation_speed, (jint)play_mode);
	return 0;
}

static int evt_animation_spiral_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float radius_variation;
	float vertical_distance;
	float revolution_nb;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Spiral_state(cmd, &state, &speed, &radius_variation, &vertical_distance, &revolution_nb, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_spiral_state, callback, (jint)state, (jfloat)speed, (jfloat)radius_variation, (jfloat)vertical_distance, (jfloat)revolution_nb, (jint)play_mode);
	return 0;
}

static int evt_animation_parabola_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float vertical_distance;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Parabola_state(cmd, &state, &speed, &vertical_distance, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_parabola_state, callback, (jint)state, (jfloat)speed, (jfloat)vertical_distance, (jint)play_mode);
	return 0;
}

static int evt_animation_candle_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float vertical_distance;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Candle_state(cmd, &state, &speed, &vertical_distance, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_candle_state, callback, (jint)state, (jfloat)speed, (jfloat)vertical_distance, (jint)play_mode);
	return 0;
}

static int evt_animation_dolly_slide_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float angle;
	float horizontal_distance;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Dolly_slide_state(cmd, &state, &speed, &angle, &horizontal_distance, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_dolly_slide_state, callback, (jint)state, (jfloat)speed, (jfloat)angle, (jfloat)horizontal_distance, (jint)play_mode);
	return 0;
}

static int evt_animation_vertigo_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float duration;
	float max_zoom_level;
	int32_t finish_action;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Vertigo_state(cmd, &state, &duration, &max_zoom_level, &finish_action, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_vertigo_state, callback, (jint)state, (jfloat)duration, (jfloat)max_zoom_level, (jint)finish_action, (jint)play_mode);
	return 0;
}

static int evt_animation_twist_up_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float vertical_distance;
	float rotation_angle;
	float rotation_speed;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Twist_up_state(cmd, &state, &speed, &vertical_distance, &rotation_angle, &rotation_speed, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_twist_up_state, callback, (jint)state, (jfloat)speed, (jfloat)vertical_distance, (jfloat)rotation_angle, (jfloat)rotation_speed, (jint)play_mode);
	return 0;
}

static int evt_animation_position_twist_up_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	float speed;
	float vertical_distance;
	float rotation_angle;
	float rotation_speed;
	int32_t play_mode;
	int res = arsdk_cmd_dec_Animation_Position_twist_up_state(cmd, &state, &speed, &vertical_distance, &rotation_angle, &rotation_speed, &play_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_position_twist_up_state, callback, (jint)state, (jfloat)speed, (jfloat)vertical_distance, (jfloat)rotation_angle, (jfloat)rotation_speed, (jint)play_mode);
	return 0;
}

static int evt_animation_horizontal_180_photo_panorama_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Animation_Horizontal_180_photo_panorama_state(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_horizontal_180_photo_panorama_state, callback, (jint)state);
	return 0;
}

static int evt_animation_vertical_180_photo_panorama_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Animation_Vertical_180_photo_panorama_state(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_vertical_180_photo_panorama_state, callback, (jint)state);
	return 0;
}

static int evt_animation_spherical_photo_panorama_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	int res = arsdk_cmd_dec_Animation_Spherical_photo_panorama_state(cmd, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_animation_cache.jmid_spherical_photo_panorama_state, callback, (jint)state);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 144 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_animation_availability(env, jcls, cmd, callback);
		case 2: return evt_animation_state(env, jcls, cmd, callback);
		case 5: return evt_animation_flip_state(env, jcls, cmd, callback);
		case 7: return evt_animation_horizontal_panorama_state(env, jcls, cmd, callback);
		case 9: return evt_animation_dronie_state(env, jcls, cmd, callback);
		case 11: return evt_animation_horizontal_reveal_state(env, jcls, cmd, callback);
		case 13: return evt_animation_vertical_reveal_state(env, jcls, cmd, callback);
		case 15: return evt_animation_spiral_state(env, jcls, cmd, callback);
		case 17: return evt_animation_parabola_state(env, jcls, cmd, callback);
		case 19: return evt_animation_candle_state(env, jcls, cmd, callback);
		case 21: return evt_animation_dolly_slide_state(env, jcls, cmd, callback);
		case 23: return evt_animation_vertigo_state(env, jcls, cmd, callback);
		case 25: return evt_animation_twist_up_state(env, jcls, cmd, callback);
		case 27: return evt_animation_position_twist_up_state(env, jcls, cmd, callback);
		case 29: return evt_animation_horizontal_180_photo_panorama_state(env, jcls, cmd, callback);
		case 31: return evt_animation_vertical_180_photo_panorama_state(env, jcls, cmd, callback);
		case 33: return evt_animation_spherical_photo_panorama_state(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeCancel(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Cancel(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartFlip(JNIEnv *env, jclass jcls, jlong nativeCmd, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_flip(cmd, type);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartHorizontalPanorama(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat rotation_angle, jfloat rotation_speed) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_horizontal_panorama(cmd, provided_params, rotation_angle, rotation_speed);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartDronie(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat distance, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_dronie(cmd, provided_params, speed, distance, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartHorizontalReveal(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat distance, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_horizontal_reveal(cmd, provided_params, speed, distance, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartVerticalReveal(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat vertical_distance, jfloat rotation_angle, jfloat rotation_speed, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_vertical_reveal(cmd, provided_params, speed, vertical_distance, rotation_angle, rotation_speed, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartSpiral(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat radius_variation, jfloat vertical_distance, jfloat revolution_nb, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_spiral(cmd, provided_params, speed, radius_variation, vertical_distance, revolution_nb, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartParabola(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat vertical_distance, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_parabola(cmd, provided_params, speed, vertical_distance, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartCandle(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat vertical_distance, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_candle(cmd, provided_params, speed, vertical_distance, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartDollySlide(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat angle, jfloat horizontal_distance, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_dolly_slide(cmd, provided_params, speed, angle, horizontal_distance, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartVertigo(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat duration, jfloat max_zoom_level, jint finish_action, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_vertigo(cmd, provided_params, duration, max_zoom_level, finish_action, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartTwistUp(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat vertical_distance, jfloat rotation_angle, jfloat rotation_speed, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_twist_up(cmd, provided_params, speed, vertical_distance, rotation_angle, rotation_speed, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartPositionTwistUp(JNIEnv *env, jclass jcls, jlong nativeCmd, jint provided_params, jfloat speed, jfloat vertical_distance, jfloat rotation_angle, jfloat rotation_speed, jint play_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_position_twist_up(cmd, provided_params, speed, vertical_distance, rotation_angle, rotation_speed, play_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartHorizontal180PhotoPanorama(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_horizontal_180_photo_panorama(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartVertical180PhotoPanorama(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_vertical_180_photo_panorama(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureAnimation_nativeEncodeStartSphericalPhotoPanorama(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Animation_Start_spherical_photo_panorama(cmd);
	return res;
}

