/** Generated, do not edit ! */

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Network_nativeEncodeDisconnect(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Network_Disconnect(cmd);
	return res;
}

static struct {
	jmethodID jmid_Disconnection;
} s_cb_common_NetworkEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024NetworkEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_NetworkEvent_cache.jmid_Disconnection = (*env)->GetStaticMethodID(env, jcls, "disconnection", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$NetworkEvent$Callback;I)V");
}

static int evt_common_NetworkEvent_Disconnection(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t cause;
	int res = arsdk_cmd_dec_Common_NetworkEvent_Disconnection(cmd, &cause);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_NetworkEvent_cache.jmid_Disconnection, callback, (jint)cause);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024NetworkEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 1)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_NetworkEvent_Disconnection(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Settings_nativeEncodeAllSettings(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Settings_AllSettings(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Settings_nativeEncodeReset(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Settings_Reset(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Settings_nativeEncodeProductName(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring name) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_name = (*env)->GetStringUTFChars(env, name, NULL);
	int res = arsdk_cmd_enc_Common_Settings_ProductName(cmd, c_name);
	if (c_name != NULL) (*env)->ReleaseStringUTFChars(env, name, c_name);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Settings_nativeEncodeCountry(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring code) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_code = (*env)->GetStringUTFChars(env, code, NULL);
	int res = arsdk_cmd_enc_Common_Settings_Country(cmd, c_code);
	if (c_code != NULL) (*env)->ReleaseStringUTFChars(env, code, c_code);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Settings_nativeEncodeAutoCountry(JNIEnv *env, jclass jcls, jlong nativeCmd, jint automatic) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Settings_AutoCountry(cmd, automatic);
	return res;
}

static struct {
	jmethodID jmid_AllSettingsChanged;
	jmethodID jmid_ResetChanged;
	jmethodID jmid_ProductNameChanged;
	jmethodID jmid_ProductVersionChanged;
	jmethodID jmid_ProductSerialHighChanged;
	jmethodID jmid_ProductSerialLowChanged;
	jmethodID jmid_CountryChanged;
	jmethodID jmid_AutoCountryChanged;
	jmethodID jmid_BoardIdChanged;
} s_cb_common_SettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024SettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_SettingsState_cache.jmid_AllSettingsChanged = (*env)->GetStaticMethodID(env, jcls, "allsettingschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;)V");
	s_cb_common_SettingsState_cache.jmid_ResetChanged = (*env)->GetStaticMethodID(env, jcls, "resetchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;)V");
	s_cb_common_SettingsState_cache.jmid_ProductNameChanged = (*env)->GetStaticMethodID(env, jcls, "productnamechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_common_SettingsState_cache.jmid_ProductVersionChanged = (*env)->GetStaticMethodID(env, jcls, "productversionchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;Ljava/lang/String;Ljava/lang/String;)V");
	s_cb_common_SettingsState_cache.jmid_ProductSerialHighChanged = (*env)->GetStaticMethodID(env, jcls, "productserialhighchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_common_SettingsState_cache.jmid_ProductSerialLowChanged = (*env)->GetStaticMethodID(env, jcls, "productseriallowchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_common_SettingsState_cache.jmid_CountryChanged = (*env)->GetStaticMethodID(env, jcls, "countrychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;Ljava/lang/String;)V");
	s_cb_common_SettingsState_cache.jmid_AutoCountryChanged = (*env)->GetStaticMethodID(env, jcls, "autocountrychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;I)V");
	s_cb_common_SettingsState_cache.jmid_BoardIdChanged = (*env)->GetStaticMethodID(env, jcls, "boardidchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$SettingsState$Callback;Ljava/lang/String;)V");
}

static int evt_common_SettingsState_AllSettingsChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Common_SettingsState_AllSettingsChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_AllSettingsChanged, callback);
	return 0;
}

static int evt_common_SettingsState_ResetChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Common_SettingsState_ResetChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_ResetChanged, callback);
	return 0;
}

static int evt_common_SettingsState_ProductNameChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * name;
	int res = arsdk_cmd_dec_Common_SettingsState_ProductNameChanged(cmd, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_ProductNameChanged, callback, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_common_SettingsState_ProductVersionChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * software;
	const char * hardware;
	int res = arsdk_cmd_dec_Common_SettingsState_ProductVersionChanged(cmd, &software, &hardware);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_ProductVersionChanged, callback, (*env)->NewStringUTF(env, software), (*env)->NewStringUTF(env, hardware));
	return 0;
}

static int evt_common_SettingsState_ProductSerialHighChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * high;
	int res = arsdk_cmd_dec_Common_SettingsState_ProductSerialHighChanged(cmd, &high);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_ProductSerialHighChanged, callback, (*env)->NewStringUTF(env, high));
	return 0;
}

static int evt_common_SettingsState_ProductSerialLowChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * low;
	int res = arsdk_cmd_dec_Common_SettingsState_ProductSerialLowChanged(cmd, &low);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_ProductSerialLowChanged, callback, (*env)->NewStringUTF(env, low));
	return 0;
}

static int evt_common_SettingsState_CountryChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * code;
	int res = arsdk_cmd_dec_Common_SettingsState_CountryChanged(cmd, &code);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_CountryChanged, callback, (*env)->NewStringUTF(env, code));
	return 0;
}

static int evt_common_SettingsState_AutoCountryChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t automatic;
	int res = arsdk_cmd_dec_Common_SettingsState_AutoCountryChanged(cmd, &automatic);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_AutoCountryChanged, callback, (jint)automatic);
	return 0;
}

