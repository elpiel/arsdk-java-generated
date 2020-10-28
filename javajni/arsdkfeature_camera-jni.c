/** Generated, do not edit ! */

static struct {
	jmethodID jmid_camera_capabilities;
	jmethodID jmid_recording_capabilities;
	jmethodID jmid_photo_capabilities;
	jmethodID jmid_antiflicker_capabilities;
	jmethodID jmid_exposure_settings;
	jmethodID jmid_exposure;
	jmethodID jmid_white_balance;
	jmethodID jmid_ev_compensation;
	jmethodID jmid_antiflicker_mode;
	jmethodID jmid_style;
	jmethodID jmid_zoom_level;
	jmethodID jmid_zoom_info;
	jmethodID jmid_max_zoom_speed;
	jmethodID jmid_zoom_velocity_quality_degradation;
	jmethodID jmid_hdr_setting;
	jmethodID jmid_hdr;
	jmethodID jmid_camera_mode;
	jmethodID jmid_recording_mode;
	jmethodID jmid_photo_mode;
	jmethodID jmid_streaming_mode;
	jmethodID jmid_photo_progress;
	jmethodID jmid_photo_state;
	jmethodID jmid_recording_progress;
	jmethodID jmid_recording_state;
	jmethodID jmid_autorecord;
	jmethodID jmid_camera_states;
	jmethodID jmid_next_photo_delay;
	jmethodID jmid_alignment_offsets;
} s_cb_camera_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_camera_cache.jmid_camera_capabilities = (*env)->GetStaticMethodID(env, jcls, "cameraCapabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIIJIJIIIIIIIFFI)V");
	s_cb_camera_cache.jmid_recording_capabilities = (*env)->GetStaticMethodID(env, jcls, "recordingCapabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIII)V");
	s_cb_camera_cache.jmid_photo_capabilities = (*env)->GetStaticMethodID(env, jcls, "photoCapabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIII)V");
	s_cb_camera_cache.jmid_antiflicker_capabilities = (*env)->GetStaticMethodID(env, jcls, "antiflickerCapabilities", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;I)V");
	s_cb_camera_cache.jmid_exposure_settings = (*env)->GetStaticMethodID(env, jcls, "exposureSettings", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIJIJIJI)V");
	s_cb_camera_cache.jmid_exposure = (*env)->GetStaticMethodID(env, jcls, "exposure", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIFFFF)V");
	s_cb_camera_cache.jmid_white_balance = (*env)->GetStaticMethodID(env, jcls, "whiteBalance", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIII)V");
	s_cb_camera_cache.jmid_ev_compensation = (*env)->GetStaticMethodID(env, jcls, "evCompensation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_antiflicker_mode = (*env)->GetStaticMethodID(env, jcls, "antiflickerMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_style = (*env)->GetStaticMethodID(env, jcls, "style", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIIIIIIII)V");
	s_cb_camera_cache.jmid_zoom_level = (*env)->GetStaticMethodID(env, jcls, "zoomLevel", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IF)V");
	s_cb_camera_cache.jmid_zoom_info = (*env)->GetStaticMethodID(env, jcls, "zoomInfo", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIFF)V");
	s_cb_camera_cache.jmid_max_zoom_speed = (*env)->GetStaticMethodID(env, jcls, "maxZoomSpeed", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IFFF)V");
	s_cb_camera_cache.jmid_zoom_velocity_quality_degradation = (*env)->GetStaticMethodID(env, jcls, "zoomVelocityQualityDegradation", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_hdr_setting = (*env)->GetStaticMethodID(env, jcls, "hdrSetting", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_hdr = (*env)->GetStaticMethodID(env, jcls, "hdr", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;III)V");
	s_cb_camera_cache.jmid_camera_mode = (*env)->GetStaticMethodID(env, jcls, "cameraMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_recording_mode = (*env)->GetStaticMethodID(env, jcls, "recordingMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIIJ)V");
	s_cb_camera_cache.jmid_photo_mode = (*env)->GetStaticMethodID(env, jcls, "photoMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIIIIF)V");
	s_cb_camera_cache.jmid_streaming_mode = (*env)->GetStaticMethodID(env, jcls, "streamingMode", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_photo_progress = (*env)->GetStaticMethodID(env, jcls, "photoProgress", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIILjava/lang/String;)V");
	s_cb_camera_cache.jmid_photo_state = (*env)->GetStaticMethodID(env, jcls, "photoState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;III)V");
	s_cb_camera_cache.jmid_recording_progress = (*env)->GetStaticMethodID(env, jcls, "recordingProgress", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IILjava/lang/String;)V");
	s_cb_camera_cache.jmid_recording_state = (*env)->GetStaticMethodID(env, jcls, "recordingState", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IIIJ)V");
	s_cb_camera_cache.jmid_autorecord = (*env)->GetStaticMethodID(env, jcls, "autorecord", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;II)V");
	s_cb_camera_cache.jmid_camera_states = (*env)->GetStaticMethodID(env, jcls, "cameraStates", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;J)V");
	s_cb_camera_cache.jmid_next_photo_delay = (*env)->GetStaticMethodID(env, jcls, "nextPhotoDelay", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IF)V");
	s_cb_camera_cache.jmid_alignment_offsets = (*env)->GetStaticMethodID(env, jcls, "alignmentOffsets", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCamera$Callback;IFFFFFFFFF)V");
}

static int evt_camera_camera_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t model;
	uint8_t exposure_modes;
	int32_t exposure_lock_supported;
	int32_t exposure_roi_lock_supported;
	uint64_t ev_compensations;
	uint32_t white_balance_modes;
	uint64_t custom_white_balance_temperatures;
	int32_t white_balance_lock_supported;
	uint16_t styles;
	uint8_t camera_modes;
	uint16_t hyperlapse_values;
	uint16_t bracketing_presets;
	uint16_t burst_values;
	uint8_t streaming_modes;
	float timelapse_interval_min;
	float gpslapse_interval_min;
	uint16_t auto_exposure_metering_modes;
	int res = arsdk_cmd_dec_Camera_Camera_capabilities(cmd, &cam_id, &model, &exposure_modes, &exposure_lock_supported, &exposure_roi_lock_supported, &ev_compensations, &white_balance_modes, &custom_white_balance_temperatures, &white_balance_lock_supported, &styles, &camera_modes, &hyperlapse_values, &bracketing_presets, &burst_values, &streaming_modes, &timelapse_interval_min, &gpslapse_interval_min, &auto_exposure_metering_modes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_camera_capabilities, callback, (jint)cam_id, (jint)model, (jint)exposure_modes, (jint)exposure_lock_supported, (jint)exposure_roi_lock_supported, (jlong)ev_compensations, (jint)white_balance_modes, (jlong)custom_white_balance_temperatures, (jint)white_balance_lock_supported, (jint)styles, (jint)camera_modes, (jint)hyperlapse_values, (jint)bracketing_presets, (jint)burst_values, (jint)streaming_modes, (jfloat)timelapse_interval_min, (jfloat)gpslapse_interval_min, (jint)auto_exposure_metering_modes);
	return 0;
}

static int evt_camera_recording_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t id;
	uint16_t recording_modes;
	uint16_t resolutions;
	uint32_t framerates;
	int32_t hdr;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Camera_Recording_capabilities(cmd, &id, &recording_modes, &resolutions, &framerates, &hdr, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_recording_capabilities, callback, (jint)id, (jint)recording_modes, (jint)resolutions, (jint)framerates, (jint)hdr, (jint)list_flags);
	return 0;
}

static int evt_camera_photo_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint16_t id;
	uint16_t photo_modes;
	uint16_t photo_formats;
	uint16_t photo_file_formats;
	int32_t hdr;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Camera_Photo_capabilities(cmd, &id, &photo_modes, &photo_formats, &photo_file_formats, &hdr, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_photo_capabilities, callback, (jint)id, (jint)photo_modes, (jint)photo_formats, (jint)photo_file_formats, (jint)hdr, (jint)list_flags);
	return 0;
}

