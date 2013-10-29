/*
 * Copyright (c) 2011. EMC Corporation. All Rights Reserved.
 */

// Expressions.js

Ext.namespace("xcp");

Ext.define("Expression.IdFromContext",
{
	alias : 'expression.id_from_context',

	statics : {
		evaluate : function () {
			return xcp.navigationManager.currentNavigationContext.objectId;
		}
	}

});

Ext.define("xcp.expression.Generated",{
extend:"xcp.core.expr.BaseExpression",
singleton:true});

xcp.expression.Generated.assign_task_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_assign_task','Inputs.id'); }

xcp.expression.Generated.assign_task_da_userName_1 = function (context) { return this.getValueFromWidget(context,'dropdown_list','value'); }

xcp.expression.Generated.attachment_sel_da_selection_1 = function (context) { return this.getValueFromSelectionModel(context,'results_list','id'); }

xcp.expression.Generated.changeworkqueue_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_changeworkqueue','Inputs.id'); }

xcp.expression.Generated.changeworkqueue_da_queueName_1 = function (context) { return this.getValueFromWidget(context,'queue_dropdown_list','value'); }

xcp.expression.Generated.gta_attachment_step_folderQuery_1_folder_id_1 = function (context) { return xcp.widget.ContentTree.getSelectedNodeId(context,'content_tree'); }

xcp.expression.Generated.gta_edit_base_content_comments_objectId_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','id'); }

xcp.expression.Generated.gta_edit_base_content_da_def_update_dm_document_id_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','id'); }

xcp.expression.Generated.gta_edit_base_content_da_def_update_dm_document_object_name_1 = function (context) { return this.getValueFromWidget(context,'object_name','value'); }

xcp.expression.Generated.gta_edit_base_content_r_lock_owner_hidden_1 = function (context) { return xcp.functions.length(this.getValueFromModel(context,'xcp_dm_document','r_lock_owner')) == 0; }

xcp.expression.Generated.gta_edit_base_content_r_lock_owner_value_1 = function (context) { return xcp.functions.lockStatus(this.getValueFromModel(context,'xcp_dm_document','r_lock_date'), this.getValueFromModel(context,'xcp_dm_document','r_lock_owner')); }

xcp.expression.Generated.gta_edit_base_content_viewer_contentType_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','a_content_type'); }

xcp.expression.Generated.gta_edit_base_content_viewer_objectId_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','id'); }

xcp.expression.Generated.gta_edit_base_folder_da_def_update_dm_folder_id_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_folder','id'); }

xcp.expression.Generated.gta_edit_base_folder_da_def_update_dm_folder_object_name_1 = function (context) { return this.getValueFromWidget(context,'object_name','value'); }

xcp.expression.Generated.gta_forward_activity_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_forward_activity_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'INPUT'; }

xcp.expression.Generated.gta_forward_activity_multi_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_forward_activity_multi_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'INPUT'; }

xcp.expression.Generated.gta_reject_activity_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_reject_activity_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'REVERT'; }

xcp.expression.Generated.gta_reject_activity_multi_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_reject_activity_multi_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'REVERT'; }

xcp.expression.Generated.gta_selector_content_st_content_rt_query_input_contenttype_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('contenttype'); }

xcp.expression.Generated.gta_selector_content_st_content_rt_query_input_name_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

xcp.expression.Generated.gta_selector_folder_ste_folder_rt_query_1_input_folder_id_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

xcp.expression.Generated.gta_signoff_forward_multi_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_signoff_forward_multi_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'INPUT'; }

xcp.expression.Generated.gta_signoff_forward_one_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_signoff_forward_one_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'INPUT'; }

xcp.expression.Generated.gta_signoff_reject_multi_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_signoff_reject_multi_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'REVERT'; }

xcp.expression.Generated.gta_signoff_reject_one_activity_list_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_signoff_reject_one_activity_list_initiate_staless_ds_1_port_type_1 = function (context) { return 'REVERT'; }

xcp.expression.Generated.gta_signoff_usergroup_multi_userorgroup_selecti_staless_ds_1_starts_with_filter_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