static int evt_common_SettingsState_BoardIdChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * id;
	int res = arsdk_cmd_dec_Common_SettingsState_BoardIdChanged(cmd, &id);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_SettingsState_cache.jmid_BoardIdChanged, callback, (*env)->NewStringUTF(env, id));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024SettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 3)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_SettingsState_AllSettingsChanged(env, jcls, cmd, callback);
		case 1: return evt_common_SettingsState_ResetChanged(env, jcls, cmd, callback);
		case 2: return evt_common_SettingsState_ProductNameChanged(env, jcls, cmd, callback);
		case 3: return evt_common_SettingsState_ProductVersionChanged(env, jcls, cmd, callback);
		case 4: return evt_common_SettingsState_ProductSerialHighChanged(env, jcls, cmd, callback);
		case 5: return evt_common_SettingsState_ProductSerialLowChanged(env, jcls, cmd, callback);
		case 6: return evt_common_SettingsState_CountryChanged(env, jcls, cmd, callback);
		case 7: return evt_common_SettingsState_AutoCountryChanged(env, jcls, cmd, callback);
		case 8: return evt_common_SettingsState_BoardIdChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Common_nativeEncodeAllStates(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Common_AllStates(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Common_nativeEncodeCurrentDate(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring date) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_date = (*env)->GetStringUTFChars(env, date, NULL);
	int res = arsdk_cmd_enc_Common_Common_CurrentDate(cmd, c_date);
	if (c_date != NULL) (*env)->ReleaseStringUTFChars(env, date, c_date);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Common_nativeEncodeCurrentTime(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring time) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_time = (*env)->GetStringUTFChars(env, time, NULL);
	int res = arsdk_cmd_enc_Common_Common_CurrentTime(cmd, c_time);
	if (c_time != NULL) (*env)->ReleaseStringUTFChars(env, time, c_time);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Common_nativeEncodeReboot(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Common_Reboot(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Common_nativeEncodeCurrentDateTime(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring datetime) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_datetime = (*env)->GetStringUTFChars(env, datetime, NULL);
	int res = arsdk_cmd_enc_Common_Common_CurrentDateTime(cmd, c_datetime);
	if (c_datetime != NULL) (*env)->ReleaseStringUTFChars(env, datetime, c_datetime);
	return res;
}

static struct {
	jmethodID jmid_AllStatesChanged;
	jmethodID jmid_BatteryStateChanged;
	jmethodID jmid_MassStorageStateListChanged;
	jmethodID jmid_MassStorageInfoStateListChanged;
	jmethodID jmid_CurrentDateChanged;
	jmethodID jmid_CurrentTimeChanged;
	jmethodID jmid_MassStorageInfoRemainingListChanged;
	jmethodID jmid_WifiSignalChanged;
	jmethodID jmid_SensorsStatesListChanged;
	jmethodID jmid_ProductModel;
	jmethodID jmid_CountryListKnown;
	jmethodID jmid_DeprecatedMassStorageContentChanged;
	jmethodID jmid_MassStorageContent;
	jmethodID jmid_MassStorageContentForCurrentRun;
	jmethodID jmid_VideoRecordingTimestamp;
	jmethodID jmid_CurrentDateTimeChanged;
	jmethodID jmid_LinkSignalQuality;
	jmethodID jmid_BootId;
} s_cb_common_CommonState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024CommonState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_CommonState_cache.jmid_AllStatesChanged = (*env)->GetStaticMethodID(env, jcls, "allstateschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;)V");
	s_cb_common_CommonState_cache.jmid_BatteryStateChanged = (*env)->GetStaticMethodID(env, jcls, "batterystatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;I)V");
	s_cb_common_CommonState_cache.jmid_MassStorageStateListChanged = (*env)->GetStaticMethodID(env, jcls, "massstoragestatelistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;ILjava/lang/String;)V");
	s_cb_common_CommonState_cache.jmid_MassStorageInfoStateListChanged = (*env)->GetStaticMethodID(env, jcls, "massstorageinfostatelistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;IJJIII)V");
	s_cb_common_CommonState_cache.jmid_CurrentDateChanged = (*env)->GetStaticMethodID(env, jcls, "currentdatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;Ljava/lang/String;)V");
	s_cb_common_CommonState_cache.jmid_CurrentTimeChanged = (*env)->GetStaticMethodID(env, jcls, "currenttimechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;Ljava/lang/String;)V");
	s_cb_common_CommonState_cache.jmid_MassStorageInfoRemainingListChanged = (*env)->GetStaticMethodID(env, jcls, "massstorageinforemaininglistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;JIJ)V");
	s_cb_common_CommonState_cache.jmid_WifiSignalChanged = (*env)->GetStaticMethodID(env, jcls, "wifisignalchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;I)V");
	s_cb_common_CommonState_cache.jmid_SensorsStatesListChanged = (*env)->GetStaticMethodID(env, jcls, "sensorsstateslistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;II)V");
	s_cb_common_CommonState_cache.jmid_ProductModel = (*env)->GetStaticMethodID(env, jcls, "productmodel", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;I)V");
	s_cb_common_CommonState_cache.jmid_CountryListKnown = (*env)->GetStaticMethodID(env, jcls, "countrylistknown", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;ILjava/lang/String;)V");
	s_cb_common_CommonState_cache.jmid_DeprecatedMassStorageContentChanged = (*env)->GetStaticMethodID(env, jcls, "deprecatedmassstoragecontentchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;IIIII)V");
	s_cb_common_CommonState_cache.jmid_MassStorageContent = (*env)->GetStaticMethodID(env, jcls, "massstoragecontent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;IIIIII)V");
	s_cb_common_CommonState_cache.jmid_MassStorageContentForCurrentRun = (*env)->GetStaticMethodID(env, jcls, "massstoragecontentforcurrentrun", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;IIII)V");
	s_cb_common_CommonState_cache.jmid_VideoRecordingTimestamp = (*env)->GetStaticMethodID(env, jcls, "videorecordingtimestamp", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;JJ)V");
	s_cb_common_CommonState_cache.jmid_CurrentDateTimeChanged = (*env)->GetStaticMethodID(env, jcls, "currentdatetimechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;Ljava/lang/String;)V");
	s_cb_common_CommonState_cache.jmid_LinkSignalQuality = (*env)->GetStaticMethodID(env, jcls, "linksignalquality", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;I)V");
	s_cb_common_CommonState_cache.jmid_BootId = (*env)->GetStaticMethodID(env, jcls, "bootid", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CommonState$Callback;Ljava/lang/String;)V");
}

static int evt_common_CommonState_AllStatesChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Common_CommonState_AllStatesChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_AllStatesChanged, callback);
	return 0;
}

static int evt_common_CommonState_BatteryStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t percent;
	int res = arsdk_cmd_dec_Common_CommonState_BatteryStateChanged(cmd, &percent);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_BatteryStateChanged, callback, (jint)percent);
	return 0;
}