static int evt_camera_antiflicker_capabilities(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t supported_modes;
	int res = arsdk_cmd_dec_Camera_Antiflicker_capabilities(cmd, &supported_modes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_antiflicker_capabilities, callback, (jint)supported_modes);
	return 0;
}

static int evt_camera_exposure_settings(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t mode;
	int32_t manual_shutter_speed;
	uint64_t manual_shutter_speed_capabilities;
	int32_t manual_iso_sensitivity;
	uint64_t manual_iso_sensitivity_capabilities;
	int32_t max_iso_sensitivity;
	uint64_t max_iso_sensitivities_capabilities;
	int32_t metering_mode;
	int res = arsdk_cmd_dec_Camera_Exposure_settings(cmd, &cam_id, &mode, &manual_shutter_speed, &manual_shutter_speed_capabilities, &manual_iso_sensitivity, &manual_iso_sensitivity_capabilities, &max_iso_sensitivity, &max_iso_sensitivities_capabilities, &metering_mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_exposure_settings, callback, (jint)cam_id, (jint)mode, (jint)manual_shutter_speed, (jlong)manual_shutter_speed_capabilities, (jint)manual_iso_sensitivity, (jlong)manual_iso_sensitivity_capabilities, (jint)max_iso_sensitivity, (jlong)max_iso_sensitivities_capabilities, (jint)metering_mode);
	return 0;
}

