/** Generated, do not edit ! */

static struct {
	jmethodID jmid_radiometric_calib_status;
	jmethodID jmid_radiometric_calib_result;
	jmethodID jmid_session_state_changed;
	jmethodID jmid_live_stitch_mask_changed;
	jmethodID jmid_live_stitch_last_picture_id_changed;
	jmethodID jmid_storage_infos;
	jmethodID jmid_system_status;
	jmethodID jmid_live_stitch_pictures_in_progress_number_changed;
} s_cb_sequoia_cam_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_sequoia_cam_cache.jmid_radiometric_calib_status = (*env)->GetStaticMethodID(env, jcls, "radiometricCalibStatus", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;III)V");
	s_cb_sequoia_cam_cache.jmid_radiometric_calib_result = (*env)->GetStaticMethodID(env, jcls, "radiometricCalibResult", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;III)V");
	s_cb_sequoia_cam_cache.jmid_session_state_changed = (*env)->GetStaticMethodID(env, jcls, "sessionStateChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;IILjava/lang/String;Ljava/lang/String;I)V");
	s_cb_sequoia_cam_cache.jmid_live_stitch_mask_changed = (*env)->GetStaticMethodID(env, jcls, "liveStitchMaskChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;III)V");
	s_cb_sequoia_cam_cache.jmid_live_stitch_last_picture_id_changed = (*env)->GetStaticMethodID(env, jcls, "liveStitchLastPictureIdChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;IJI)V");
	s_cb_sequoia_cam_cache.jmid_storage_infos = (*env)->GetStaticMethodID(env, jcls, "storageInfos", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;IIIJJIIIJJIII)V");
	s_cb_sequoia_cam_cache.jmid_system_status = (*env)->GetStaticMethodID(env, jcls, "systemStatus", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;III)V");
	s_cb_sequoia_cam_cache.jmid_live_stitch_pictures_in_progress_number_changed = (*env)->GetStaticMethodID(env, jcls, "liveStitchPicturesInProgressNumberChanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureSequoiaCam$Callback;IJI)V");
}

static int evt_sequoia_cam_radiometric_calib_status(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t value;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Radiometric_calib_status(cmd, &cam_id, &value, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_radiometric_calib_status, callback, (jint)cam_id, (jint)value, (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_radiometric_calib_result(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t value;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Radiometric_calib_result(cmd, &cam_id, &value, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_radiometric_calib_result, callback, (jint)cam_id, (jint)value, (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_session_state_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t state;
	const char * session_path;
	const char * live_stitch_path;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Session_state_changed(cmd, &cam_id, &state, &session_path, &live_stitch_path, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_session_state_changed, callback, (jint)cam_id, (jint)state, (*env)->NewStringUTF(env, session_path), (*env)->NewStringUTF(env, live_stitch_path), (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_live_stitch_mask_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	uint8_t mask;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Live_stitch_mask_changed(cmd, &cam_id, &mask, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_live_stitch_mask_changed, callback, (jint)cam_id, (jint)mask, (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_live_stitch_last_picture_id_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	uint32_t picture_id;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Live_stitch_last_picture_id_changed(cmd, &cam_id, &picture_id, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_live_stitch_last_picture_id_changed, callback, (jint)cam_id, (jlong)picture_id, (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_storage_infos(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	int32_t selected;
	uint8_t internal_available;
	uint64_t internal_total_size;
	uint64_t internal_free_size;
	uint8_t internal_is_ro;
	uint8_t internal_is_corrupted;
	uint8_t sd_available;
	uint64_t sd_total_size;
	uint64_t sd_free_size;
	uint8_t sd_is_ro;
	uint8_t sd_is_corrupted;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Storage_infos(cmd, &cam_id, &selected, &internal_available, &internal_total_size, &internal_free_size, &internal_is_ro, &internal_is_corrupted, &sd_available, &sd_total_size, &sd_free_size, &sd_is_ro, &sd_is_corrupted, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_storage_infos, callback, (jint)cam_id, (jint)selected, (jint)internal_available, (jlong)internal_total_size, (jlong)internal_free_size, (jint)internal_is_ro, (jint)internal_is_corrupted, (jint)sd_available, (jlong)sd_total_size, (jlong)sd_free_size, (jint)sd_is_ro, (jint)sd_is_corrupted, (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_system_status(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	uint16_t errors;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_System_status(cmd, &cam_id, &errors, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_system_status, callback, (jint)cam_id, (jint)errors, (jint)list_flags);
	return 0;
}

static int evt_sequoia_cam_live_stitch_pictures_in_progress_number_changed(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t cam_id;
	uint32_t nb_pictures;
	uint8_t list_flags;
	int res = arsdk_cmd_dec_Sequoia_cam_Live_stitch_pictures_in_progress_number_changed(cmd, &cam_id, &nb_pictures, &list_flags);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_sequoia_cam_cache.jmid_live_stitch_pictures_in_progress_number_changed, callback, (jint)cam_id, (jlong)nb_pictures, (jint)list_flags);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 147 || cmd->cls_id != 0)
		return -1;
	switch(cmd->cmd_id) {
		case 1: return evt_sequoia_cam_radiometric_calib_status(env, jcls, cmd, callback);
		case 2: return evt_sequoia_cam_radiometric_calib_result(env, jcls, cmd, callback);
		case 6: return evt_sequoia_cam_session_state_changed(env, jcls, cmd, callback);
		case 8: return evt_sequoia_cam_live_stitch_mask_changed(env, jcls, cmd, callback);
		case 9: return evt_sequoia_cam_live_stitch_last_picture_id_changed(env, jcls, cmd, callback);
		case 10: return evt_sequoia_cam_storage_infos(env, jcls, cmd, callback);
		case 11: return evt_sequoia_cam_system_status(env, jcls, cmd, callback);
		case 14: return evt_sequoia_cam_live_stitch_pictures_in_progress_number_changed(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeEncodeRadiometricCalibStart(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Sequoia_cam_Radiometric_calib_start(cmd, id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeEncodeOpenSession(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id, jstring name) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_name = (*env)->GetStringUTFChars(env, name, NULL);
	int res = arsdk_cmd_enc_Sequoia_cam_Open_session(cmd, id, c_name);
	if (c_name != NULL) (*env)->ReleaseStringUTFChars(env, name, c_name);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeEncodeCloseSession(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Sequoia_cam_Close_session(cmd, id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeEncodeSetLiveStitchMask(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id, jint sensors_mask) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Sequoia_cam_Set_live_stitch_mask(cmd, id, sensors_mask);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeEncodeGetStorageInfos(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Sequoia_cam_Get_storage_infos(cmd, id);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureSequoiaCam_nativeEncodeFactoryReset(JNIEnv *env, jclass jcls, jlong nativeCmd, jint id) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Sequoia_cam_Factory_reset(cmd, id);
	return res;
}