static int evt_common_CommonState_MassStorageStateListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t mass_storage_id;
	const char * name;
	int res = arsdk_cmd_dec_Common_CommonState_MassStorageStateListChanged(cmd, &mass_storage_id, &name);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_MassStorageStateListChanged, callback, (jint)mass_storage_id, (*env)->NewStringUTF(env, name));
	return 0;
}

static int evt_common_CommonState_MassStorageInfoStateListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t mass_storage_id;
	uint32_t size;
	uint32_t used_size;
	uint8_t plugged;
	uint8_t full;
	uint8_t internal;
	int res = arsdk_cmd_dec_Common_CommonState_MassStorageInfoStateListChanged(cmd, &mass_storage_id, &size, &used_size, &plugged, &full, &internal);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_MassStorageInfoStateListChanged, callback, (jint)mass_storage_id, (jlong)size, (jlong)used_size, (jint)plugged, (jint)full, (jint)internal);
	return 0;
}

static int evt_common_CommonState_CurrentDateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * date;
	int res = arsdk_cmd_dec_Common_CommonState_CurrentDateChanged(cmd, &date);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_CurrentDateChanged, callback, (*env)->NewStringUTF(env, date));
	return 0;
}

static int evt_common_CommonState_CurrentTimeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * time;
	int res = arsdk_cmd_dec_Common_CommonState_CurrentTimeChanged(cmd, &time);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_CurrentTimeChanged, callback, (*env)->NewStringUTF(env, time));
	return 0;
}

static int evt_common_CommonState_MassStorageInfoRemainingListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t free_space;
	uint16_t rec_time;
	uint32_t photo_remaining;
	int res = arsdk_cmd_dec_Common_CommonState_MassStorageInfoRemainingListChanged(cmd, &free_space, &rec_time, &photo_remaining);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_MassStorageInfoRemainingListChanged, callback, (jlong)free_space, (jint)rec_time, (jlong)photo_remaining);
	return 0;
}

static int evt_common_CommonState_WifiSignalChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int16_t rssi;
	int res = arsdk_cmd_dec_Common_CommonState_WifiSignalChanged(cmd, &rssi);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_WifiSignalChanged, callback, (jint)rssi);
	return 0;
}

static int evt_common_CommonState_SensorsStatesListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t sensorName;
	uint8_t sensorState;
	int res = arsdk_cmd_dec_Common_CommonState_SensorsStatesListChanged(cmd, &sensorName, &sensorState);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_SensorsStatesListChanged, callback, (jint)sensorName, (jint)sensorState);
	return 0;
}

static int evt_common_CommonState_ProductModel(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t model;
	int res = arsdk_cmd_dec_Common_CommonState_ProductModel(cmd, &model);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_ProductModel, callback, (jint)model);
	return 0;
}

static int evt_common_CommonState_CountryListKnown(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t listFlags;
	const char * countryCodes;
	int res = arsdk_cmd_dec_Common_CommonState_CountryListKnown(cmd, &listFlags, &countryCodes);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_CountryListKnown, callback, (jint)listFlags, (*env)->NewStringUTF(env, countryCodes));
	return 0;
}

static int evt_common_CommonState_DeprecatedMassStorageContentChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t mass_storage_id;
	uint16_t nbPhotos;
	uint16_t nbVideos;
	uint16_t nbPuds;
	uint16_t nbCrashLogs;
	int res = arsdk_cmd_dec_Common_CommonState_DeprecatedMassStorageContentChanged(cmd, &mass_storage_id, &nbPhotos, &nbVideos, &nbPuds, &nbCrashLogs);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_DeprecatedMassStorageContentChanged, callback, (jint)mass_storage_id, (jint)nbPhotos, (jint)nbVideos, (jint)nbPuds, (jint)nbCrashLogs);
	return 0;
}

static int evt_common_CommonState_MassStorageContent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t mass_storage_id;
	uint16_t nbPhotos;
	uint16_t nbVideos;
	uint16_t nbPuds;
	uint16_t nbCrashLogs;
	uint16_t nbRawPhotos;
	int res = arsdk_cmd_dec_Common_CommonState_MassStorageContent(cmd, &mass_storage_id, &nbPhotos, &nbVideos, &nbPuds, &nbCrashLogs, &nbRawPhotos);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_MassStorageContent, callback, (jint)mass_storage_id, (jint)nbPhotos, (jint)nbVideos, (jint)nbPuds, (jint)nbCrashLogs, (jint)nbRawPhotos);
	return 0;
}

static int evt_common_CommonState_MassStorageContentForCurrentRun(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t mass_storage_id;
	uint16_t nbPhotos;
	uint16_t nbVideos;
	uint16_t nbRawPhotos;
	int res = arsdk_cmd_dec_Common_CommonState_MassStorageContentForCurrentRun(cmd, &mass_storage_id, &nbPhotos, &nbVideos, &nbRawPhotos);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_MassStorageContentForCurrentRun, callback, (jint)mass_storage_id, (jint)nbPhotos, (jint)nbVideos, (jint)nbRawPhotos);
	return 0;
}

static int evt_common_CommonState_VideoRecordingTimestamp(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint64_t startTimestamp;
	uint64_t stopTimestamp;
	int res = arsdk_cmd_dec_Common_CommonState_VideoRecordingTimestamp(cmd, &startTimestamp, &stopTimestamp);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_VideoRecordingTimestamp, callback, (jlong)startTimestamp, (jlong)stopTimestamp);
	return 0;
}

static int evt_common_CommonState_CurrentDateTimeChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * datetime;
	int res = arsdk_cmd_dec_Common_CommonState_CurrentDateTimeChanged(cmd, &datetime);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_CurrentDateTimeChanged, callback, (*env)->NewStringUTF(env, datetime));
	return 0;
}

static int evt_common_CommonState_LinkSignalQuality(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t value;
	int res = arsdk_cmd_dec_Common_CommonState_LinkSignalQuality(cmd, &value);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_LinkSignalQuality, callback, (jint)value);
	return 0;
}