static int evt_camera_exposure(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t shutter_speed;
	int32_t iso_sensitivity;
	int32_t lock;
	float lock_roi_x;
	float lock_roi_y;
	float lock_roi_width;
	float lock_roi_height;
	int res = arsdk_cmd_dec_Camera_Exposure(cmd, &cam_id, &shutter_speed, &iso_sensitivity, &lock, &lock_roi_x, &lock_roi_y, &lock_roi_width, &lock_roi_height);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_exposure, callback, (jint)cam_id, (jint)shutter_speed, (jint)iso_sensitivity, (jint)lock, (jfloat)lock_roi_x, (jfloat)lock_roi_y, (jfloat)lock_roi_width, (jfloat)lock_roi_height);
	return 0;
}

static int evt_camera_white_balance(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t mode;
	int32_t temperature;
	int32_t lock;
	int res = arsdk_cmd_dec_Camera_White_balance(cmd, &cam_id, &mode, &temperature, &lock);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_white_balance, callback, (jint)cam_id, (jint)mode, (jint)temperature, (jint)lock);
	return 0;
}

static int evt_camera_ev_compensation(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t value;
	int res = arsdk_cmd_dec_Camera_Ev_compensation(cmd, &cam_id, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_ev_compensation, callback, (jint)cam_id, (jint)value);
	return 0;
}

static int evt_camera_antiflicker_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	int32_t value;
	int res = arsdk_cmd_dec_Camera_Antiflicker_mode(cmd, &mode, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_antiflicker_mode, callback, (jint)mode, (jint)value);
	return 0;
}

static int evt_camera_style(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t style;
	int8_t saturation;
	int8_t saturation_min;
	int8_t saturation_max;
	int8_t contrast;
	int8_t contrast_min;
	int8_t contrast_max;
	int8_t sharpness;
	int8_t sharpness_min;
	int8_t sharpness_max;
	int res = arsdk_cmd_dec_Camera_Style(cmd, &cam_id, &style, &saturation, &saturation_min, &saturation_max, &contrast, &contrast_min, &contrast_max, &sharpness, &sharpness_min, &sharpness_max);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_style, callback, (jint)cam_id, (jint)style, (jint)saturation, (jint)saturation_min, (jint)saturation_max, (jint)contrast, (jint)contrast_min, (jint)contrast_max, (jint)sharpness, (jint)sharpness_min, (jint)sharpness_max);
	return 0;
}

