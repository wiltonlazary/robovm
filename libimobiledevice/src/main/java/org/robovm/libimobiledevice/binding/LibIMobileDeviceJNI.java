/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class LibIMobileDeviceJNI {
  public final static native void StringArray_value_set(long jarg1, StringArray jarg1_, String jarg2);
  public final static native String StringArray_value_get(long jarg1, StringArray jarg1_);
  public final static native long new_StringArray(int jarg1);
  public final static native void delete_StringArray(long jarg1);
  public final static native String StringArray_get(long jarg1, StringArray jarg1_, int jarg2);
  public final static native void StringArray_set(long jarg1, StringArray jarg1_, int jarg2, String jarg3);
  public final static native void ByteArray_value_set(long jarg1, ByteArray jarg1_, byte jarg2);
  public final static native byte ByteArray_value_get(long jarg1, ByteArray jarg1_);
  public final static native long new_ByteArray(int jarg1);
  public final static native void delete_ByteArray(long jarg1);
  public final static native byte ByteArray_get(long jarg1, ByteArray jarg1_, int jarg2);
  public final static native void ByteArray_set(long jarg1, ByteArray jarg1_, int jarg2, byte jarg3);
  public final static native int IntOut_value_get(long jarg1, IntOut jarg1_);
  public final static native long new_IntOut();
  public final static native void delete_IntOut(long jarg1);
  public final static native long LongOut_value_get(long jarg1, LongOut jarg1_);
  public final static native long new_LongOut();
  public final static native void delete_LongOut(long jarg1);
  public final static native String StringOut_value_get(long jarg1, StringOut jarg1_);
  public final static native long new_StringOut();
  public final static native void delete_StringOut(long jarg1);
  public final static native long StringArrayOut_value_get(long jarg1, StringArrayOut jarg1_);
  public final static native long new_StringArrayOut();
  public final static native void delete_StringArrayOut(long jarg1);
  public final static native long ByteArrayOut_value_get(long jarg1, ByteArrayOut jarg1_);
  public final static native long new_ByteArrayOut();
  public final static native void delete_ByteArrayOut(long jarg1);
  public final static native long IDeviceRefOut_value_get(long jarg1, IDeviceRefOut jarg1_);
  public final static native long new_IDeviceRefOut();
  public final static native void delete_IDeviceRefOut(long jarg1);
  public final static native long IDeviceConnectionRefOut_value_get(long jarg1, IDeviceConnectionRefOut jarg1_);
  public final static native long new_IDeviceConnectionRefOut();
  public final static native void delete_IDeviceConnectionRefOut(long jarg1);
  public final static native long LockdowndClientRefOut_value_get(long jarg1, LockdowndClientRefOut jarg1_);
  public final static native long new_LockdowndClientRefOut();
  public final static native void delete_LockdowndClientRefOut(long jarg1);
  public final static native long LockdowndServiceDescriptorStructOut_value_get(long jarg1, LockdowndServiceDescriptorStructOut jarg1_);
  public final static native long new_LockdowndServiceDescriptorStructOut();
  public final static native void delete_LockdowndServiceDescriptorStructOut(long jarg1);
  public final static native long AfcClientRefOut_value_get(long jarg1, AfcClientRefOut jarg1_);
  public final static native long new_AfcClientRefOut();
  public final static native void delete_AfcClientRefOut(long jarg1);
  public final static native long PlistRefOut_value_get(long jarg1, PlistRefOut jarg1_);
  public final static native long new_PlistRefOut();
  public final static native void delete_PlistRefOut(long jarg1);
  public final static native long InstproxyClientRefOut_value_get(long jarg1, InstproxyClientRefOut jarg1_);
  public final static native long new_InstproxyClientRefOut();
  public final static native void delete_InstproxyClientRefOut(long jarg1);
  public final static native long MobileImageMounterClientRefOut_value_get(long jarg1, MobileImageMounterClientRefOut jarg1_);
  public final static native long new_MobileImageMounterClientRefOut();
  public final static native void delete_MobileImageMounterClientRefOut(long jarg1);
  public final static native long plist_new_dict();
  public final static native void plist_free(long jarg1);
  public final static native void plist_to_bin(long jarg1, long jarg2, ByteArrayOut jarg2_, long jarg3, IntOut jarg3_);
  public final static native void plist_to_xml(long jarg1, long jarg2, ByteArrayOut jarg2_, long jarg3, IntOut jarg3_);
  public final static native void plist_from_bin(byte[] jarg1, int jarg2, long jarg3, PlistRefOut jarg3_);
  public final static native void delete_StringOut_value(long jarg1, StringOut jarg1_);
  public final static native void delete_ByteArrayOut_value(long jarg1, ByteArrayOut jarg1_);
  public final static native void delete_StringArray_values(long jarg1, StringArray jarg1_, int jarg2);
  public final static native void delete_StringArray_values_z(long jarg1, StringArray jarg1_);
  public final static native long get_global_instproxy_status_cb();
  public final static native long get_global_idevice_event_cb();
  public final static native int upload_image(long jarg1, String jarg2, String jarg3);
  public final static native void idevice_set_debug_level(int jarg1);
  public final static native void IDeviceEvent_event_set(long jarg1, IDeviceEvent jarg1_, int jarg2);
  public final static native int IDeviceEvent_event_get(long jarg1, IDeviceEvent jarg1_);
  public final static native void IDeviceEvent_udid_set(long jarg1, IDeviceEvent jarg1_, String jarg2);
  public final static native String IDeviceEvent_udid_get(long jarg1, IDeviceEvent jarg1_);
  public final static native void IDeviceEvent_connectionType_set(long jarg1, IDeviceEvent jarg1_, int jarg2);
  public final static native int IDeviceEvent_connectionType_get(long jarg1, IDeviceEvent jarg1_);
  public final static native long new_IDeviceEvent();
  public final static native void delete_IDeviceEvent(long jarg1);
  public final static native int idevice_event_subscribe(long jarg1, int jarg2);
  public final static native int idevice_event_unsubscribe();
  public final static native int idevice_get_device_list(long jarg1, StringArrayOut jarg1_, long jarg2, IntOut jarg2_);
  public final static native int idevice_device_list_free(long jarg1, StringArray jarg1_);
  public final static native int idevice_new(long jarg1, IDeviceRefOut jarg1_, String jarg2);
  public final static native int idevice_free(long jarg1);
  public final static native int idevice_connect(long jarg1, short jarg2, long jarg3, IDeviceConnectionRefOut jarg3_);
  public final static native int idevice_disconnect(long jarg1);
  public final static native int idevice_connection_send(long jarg1, byte[] jarg2, int jarg3, long jarg4, IntOut jarg4_);
  public final static native int idevice_connection_receive_timeout(long jarg1, byte[] jarg2, int jarg3, long jarg4, IntOut jarg4_, long jarg5);
  public final static native int idevice_connection_receive(long jarg1, byte[] jarg2, int jarg3, long jarg4, IntOut jarg4_);
  public final static native int idevice_connection_enable_ssl(long jarg1);
  public final static native int idevice_connection_disable_ssl(long jarg1);
  public final static native int idevice_get_handle(long jarg1, long jarg2, IntOut jarg2_);
  public final static native int idevice_get_udid(long jarg1, long jarg2, StringOut jarg2_);
  public final static native void LockdowndPairRecordStruct_device_certificate_set(long jarg1, LockdowndPairRecordStruct jarg1_, String jarg2);
  public final static native String LockdowndPairRecordStruct_device_certificate_get(long jarg1, LockdowndPairRecordStruct jarg1_);
  public final static native void LockdowndPairRecordStruct_host_certificate_set(long jarg1, LockdowndPairRecordStruct jarg1_, String jarg2);
  public final static native String LockdowndPairRecordStruct_host_certificate_get(long jarg1, LockdowndPairRecordStruct jarg1_);
  public final static native void LockdowndPairRecordStruct_root_certificate_set(long jarg1, LockdowndPairRecordStruct jarg1_, String jarg2);
  public final static native String LockdowndPairRecordStruct_root_certificate_get(long jarg1, LockdowndPairRecordStruct jarg1_);
  public final static native void LockdowndPairRecordStruct_host_id_set(long jarg1, LockdowndPairRecordStruct jarg1_, String jarg2);
  public final static native String LockdowndPairRecordStruct_host_id_get(long jarg1, LockdowndPairRecordStruct jarg1_);
  public final static native void LockdowndPairRecordStruct_system_buid_set(long jarg1, LockdowndPairRecordStruct jarg1_, String jarg2);
  public final static native String LockdowndPairRecordStruct_system_buid_get(long jarg1, LockdowndPairRecordStruct jarg1_);
  public final static native long new_LockdowndPairRecordStruct();
  public final static native void delete_LockdowndPairRecordStruct(long jarg1);
  public final static native void LockdowndServiceDescriptorStruct_port_set(long jarg1, LockdowndServiceDescriptorStruct jarg1_, short jarg2);
  public final static native short LockdowndServiceDescriptorStruct_port_get(long jarg1, LockdowndServiceDescriptorStruct jarg1_);
  public final static native void LockdowndServiceDescriptorStruct_sslEnabled_set(long jarg1, LockdowndServiceDescriptorStruct jarg1_, boolean jarg2);
  public final static native boolean LockdowndServiceDescriptorStruct_sslEnabled_get(long jarg1, LockdowndServiceDescriptorStruct jarg1_);
  public final static native long new_LockdowndServiceDescriptorStruct();
  public final static native void delete_LockdowndServiceDescriptorStruct(long jarg1);
  public final static native int lockdownd_client_new(long jarg1, long jarg2, LockdowndClientRefOut jarg2_, String jarg3);
  public final static native int lockdownd_client_new_with_handshake(long jarg1, long jarg2, LockdowndClientRefOut jarg2_, String jarg3);
  public final static native int lockdownd_client_free(long jarg1);
  public final static native int lockdownd_query_type(long jarg1, long jarg2, StringOut jarg2_);
  public final static native int lockdownd_get_value(long jarg1, String jarg2, String jarg3, long jarg4, PlistRefOut jarg4_);
  public final static native int lockdownd_set_value(long jarg1, String jarg2, String jarg3, long jarg4);
  public final static native int lockdownd_remove_value(long jarg1, String jarg2, String jarg3);
  public final static native int lockdownd_start_service(long jarg1, String jarg2, long jarg3, LockdowndServiceDescriptorStructOut jarg3_);
  public final static native int lockdownd_start_service_with_escrow_bag(long jarg1, String jarg2, long jarg3, LockdowndServiceDescriptorStructOut jarg3_);
  public final static native int lockdownd_start_session(long jarg1, String jarg2, long jarg3, StringOut jarg3_, long jarg4, IntOut jarg4_);
  public final static native int lockdownd_stop_session(long jarg1, String jarg2);
  public final static native int lockdownd_send(long jarg1, long jarg2);
  public final static native int lockdownd_receive(long jarg1, long jarg2, PlistRefOut jarg2_);
  public final static native int lockdownd_pair(long jarg1, long jarg2, LockdowndPairRecordStruct jarg2_);
  public final static native int lockdownd_validate_pair(long jarg1, long jarg2, LockdowndPairRecordStruct jarg2_);
  public final static native int lockdownd_unpair(long jarg1, long jarg2, LockdowndPairRecordStruct jarg2_);
  public final static native int lockdownd_activate(long jarg1, long jarg2);
  public final static native int lockdownd_deactivate(long jarg1);
  public final static native int lockdownd_enter_recovery(long jarg1);
  public final static native int lockdownd_goodbye(long jarg1);
  public final static native void lockdownd_client_set_label(long jarg1, String jarg2);
  public final static native int lockdownd_get_device_udid(long jarg1, long jarg2, StringOut jarg2_);
  public final static native int lockdownd_get_device_name(long jarg1, long jarg2, StringOut jarg2_);
  public final static native int lockdownd_get_sync_data_classes(long jarg1, long jarg2, StringArrayOut jarg2_, long jarg3, IntOut jarg3_);
  public final static native int lockdownd_data_classes_free(long jarg1, StringArray jarg1_);
  public final static native int lockdownd_service_descriptor_free(long jarg1, LockdowndServiceDescriptorStruct jarg1_);
  public final static native int afc_client_new(long jarg1, long jarg2, LockdowndServiceDescriptorStruct jarg2_, long jarg3, AfcClientRefOut jarg3_);
  public final static native int afc_client_start_service(long jarg1, long jarg2, AfcClientRefOut jarg2_, String jarg3);
  public final static native int afc_client_free(long jarg1);
  public final static native int afc_get_device_info(long jarg1, long jarg2, StringArrayOut jarg2_);
  public final static native int afc_read_directory(long jarg1, String jarg2, long jarg3, StringArrayOut jarg3_);
  public final static native int afc_get_file_info(long jarg1, String jarg2, long jarg3, StringArrayOut jarg3_);
  public final static native int afc_file_open(long jarg1, String jarg2, int jarg3, long jarg4, LongOut jarg4_);
  public final static native int afc_file_close(long jarg1, long jarg2);
  public final static native int afc_file_lock(long jarg1, long jarg2, int jarg3);
  public final static native int afc_file_read(long jarg1, long jarg2, byte[] jarg3, int jarg4, long jarg5, IntOut jarg5_);
  public final static native int afc_file_write(long jarg1, long jarg2, byte[] jarg3, int jarg4, long jarg5, IntOut jarg5_);
  public final static native int afc_file_seek(long jarg1, long jarg2, long jarg3, int jarg4);
  public final static native int afc_file_tell(long jarg1, long jarg2, long jarg3, LongOut jarg3_);
  public final static native int afc_file_truncate(long jarg1, long jarg2, long jarg3);
  public final static native int afc_remove_path(long jarg1, String jarg2);
  public final static native int afc_rename_path(long jarg1, String jarg2, String jarg3);
  public final static native int afc_make_directory(long jarg1, String jarg2);
  public final static native int afc_truncate(long jarg1, String jarg2, long jarg3);
  public final static native int afc_make_link(long jarg1, int jarg2, String jarg3, String jarg4);
  public final static native int afc_set_file_time(long jarg1, String jarg2, long jarg3);
  public final static native int afc_remove_path_and_contents(long jarg1, String jarg2);
  public final static native int afc_get_device_info_key(long jarg1, String jarg2, long jarg3, StringOut jarg3_);
  public final static native int afc_dictionary_free(long jarg1, StringOut jarg1_);
  public final static native int instproxy_client_new(long jarg1, long jarg2, LockdowndServiceDescriptorStruct jarg2_, long jarg3, InstproxyClientRefOut jarg3_);
  public final static native int instproxy_client_start_service(long jarg1, long jarg2, InstproxyClientRefOut jarg2_, String jarg3);
  public final static native int instproxy_client_free(long jarg1);
  public final static native int instproxy_browse(long jarg1, long jarg2, long jarg3, PlistRefOut jarg3_);
  public final static native int instproxy_install(long jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int instproxy_upgrade(long jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int instproxy_uninstall(long jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int instproxy_lookup_archives(long jarg1, long jarg2, long jarg3, PlistRefOut jarg3_);
  public final static native int instproxy_archive(long jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int instproxy_restore(long jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int instproxy_remove_archive(long jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native long instproxy_client_options_new();
  public final static native void instproxy_client_options_free(long jarg1);
  public final static native int instproxy_client_get_path_for_bundle_identifier(long jarg1, String jarg2, long jarg3, StringOut jarg3_);
  public final static native int mobile_image_mounter_new(long jarg1, long jarg2, LockdowndServiceDescriptorStruct jarg2_, long jarg3, MobileImageMounterClientRefOut jarg3_);
  public final static native int mobile_image_mounter_start_service(long jarg1, long jarg2, MobileImageMounterClientRefOut jarg2_, String jarg3);
  public final static native int mobile_image_mounter_free(long jarg1);
  public final static native int mobile_image_mounter_lookup_image(long jarg1, String jarg2, long jarg3, PlistRefOut jarg3_);
  public final static native int mobile_image_mounter_mount_image(long jarg1, String jarg2, String jarg3, short jarg4, String jarg5, long jarg6, PlistRefOut jarg6_);
  public final static native int mobile_image_mounter_hangup(long jarg1);

  private static native void initNative();
  static {
    org.robovm.libimobiledevice.NativeLibrary.load();
    initNative();
  }

}