static int evt_common_CommonState_BootId(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * bootId;
	int res = arsdk_cmd_dec_Common_CommonState_BootId(cmd, &bootId);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CommonState_cache.jmid_BootId, callback, (*env)->NewStringUTF(env, bootId));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024CommonState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 5)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_CommonState_AllStatesChanged(env, jcls, cmd, callback);
		case 1: return evt_common_CommonState_BatteryStateChanged(env, jcls, cmd, callback);
		case 2: return evt_common_CommonState_MassStorageStateListChanged(env, jcls, cmd, callback);
		case 3: return evt_common_CommonState_MassStorageInfoStateListChanged(env, jcls, cmd, callback);
		case 4: return evt_common_CommonState_CurrentDateChanged(env, jcls, cmd, callback);
		case 5: return evt_common_CommonState_CurrentTimeChanged(env, jcls, cmd, callback);
		case 6: return evt_common_CommonState_MassStorageInfoRemainingListChanged(env, jcls, cmd, callback);
		case 7: return evt_common_CommonState_WifiSignalChanged(env, jcls, cmd, callback);
		case 8: return evt_common_CommonState_SensorsStatesListChanged(env, jcls, cmd, callback);
		case 9: return evt_common_CommonState_ProductModel(env, jcls, cmd, callback);
		case 10: return evt_common_CommonState_CountryListKnown(env, jcls, cmd, callback);
		case 11: return evt_common_CommonState_DeprecatedMassStorageContentChanged(env, jcls, cmd, callback);
		case 12: return evt_common_CommonState_MassStorageContent(env, jcls, cmd, callback);
		case 13: return evt_common_CommonState_MassStorageContentForCurrentRun(env, jcls, cmd, callback);
		case 14: return evt_common_CommonState_VideoRecordingTimestamp(env, jcls, cmd, callback);
		case 15: return evt_common_CommonState_CurrentDateTimeChanged(env, jcls, cmd, callback);
		case 16: return evt_common_CommonState_LinkSignalQuality(env, jcls, cmd, callback);
		case 17: return evt_common_CommonState_BootId(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024OverHeat_nativeEncodeSwitchOff(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_OverHeat_SwitchOff(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024OverHeat_nativeEncodeVentilate(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_OverHeat_Ventilate(cmd);
	return res;
}

static struct {
	jmethodID jmid_OverHeatChanged;
	jmethodID jmid_OverHeatRegulationChanged;
} s_cb_common_OverHeatState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024OverHeatState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_OverHeatState_cache.jmid_OverHeatChanged = (*env)->GetStaticMethodID(env, jcls, "overheatchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$OverHeatState$Callback;)V");
	s_cb_common_OverHeatState_cache.jmid_OverHeatRegulationChanged = (*env)->GetStaticMethodID(env, jcls, "overheatregulationchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$OverHeatState$Callback;I)V");
}

static int evt_common_OverHeatState_OverHeatChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Common_OverHeatState_OverHeatChanged(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_OverHeatState_cache.jmid_OverHeatChanged, callback);
	return 0;
}

static int evt_common_OverHeatState_OverHeatRegulationChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t regulationType;
	int res = arsdk_cmd_dec_Common_OverHeatState_OverHeatRegulationChanged(cmd, &regulationType);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_OverHeatState_cache.jmid_OverHeatRegulationChanged, callback, (jint)regulationType);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024OverHeatState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 7)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_OverHeatState_OverHeatChanged(env, jcls, cmd, callback);
		case 1: return evt_common_OverHeatState_OverHeatRegulationChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Controller_nativeEncodeIsPiloting(JNIEnv *env, jclass jcls, jlong nativeCmd, jint piloting) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Controller_IsPiloting(cmd, piloting);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Controller_nativeEncodePeerStateChanged(JNIEnv *env, jclass jcls, jlong nativeCmd, jint state, jint type, jstring peerName, jstring peerId, jstring peerType) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_peerName = (*env)->GetStringUTFChars(env, peerName, NULL);
	const char* c_peerId = (*env)->GetStringUTFChars(env, peerId, NULL);
	const char* c_peerType = (*env)->GetStringUTFChars(env, peerType, NULL);
	int res = arsdk_cmd_enc_Common_Controller_PeerStateChanged(cmd, state, type, c_peerName, c_peerId, c_peerType);
	if (c_peerName != NULL) (*env)->ReleaseStringUTFChars(env, peerName, c_peerName);
	if (c_peerId != NULL) (*env)->ReleaseStringUTFChars(env, peerId, c_peerId);
	if (c_peerType != NULL) (*env)->ReleaseStringUTFChars(env, peerType, c_peerType);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024WifiSettings_nativeEncodeOutdoorSetting(JNIEnv *env, jclass jcls, jlong nativeCmd, jint outdoor) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_WifiSettings_OutdoorSetting(cmd, outdoor);
	return res;
}

static struct {
	jmethodID jmid_outdoorSettingsChanged;
} s_cb_common_WifiSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024WifiSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_WifiSettingsState_cache.jmid_outdoorSettingsChanged = (*env)->GetStaticMethodID(env, jcls, "outdoorsettingschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$WifiSettingsState$Callback;I)V");
}

static int evt_common_WifiSettingsState_outdoorSettingsChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t outdoor;
	int res = arsdk_cmd_dec_Common_WifiSettingsState_OutdoorSettingsChanged(cmd, &outdoor);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_WifiSettingsState_cache.jmid_outdoorSettingsChanged, callback, (jint)outdoor);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024WifiSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 10)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_WifiSettingsState_outdoorSettingsChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Mavlink_nativeEncodeStart(JNIEnv *env, jclass jcls, jlong nativeCmd, jstring filepath, jint type) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	const char* c_filepath = (*env)->GetStringUTFChars(env, filepath, NULL);
	int res = arsdk_cmd_enc_Common_Mavlink_Start(cmd, c_filepath, type);
	if (c_filepath != NULL) (*env)->ReleaseStringUTFChars(env, filepath, c_filepath);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Mavlink_nativeEncodePause(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Mavlink_Pause(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Mavlink_nativeEncodeStop(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Mavlink_Stop(cmd);
	return res;
}

static struct {
	jmethodID jmid_MavlinkFilePlayingStateChanged;
	jmethodID jmid_MavlinkPlayErrorStateChanged;
	jmethodID jmid_MissionItemExecuted;
} s_cb_common_MavlinkState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024MavlinkState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_MavlinkState_cache.jmid_MavlinkFilePlayingStateChanged = (*env)->GetStaticMethodID(env, jcls, "mavlinkfileplayingstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$MavlinkState$Callback;ILjava/lang/String;I)V");
	s_cb_common_MavlinkState_cache.jmid_MavlinkPlayErrorStateChanged = (*env)->GetStaticMethodID(env, jcls, "mavlinkplayerrorstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$MavlinkState$Callback;I)V");
	s_cb_common_MavlinkState_cache.jmid_MissionItemExecuted = (*env)->GetStaticMethodID(env, jcls, "missionitemexecuted", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$MavlinkState$Callback;J)V");
}

static int evt_common_MavlinkState_MavlinkFilePlayingStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	const char * filepath;
	int32_t type;
	int res = arsdk_cmd_dec_Common_MavlinkState_MavlinkFilePlayingStateChanged(cmd, &state, &filepath, &type);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_MavlinkState_cache.jmid_MavlinkFilePlayingStateChanged, callback, (jint)state, (*env)->NewStringUTF(env, filepath), (jint)type);
	return 0;
}