static int evt_camera_zoom_level(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	float level;
	int res = arsdk_cmd_dec_Camera_Zoom_level(cmd, &cam_id, &level);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_zoom_level, callback, (jint)cam_id, (jfloat)level);
	return 0;
}

static int evt_camera_zoom_info(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t available;
	float high_quality_maximum_level;
	float maximum_level;
	int res = arsdk_cmd_dec_Camera_Zoom_info(cmd, &cam_id, &available, &high_quality_maximum_level, &maximum_level);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_zoom_info, callback, (jint)cam_id, (jint)available, (jfloat)high_quality_maximum_level, (jfloat)maximum_level);
	return 0;
}

static int evt_camera_max_zoom_speed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	float min;
	float max;
	float current;
	int res = arsdk_cmd_dec_Camera_Max_zoom_speed(cmd, &cam_id, &min, &max, &current);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_max_zoom_speed, callback, (jint)cam_id, (jfloat)min, (jfloat)max, (jfloat)current);
	return 0;
}

static int evt_camera_zoom_velocity_quality_degradation(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	uint8_t allowed;
	int res = arsdk_cmd_dec_Camera_Zoom_velocity_quality_degradation(cmd, &cam_id, &allowed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_zoom_velocity_quality_degradation, callback, (jint)cam_id, (jint)allowed);
	return 0;
}

static int evt_camera_hdr_setting(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t value;
	int res = arsdk_cmd_dec_Camera_Hdr_setting(cmd, &cam_id, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_hdr_setting, callback, (jint)cam_id, (jint)value);
	return 0;
}

static int evt_camera_hdr(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t available;
	int32_t state;
	int res = arsdk_cmd_dec_Camera_Hdr(cmd, &cam_id, &available, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_hdr, callback, (jint)cam_id, (jint)available, (jint)state);
	return 0;
}

static int evt_camera_camera_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t mode;
	int res = arsdk_cmd_dec_Camera_Camera_mode(cmd, &cam_id, &mode);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_camera_mode, callback, (jint)cam_id, (jint)mode);
	return 0;
}

static int evt_camera_recording_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t mode;
	int32_t resolution;
	int32_t framerate;
	int32_t hyperlapse;
	uint32_t bitrate;
	int res = arsdk_cmd_dec_Camera_Recording_mode(cmd, &cam_id, &mode, &resolution, &framerate, &hyperlapse, &bitrate);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_recording_mode, callback, (jint)cam_id, (jint)mode, (jint)resolution, (jint)framerate, (jint)hyperlapse, (jlong)bitrate);
	return 0;
}

static int evt_camera_photo_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t mode;
	int32_t format;
	int32_t file_format;
	int32_t burst;
	int32_t bracketing;
	float capture_interval;
	int res = arsdk_cmd_dec_Camera_Photo_mode(cmd, &cam_id, &mode, &format, &file_format, &burst, &bracketing, &capture_interval);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_photo_mode, callback, (jint)cam_id, (jint)mode, (jint)format, (jint)file_format, (jint)burst, (jint)bracketing, (jfloat)capture_interval);
	return 0;
}

static int evt_camera_streaming_mode(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t value;
	int res = arsdk_cmd_dec_Camera_Streaming_mode(cmd, &cam_id, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_streaming_mode, callback, (jint)cam_id, (jint)value);
	return 0;
}

static int evt_camera_photo_progress(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t result;
	uint8_t photo_count;
	const char * media_id;
	int res = arsdk_cmd_dec_Camera_Photo_progress(cmd, &cam_id, &result, &photo_count, &media_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_photo_progress, callback, (jint)cam_id, (jint)result, (jint)photo_count, (*env)->NewStringUTF(env, media_id));
	return 0;
}