xcp.expression.Generated.gta_signoff_usergroup_userorgroup_selecti_staless_ds_1_starts_with_filter_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

xcp.expression.Generated.gta_user_from_queue_user_from_queue_initiate_staless_ds_1_id_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('id'); }

xcp.expression.Generated.gta_user_preferences_column_box3_hidden_1 = function (context) { return this.getValueFromWidget(context,'delegate_task','value') != true; }

xcp.expression.Generated.gta_user_preferences_delegateToUser_disabled_1 = function (context) { return this.getValueFromWidget(context,'delegate_task','value') != true; }

xcp.expression.Generated.gta_user_preferences_delegateToUser_hidden_1 = function (context) { return this.getValueFromWidget(context,'delegate_task','value') != true; }

xcp.expression.Generated.gta_usergroup_selection_multi_userorgroup_selecti_staless_ds_1_starts_with_filter_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

xcp.expression.Generated.gta_usergroup_selection_userorgroup_selecti_staless_ds_1_starts_with_filter_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

xcp.expression.Generated.gta_view_base_content_comments_objectId_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','id'); }

xcp.expression.Generated.gta_view_base_content_da_def_delete_dm_document_id_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','id'); }

xcp.expression.Generated.gta_view_base_content_r_lock_owner_hidden_1 = function (context) { return xcp.functions.length(this.getValueFromModel(context,'xcp_dm_document','r_lock_owner')) == 0; }

xcp.expression.Generated.gta_view_base_content_r_lock_owner_value_1 = function (context) { return xcp.functions.lockStatus(this.getValueFromModel(context,'xcp_dm_document','r_lock_date'), this.getValueFromModel(context,'xcp_dm_document','r_lock_owner')); }

xcp.expression.Generated.gta_view_base_content_viewer_contentType_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','a_content_type'); }

xcp.expression.Generated.gta_view_base_content_viewer_objectId_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_document','id'); }

xcp.expression.Generated.gta_view_base_folder_da_def_delete_dm_folder_id_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_folder','id'); }

xcp.expression.Generated.gta_view_base_folder_folderQuery_folder_id_1 = function (context) { return this.getValueFromModel(context,'xcp_dm_folder','id'); }

xcp.expression.Generated.hold_task_da_holdUntil_1 = function (context) { return this.getValueFromWidget(context,'hold_until','value'); }

xcp.expression.Generated.hold_task_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_hold_task','Inputs.id'); }

xcp.expression.Generated.reassign_task_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_reassign_task','Inputs.id'); }

xcp.expression.Generated.reassign_task_da_userName_1 = function (context) { return this.getValueFromWidget(context,'dropdown_list','value'); }

xcp.expression.Generated.selector_content_da_selection_1 = function (context) { return this.getValueFromSelectionModel(context,'results_list','id'); }

xcp.expression.Generated.selector_folder_da_selection_1 = function (context) { return this.getValueFromSelectionModel(context,'results_list','id'); }

xcp.expression.Generated.update_preferences_update_delegateToUser = function (context) { return this.getValueFromWidget(context,'delegateToUser','value'); }

xcp.expression.Generated.update_preferences_update_delegate_task = function (context) { return this.getValueFromWidget(context,'delegate_task','value'); }

xcp.expression.Generated.update_preferences_update_networkLocation = function (context) { return this.getValueFromWidget(context,'networkLocation','value'); }

xcp.expression.Generated.update_preferences_update_role = function (context) { return this.getValueFromWidget(context,'role','value'); }

xcp.expression.Generated.update_preferences_update_workflowAutoNextTask = function (context) { return this.getValueFromWidget(context,'workflowAutoNextTask','value'); }

xcp.expression.Generated.xcp_attachment_step_content_tree_folderRoot_1 = function (context) { return xcp.functions.internal.getValueFromActionFlowInputModel('folderRoot'); }

xcp.expression.Generated.xcp_hold_task_hold_until_value_1 = function (context) { return xcp.functions.addDays(xcp.functions.today(), 1); }