static int evt_common_MavlinkState_MavlinkPlayErrorStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t error;
	int res = arsdk_cmd_dec_Common_MavlinkState_MavlinkPlayErrorStateChanged(cmd, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_MavlinkState_cache.jmid_MavlinkPlayErrorStateChanged, callback, (jint)error);
	return 0;
}

static int evt_common_MavlinkState_MissionItemExecuted(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint32_t idx;
	int res = arsdk_cmd_dec_Common_MavlinkState_MissionItemExecuted(cmd, &idx);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_MavlinkState_cache.jmid_MissionItemExecuted, callback, (jlong)idx);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024MavlinkState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 12)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_MavlinkState_MavlinkFilePlayingStateChanged(env, jcls, cmd, callback);
		case 1: return evt_common_MavlinkState_MavlinkPlayErrorStateChanged(env, jcls, cmd, callback);
		case 2: return evt_common_MavlinkState_MissionItemExecuted(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Calibration_nativeEncodeMagnetoCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd, jint calibrate) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Calibration_MagnetoCalibration(cmd, calibrate);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Calibration_nativeEncodePitotCalibration(JNIEnv *env, jclass jcls, jlong nativeCmd, jint calibrate) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Calibration_PitotCalibration(cmd, calibrate);
	return res;
}

static struct {
	jmethodID jmid_MagnetoCalibrationStateChanged;
	jmethodID jmid_MagnetoCalibrationRequiredState;
	jmethodID jmid_MagnetoCalibrationAxisToCalibrateChanged;
	jmethodID jmid_MagnetoCalibrationStartedChanged;
	jmethodID jmid_PitotCalibrationStateChanged;
} s_cb_common_CalibrationState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024CalibrationState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationStateChanged = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CalibrationState$Callback;IIII)V");
	s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationRequiredState = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationrequiredstate", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CalibrationState$Callback;I)V");
	s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationAxisToCalibrateChanged = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationaxistocalibratechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CalibrationState$Callback;I)V");
	s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationStartedChanged = (*env)->GetStaticMethodID(env, jcls, "magnetocalibrationstartedchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CalibrationState$Callback;I)V");
	s_cb_common_CalibrationState_cache.jmid_PitotCalibrationStateChanged = (*env)->GetStaticMethodID(env, jcls, "pitotcalibrationstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CalibrationState$Callback;II)V");
}

static int evt_common_CalibrationState_MagnetoCalibrationStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t xAxisCalibration;
	uint8_t yAxisCalibration;
	uint8_t zAxisCalibration;
	uint8_t calibrationFailed;
	int res = arsdk_cmd_dec_Common_CalibrationState_MagnetoCalibrationStateChanged(cmd, &xAxisCalibration, &yAxisCalibration, &zAxisCalibration, &calibrationFailed);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationStateChanged, callback, (jint)xAxisCalibration, (jint)yAxisCalibration, (jint)zAxisCalibration, (jint)calibrationFailed);
	return 0;
}

static int evt_common_CalibrationState_MagnetoCalibrationRequiredState(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t required;
	int res = arsdk_cmd_dec_Common_CalibrationState_MagnetoCalibrationRequiredState(cmd, &required);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationRequiredState, callback, (jint)required);
	return 0;
}

static int evt_common_CalibrationState_MagnetoCalibrationAxisToCalibrateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t axis;
	int res = arsdk_cmd_dec_Common_CalibrationState_MagnetoCalibrationAxisToCalibrateChanged(cmd, &axis);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationAxisToCalibrateChanged, callback, (jint)axis);
	return 0;
}

static int evt_common_CalibrationState_MagnetoCalibrationStartedChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t started;
	int res = arsdk_cmd_dec_Common_CalibrationState_MagnetoCalibrationStartedChanged(cmd, &started);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CalibrationState_cache.jmid_MagnetoCalibrationStartedChanged, callback, (jint)started);
	return 0;
}

static int evt_common_CalibrationState_PitotCalibrationStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t state;
	uint8_t lastError;
	int res = arsdk_cmd_dec_Common_CalibrationState_PitotCalibrationStateChanged(cmd, &state, &lastError);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CalibrationState_cache.jmid_PitotCalibrationStateChanged, callback, (jint)state, (jint)lastError);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024CalibrationState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 14)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_CalibrationState_MagnetoCalibrationStateChanged(env, jcls, cmd, callback);
		case 1: return evt_common_CalibrationState_MagnetoCalibrationRequiredState(env, jcls, cmd, callback);
		case 2: return evt_common_CalibrationState_MagnetoCalibrationAxisToCalibrateChanged(env, jcls, cmd, callback);
		case 3: return evt_common_CalibrationState_MagnetoCalibrationStartedChanged(env, jcls, cmd, callback);
		case 4: return evt_common_CalibrationState_PitotCalibrationStateChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_CameraSettingsChanged;
} s_cb_common_CameraSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024CameraSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_CameraSettingsState_cache.jmid_CameraSettingsChanged = (*env)->GetStaticMethodID(env, jcls, "camerasettingschanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$CameraSettingsState$Callback;FFFFF)V");
}