static int evt_camera_photo_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t available;
	int32_t state;
	int res = arsdk_cmd_dec_Camera_Photo_state(cmd, &cam_id, &available, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_photo_state, callback, (jint)cam_id, (jint)available, (jint)state);
	return 0;
}

static int evt_camera_recording_progress(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t result;
	const char * media_id;
	int res = arsdk_cmd_dec_Camera_Recording_progress(cmd, &cam_id, &result, &media_id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_recording_progress, callback, (jint)cam_id, (jint)result, (*env)->NewStringUTF(env, media_id));
	return 0;
}

static int evt_camera_recording_state(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t available;
	int32_t state;
	uint64_t start_timestamp;
	int res = arsdk_cmd_dec_Camera_Recording_state(cmd, &cam_id, &available, &state, &start_timestamp);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_recording_state, callback, (jint)cam_id, (jint)available, (jint)state, (jlong)start_timestamp);
	return 0;
}

static int evt_camera_autorecord(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t state;
	int res = arsdk_cmd_dec_Camera_Autorecord(cmd, &cam_id, &state);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_autorecord, callback, (jint)cam_id, (jint)state);
	return 0;
}

static int evt_camera_camera_states(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t active_cameras;
	int res = arsdk_cmd_dec_Camera_Camera_states(cmd, &active_cameras);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_camera_states, callback, (jlong)active_cameras);
	return 0;
}

static int evt_camera_next_photo_delay(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t mode;
	float remaining;
	int res = arsdk_cmd_dec_Camera_Next_photo_delay(cmd, &mode, &remaining);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_next_photo_delay, callback, (jint)mode, (jfloat)remaining);
	return 0;
}