static int evt_common_CameraSettingsState_CameraSettingsChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	float fov;
	float panMax;
	float panMin;
	float tiltMax;
	float tiltMin;
	int res = arsdk_cmd_dec_Common_CameraSettingsState_CameraSettingsChanged(cmd, &fov, &panMax, &panMin, &tiltMax, &tiltMin);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_CameraSettingsState_cache.jmid_CameraSettingsChanged, callback, (jfloat)fov, (jfloat)panMax, (jfloat)panMin, (jfloat)tiltMax, (jfloat)tiltMin);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024CameraSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 15)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_CameraSettingsState_CameraSettingsChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024GPS_nativeEncodeControllerPositionForRun(JNIEnv *env, jclass jcls, jlong nativeCmd, jdouble latitude, jdouble longitude) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_GPS_ControllerPositionForRun(cmd, latitude, longitude);
	return res;
}

static struct {
	jmethodID jmid_AvailabilityStateChanged;
	jmethodID jmid_ComponentStateListChanged;
	jmethodID jmid_LockStateChanged;
} s_cb_common_FlightPlanState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_FlightPlanState_cache.jmid_AvailabilityStateChanged = (*env)->GetStaticMethodID(env, jcls, "availabilitystatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$FlightPlanState$Callback;I)V");
	s_cb_common_FlightPlanState_cache.jmid_ComponentStateListChanged = (*env)->GetStaticMethodID(env, jcls, "componentstatelistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$FlightPlanState$Callback;II)V");
	s_cb_common_FlightPlanState_cache.jmid_LockStateChanged = (*env)->GetStaticMethodID(env, jcls, "lockstatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$FlightPlanState$Callback;I)V");
}

static int evt_common_FlightPlanState_AvailabilityStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t AvailabilityState;
	int res = arsdk_cmd_dec_Common_FlightPlanState_AvailabilityStateChanged(cmd, &AvailabilityState);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_FlightPlanState_cache.jmid_AvailabilityStateChanged, callback, (jint)AvailabilityState);
	return 0;
}

static int evt_common_FlightPlanState_ComponentStateListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t component;
	uint8_t State;
	int res = arsdk_cmd_dec_Common_FlightPlanState_ComponentStateListChanged(cmd, &component, &State);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_FlightPlanState_cache.jmid_ComponentStateListChanged, callback, (jint)component, (jint)State);
	return 0;
}

static int evt_common_FlightPlanState_LockStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t LockState;
	int res = arsdk_cmd_dec_Common_FlightPlanState_LockStateChanged(cmd, &LockState);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_FlightPlanState_cache.jmid_LockStateChanged, callback, (jint)LockState);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 17)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_FlightPlanState_AvailabilityStateChanged(env, jcls, cmd, callback);
		case 1: return evt_common_FlightPlanState_ComponentStateListChanged(env, jcls, cmd, callback);
		case 2: return evt_common_FlightPlanState_LockStateChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_ControllerLibARCommandsVersion;
	jmethodID jmid_SkyControllerLibARCommandsVersion;
	jmethodID jmid_DeviceLibARCommandsVersion;
} s_cb_common_ARLibsVersionsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024ARLibsVersionsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_ARLibsVersionsState_cache.jmid_ControllerLibARCommandsVersion = (*env)->GetStaticMethodID(env, jcls, "controllerlibarcommandsversion", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ARLibsVersionsState$Callback;Ljava/lang/String;)V");
	s_cb_common_ARLibsVersionsState_cache.jmid_SkyControllerLibARCommandsVersion = (*env)->GetStaticMethodID(env, jcls, "skycontrollerlibarcommandsversion", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ARLibsVersionsState$Callback;Ljava/lang/String;)V");
	s_cb_common_ARLibsVersionsState_cache.jmid_DeviceLibARCommandsVersion = (*env)->GetStaticMethodID(env, jcls, "devicelibarcommandsversion", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ARLibsVersionsState$Callback;Ljava/lang/String;)V");
}

static int evt_common_ARLibsVersionsState_ControllerLibARCommandsVersion(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * version;
	int res = arsdk_cmd_dec_Common_ARLibsVersionsState_ControllerLibARCommandsVersion(cmd, &version);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ARLibsVersionsState_cache.jmid_ControllerLibARCommandsVersion, callback, (*env)->NewStringUTF(env, version));
	return 0;
}

static int evt_common_ARLibsVersionsState_SkyControllerLibARCommandsVersion(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * version;
	int res = arsdk_cmd_dec_Common_ARLibsVersionsState_SkyControllerLibARCommandsVersion(cmd, &version);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ARLibsVersionsState_cache.jmid_SkyControllerLibARCommandsVersion, callback, (*env)->NewStringUTF(env, version));
	return 0;
}

static int evt_common_ARLibsVersionsState_DeviceLibARCommandsVersion(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * version;
	int res = arsdk_cmd_dec_Common_ARLibsVersionsState_DeviceLibARCommandsVersion(cmd, &version);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ARLibsVersionsState_cache.jmid_DeviceLibARCommandsVersion, callback, (*env)->NewStringUTF(env, version));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024ARLibsVersionsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 18)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_ARLibsVersionsState_ControllerLibARCommandsVersion(env, jcls, cmd, callback);
		case 1: return evt_common_ARLibsVersionsState_SkyControllerLibARCommandsVersion(env, jcls, cmd, callback);
		case 2: return evt_common_ARLibsVersionsState_DeviceLibARCommandsVersion(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_StartingErrorEvent;
	jmethodID jmid_SpeedBridleEvent;
} s_cb_common_FlightPlanEvent_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanEvent_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_FlightPlanEvent_cache.jmid_StartingErrorEvent = (*env)->GetStaticMethodID(env, jcls, "startingerrorevent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$FlightPlanEvent$Callback;)V");
	s_cb_common_FlightPlanEvent_cache.jmid_SpeedBridleEvent = (*env)->GetStaticMethodID(env, jcls, "speedbridleevent", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$FlightPlanEvent$Callback;)V");
}

static int evt_common_FlightPlanEvent_StartingErrorEvent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Common_FlightPlanEvent_StartingErrorEvent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_FlightPlanEvent_cache.jmid_StartingErrorEvent, callback);
	return 0;
}

static int evt_common_FlightPlanEvent_SpeedBridleEvent(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int res = arsdk_cmd_dec_Common_FlightPlanEvent_SpeedBridleEvent(cmd);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_FlightPlanEvent_cache.jmid_SpeedBridleEvent, callback);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanEvent_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 19)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_FlightPlanEvent_StartingErrorEvent(env, jcls, cmd, callback);
		case 1: return evt_common_FlightPlanEvent_SpeedBridleEvent(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Audio_nativeEncodeControllerReadyForStreaming(JNIEnv *env, jclass jcls, jlong nativeCmd, jint ready) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Audio_ControllerReadyForStreaming(cmd, ready);
	return res;
}

static struct {
	jmethodID jmid_AudioStreamingRunning;
} s_cb_common_AudioState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024AudioState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_AudioState_cache.jmid_AudioStreamingRunning = (*env)->GetStaticMethodID(env, jcls, "audiostreamingrunning", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$AudioState$Callback;I)V");
}

static int evt_common_AudioState_AudioStreamingRunning(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t running;
	int res = arsdk_cmd_dec_Common_AudioState_AudioStreamingRunning(cmd, &running);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_AudioState_cache.jmid_AudioStreamingRunning, callback, (jint)running);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024AudioState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 21)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_AudioState_AudioStreamingRunning(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Headlights_nativeEncodeIntensity(JNIEnv *env, jclass jcls, jlong nativeCmd, jint left, jint right) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Headlights_Intensity(cmd, left, right);
	return res;
}

static struct {
	jmethodID jmid_intensityChanged;
} s_cb_common_HeadlightsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024HeadlightsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_HeadlightsState_cache.jmid_intensityChanged = (*env)->GetStaticMethodID(env, jcls, "intensitychanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$HeadlightsState$Callback;II)V");
}

static int evt_common_HeadlightsState_intensityChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t left;
	uint8_t right;
	int res = arsdk_cmd_dec_Common_HeadlightsState_IntensityChanged(cmd, &left, &right);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_HeadlightsState_cache.jmid_intensityChanged, callback, (jint)left, (jint)right);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024HeadlightsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 23)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_HeadlightsState_intensityChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Animations_nativeEncodeStartAnimation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint anim) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Animations_StartAnimation(cmd, anim);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Animations_nativeEncodeStopAnimation(JNIEnv *env, jclass jcls, jlong nativeCmd, jint anim) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Animations_StopAnimation(cmd, anim);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Animations_nativeEncodeStopAllAnimations(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Animations_StopAllAnimations(cmd);
	return res;
}

static struct {
	jmethodID jmid_List;
} s_cb_common_AnimationsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024AnimationsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_AnimationsState_cache.jmid_List = (*env)->GetStaticMethodID(env, jcls, "list", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$AnimationsState$Callback;III)V");
}

static int evt_common_AnimationsState_List(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t anim;
	int32_t state;
	int32_t error;
	int res = arsdk_cmd_dec_Common_AnimationsState_List(cmd, &anim, &state, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_AnimationsState_cache.jmid_List, callback, (jint)anim, (jint)state, (jint)error);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024AnimationsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 25)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_AnimationsState_List(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Accessory_nativeEncodeConfig(JNIEnv *env, jclass jcls, jlong nativeCmd, jint accessory) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Accessory_Config(cmd, accessory);
	return res;
}

static struct {
	jmethodID jmid_SupportedAccessoriesListChanged;
	jmethodID jmid_AccessoryConfigChanged;
	jmethodID jmid_AccessoryConfigModificationEnabled;
} s_cb_common_AccessoryState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024AccessoryState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_AccessoryState_cache.jmid_SupportedAccessoriesListChanged = (*env)->GetStaticMethodID(env, jcls, "supportedaccessorieslistchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$AccessoryState$Callback;I)V");
	s_cb_common_AccessoryState_cache.jmid_AccessoryConfigChanged = (*env)->GetStaticMethodID(env, jcls, "accessoryconfigchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$AccessoryState$Callback;II)V");
	s_cb_common_AccessoryState_cache.jmid_AccessoryConfigModificationEnabled = (*env)->GetStaticMethodID(env, jcls, "accessoryconfigmodificationenabled", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$AccessoryState$Callback;I)V");
}

static int evt_common_AccessoryState_SupportedAccessoriesListChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t accessory;
	int res = arsdk_cmd_dec_Common_AccessoryState_SupportedAccessoriesListChanged(cmd, &accessory);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_AccessoryState_cache.jmid_SupportedAccessoriesListChanged, callback, (jint)accessory);
	return 0;
}

static int evt_common_AccessoryState_AccessoryConfigChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t newAccessory;
	int32_t error;
	int res = arsdk_cmd_dec_Common_AccessoryState_AccessoryConfigChanged(cmd, &newAccessory, &error);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_AccessoryState_cache.jmid_AccessoryConfigChanged, callback, (jint)newAccessory, (jint)error);
	return 0;
}

static int evt_common_AccessoryState_AccessoryConfigModificationEnabled(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t enabled;
	int res = arsdk_cmd_dec_Common_AccessoryState_AccessoryConfigModificationEnabled(cmd, &enabled);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_AccessoryState_cache.jmid_AccessoryConfigModificationEnabled, callback, (jint)enabled);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024AccessoryState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 27)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_AccessoryState_SupportedAccessoriesListChanged(env, jcls, cmd, callback);
		case 1: return evt_common_AccessoryState_AccessoryConfigChanged(env, jcls, cmd, callback);
		case 2: return evt_common_AccessoryState_AccessoryConfigModificationEnabled(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Charger_nativeEncodeSetMaxChargeRate(JNIEnv *env, jclass jcls, jlong nativeCmd, jint rate) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Charger_SetMaxChargeRate(cmd, rate);
	return res;
}

static struct {
	jmethodID jmid_MaxChargeRateChanged;
	jmethodID jmid_CurrentChargeStateChanged;
	jmethodID jmid_LastChargeRateChanged;
	jmethodID jmid_ChargingInfo;
} s_cb_common_ChargerState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024ChargerState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_ChargerState_cache.jmid_MaxChargeRateChanged = (*env)->GetStaticMethodID(env, jcls, "maxchargeratechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ChargerState$Callback;I)V");
	s_cb_common_ChargerState_cache.jmid_CurrentChargeStateChanged = (*env)->GetStaticMethodID(env, jcls, "currentchargestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ChargerState$Callback;II)V");
	s_cb_common_ChargerState_cache.jmid_LastChargeRateChanged = (*env)->GetStaticMethodID(env, jcls, "lastchargeratechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ChargerState$Callback;I)V");
	s_cb_common_ChargerState_cache.jmid_ChargingInfo = (*env)->GetStaticMethodID(env, jcls, "charginginfo", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$ChargerState$Callback;IIII)V");
}