static int evt_camera_alignment_offsets(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	float min_bound_yaw;
	float max_bound_yaw;
	float current_yaw;
	float min_bound_pitch;
	float max_bound_pitch;
	float current_pitch;
	float min_bound_roll;
	float max_bound_roll;
	float current_roll;
	int res = arsdk_cmd_dec_Camera_Alignment_offsets(cmd, &cam_id, &min_bound_yaw, &max_bound_yaw, &current_yaw, &min_bound_pitch, &max_bound_pitch, &current_pitch, &min_bound_roll, &max_bound_roll, &current_roll);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_camera_cache.jmid_alignment_offsets, callback, (jint)cam_id, (jfloat)min_bound_yaw, (jfloat)max_bound_yaw, (jfloat)current_yaw, (jfloat)min_bound_pitch, (jfloat)max_bound_pitch, (jfloat)current_pitch, (jfloat)min_bound_roll, (jfloat)max_bound_roll, (jfloat)current_roll);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 143 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_camera_camera_capabilities(env, jcls, cmd, callback);
		case 2: return evt_camera_recording_capabilities(env, jcls, cmd, callback);
		case 3: return evt_camera_photo_capabilities(env, jcls, cmd, callback);
		case 4: return evt_camera_antiflicker_capabilities(env, jcls, cmd, callback);
		case 9: return evt_camera_exposure_settings(env, jcls, cmd, callback);
		case 10: return evt_camera_exposure(env, jcls, cmd, callback);
		case 13: return evt_camera_white_balance(env, jcls, cmd, callback);
		case 15: return evt_camera_ev_compensation(env, jcls, cmd, callback);
		case 17: return evt_camera_antiflicker_mode(env, jcls, cmd, callback);
		case 20: return evt_camera_style(env, jcls, cmd, callback);
		case 22: return evt_camera_zoom_level(env, jcls, cmd, callback);
		case 23: return evt_camera_zoom_info(env, jcls, cmd, callback);
		case 24: return evt_camera_max_zoom_speed(env, jcls, cmd, callback);
		case 26: return evt_camera_zoom_velocity_quality_degradation(env, jcls, cmd, callback);
		case 29: return evt_camera_hdr_setting(env, jcls, cmd, callback);
		case 30: return evt_camera_hdr(env, jcls, cmd, callback);
		case 32: return evt_camera_camera_mode(env, jcls, cmd, callback);
		case 34: return evt_camera_recording_mode(env, jcls, cmd, callback);
		case 36: return evt_camera_photo_mode(env, jcls, cmd, callback);
		case 38: return evt_camera_streaming_mode(env, jcls, cmd, callback);
		case 40: return evt_camera_photo_progress(env, jcls, cmd, callback);
		case 41: return evt_camera_photo_state(env, jcls, cmd, callback);
		case 44: return evt_camera_recording_progress(env, jcls, cmd, callback);
		case 45: return evt_camera_recording_state(env, jcls, cmd, callback);
		case 47: return evt_camera_autorecord(env, jcls, cmd, callback);
		case 49: return evt_camera_camera_states(env, jcls, cmd, callback);
		case 51: return evt_camera_next_photo_delay(env, jcls, cmd, callback);
		case 52: return evt_camera_alignment_offsets(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetExposureSettings(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint mode, jint shutter_speed, jint iso_sensitivity, jint max_iso_sensitivity, jint metering_mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_exposure_settings(cmd, cam_id, mode, shutter_speed, iso_sensitivity, max_iso_sensitivity, metering_mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeLockExposure(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Lock_exposure(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeLockExposureOnRoi(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jfloat roi_center_x, jfloat roi_center_y) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Lock_exposure_on_roi(cmd, cam_id, roi_center_x, roi_center_y);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeUnlockExposure(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Unlock_exposure(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetWhiteBalance(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint mode, jint temperature) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_white_balance(cmd, cam_id, mode, temperature);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetWhiteBalanceLock(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint state) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_white_balance_lock(cmd, cam_id, state);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetEvCompensation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_ev_compensation(cmd, cam_id, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetAntiflickerMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint mode) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_antiflicker_mode(cmd, mode);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetStyle(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint style) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_style(cmd, cam_id, style);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetStyleParams(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint saturation, jint contrast, jint sharpness) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_style_params(cmd, cam_id, saturation, contrast, sharpness);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetZoomTarget(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint control_mode, jfloat target) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_zoom_target(cmd, cam_id, control_mode, target);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetMaxZoomSpeed(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jfloat max) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_max_zoom_speed(cmd, cam_id, max);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetZoomVelocityQualityDegradation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint allow) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_zoom_velocity_quality_degradation(cmd, cam_id, allow);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetHdrSetting(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_hdr_setting(cmd, cam_id, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetCameraMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_camera_mode(cmd, cam_id, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetRecordingMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint mode, jint resolution, jint framerate, jint hyperlapse) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_recording_mode(cmd, cam_id, mode, resolution, framerate, hyperlapse);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetPhotoMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint mode, jint format, jint file_format, jint burst, jint bracketing, jfloat capture_interval) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_photo_mode(cmd, cam_id, mode, format, file_format, burst, bracketing, capture_interval);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetStreamingMode(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_streaming_mode(cmd, cam_id, value);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeTakePhoto(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Take_photo(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeStartRecording(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Start_recording(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeStopRecording(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Stop_recording(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetAutorecord(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jint state) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_autorecord(cmd, cam_id, state);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeResetZoom(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Reset_zoom(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeStopPhoto(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Stop_photo(cmd, cam_id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeSetAlignmentOffsets(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id, jfloat yaw, jfloat pitch, jfloat roll) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Set_alignment_offsets(cmd, cam_id, yaw, pitch, roll);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCamera_nativeEncodeResetAlignmentOffsets(JNIEnv *env, jclass jcls, jlong nativeCmd, jint cam_id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Camera_Reset_alignment_offsets(cmd, cam_id);
	return res;
}