static int evt_common_ChargerState_MaxChargeRateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t rate;
	int res = arsdk_cmd_dec_Common_ChargerState_MaxChargeRateChanged(cmd, &rate);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ChargerState_cache.jmid_MaxChargeRateChanged, callback, (jint)rate);
	return 0;
}

static int evt_common_ChargerState_CurrentChargeStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t status;
	int32_t phase;
	int res = arsdk_cmd_dec_Common_ChargerState_CurrentChargeStateChanged(cmd, &status, &phase);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ChargerState_cache.jmid_CurrentChargeStateChanged, callback, (jint)status, (jint)phase);
	return 0;
}

static int evt_common_ChargerState_LastChargeRateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t rate;
	int res = arsdk_cmd_dec_Common_ChargerState_LastChargeRateChanged(cmd, &rate);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ChargerState_cache.jmid_LastChargeRateChanged, callback, (jint)rate);
	return 0;
}

static int evt_common_ChargerState_ChargingInfo(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	int32_t phase;
	int32_t rate;
	uint8_t intensity;
	uint8_t fullChargingTime;
	int res = arsdk_cmd_dec_Common_ChargerState_ChargingInfo(cmd, &phase, &rate, &intensity, &fullChargingTime);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_ChargerState_cache.jmid_ChargingInfo, callback, (jint)phase, (jint)rate, (jint)intensity, (jint)fullChargingTime);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024ChargerState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 29)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_ChargerState_MaxChargeRateChanged(env, jcls, cmd, callback);
		case 1: return evt_common_ChargerState_CurrentChargeStateChanged(env, jcls, cmd, callback);
		case 2: return evt_common_ChargerState_LastChargeRateChanged(env, jcls, cmd, callback);
		case 3: return evt_common_ChargerState_ChargingInfo(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_RunIdChanged;
} s_cb_common_RunState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024RunState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_RunState_cache.jmid_RunIdChanged = (*env)->GetStaticMethodID(env, jcls, "runidchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$RunState$Callback;Ljava/lang/String;)V");
}

static int evt_common_RunState_RunIdChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * runId;
	int res = arsdk_cmd_dec_Common_RunState_RunIdChanged(cmd, &runId);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_RunState_cache.jmid_RunIdChanged, callback, (*env)->NewStringUTF(env, runId));
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024RunState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 30)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_RunState_RunIdChanged(env, jcls, cmd, callback);
	}
	return -1;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024Factory_nativeEncodeReset(JNIEnv *env, jclass jcls, jlong nativeCmd) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_Factory_Reset(cmd);
	return res;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanSettings_nativeEncodeReturnHomeOnDisconnect(JNIEnv *env, jclass jcls, jlong nativeCmd, jint value) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	int res = arsdk_cmd_enc_Common_FlightPlanSettings_ReturnHomeOnDisconnect(cmd, value);
	return res;
}

static struct {
	jmethodID jmid_ReturnHomeOnDisconnectChanged;
} s_cb_common_FlightPlanSettingsState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanSettingsState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_FlightPlanSettingsState_cache.jmid_ReturnHomeOnDisconnectChanged = (*env)->GetStaticMethodID(env, jcls, "returnhomeondisconnectchanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$FlightPlanSettingsState$Callback;II)V");
}

static int evt_common_FlightPlanSettingsState_ReturnHomeOnDisconnectChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	uint8_t state;
	uint8_t isReadOnly;
	int res = arsdk_cmd_dec_Common_FlightPlanSettingsState_ReturnHomeOnDisconnectChanged(cmd, &state, &isReadOnly);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_FlightPlanSettingsState_cache.jmid_ReturnHomeOnDisconnectChanged, callback, (jint)state, (jint)isReadOnly);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024FlightPlanSettingsState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 33)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_FlightPlanSettingsState_ReturnHomeOnDisconnectChanged(env, jcls, cmd, callback);
	}
	return -1;
}

static struct {
	jmethodID jmid_UpdateStateChanged;
} s_cb_common_UpdateState_cache;

JNIEXPORT void JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024UpdateState_nativeClassInit(JNIEnv *env, jclass jcls) {
	s_cb_common_UpdateState_cache.jmid_UpdateStateChanged = (*env)->GetStaticMethodID(env, jcls, "updatestatechanged", "(Lcom/parrot/drone/sdkcore/arsdk/ArsdkFeatureCommon$UpdateState$Callback;Ljava/lang/String;Ljava/lang/String;I)V");
}

static int evt_common_UpdateState_UpdateStateChanged(JNIEnv *env, jclass clazz, struct arsdk_cmd *cmd, jobject callback) {
	const char * sourceVersion;
	const char * targetVersion;
	int32_t status;
	int res = arsdk_cmd_dec_Common_UpdateState_UpdateStateChanged(cmd, &sourceVersion, &targetVersion, &status);
	if (res < 0)
		return res;
	(*env)->CallStaticVoidMethod(env, clazz, s_cb_common_UpdateState_cache.jmid_UpdateStateChanged, callback, (*env)->NewStringUTF(env, sourceVersion), (*env)->NewStringUTF(env, targetVersion), (jint)status);
	return 0;
}

JNIEXPORT jint JNICALL
Java_com_parrot_drone_sdkcore_arsdk_ArsdkFeatureCommon_00024UpdateState_nativeDecode(JNIEnv *env, jclass jcls, jlong nativeCmd, jobject callback) {
	struct arsdk_cmd *cmd = (struct arsdk_cmd *)(uintptr_t)nativeCmd;
	if (cmd->prj_id != 0 || cmd->cls_id != 34)
		return -1;
	switch(cmd->cmd_id) {
		case 0: return evt_common_UpdateState_UpdateStateChanged(env, jcls, cmd, callback);
	}
	return -1;
}

