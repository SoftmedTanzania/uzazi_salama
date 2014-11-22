package org.ei.drishti.view.viewHolder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import org.ei.drishti.R;
import org.ei.drishti.view.customControls.ANCClientIdDetailsView;
import org.ei.drishti.view.customControls.ANCStatusView;
import org.ei.drishti.view.customControls.ClientProfileView;

public class NativeANCSmartRegisterViewHolder {
    private final ClientProfileView profileInfoLayout;
    private final ANCClientIdDetailsView ancClientIdDetailsView;
    private final ANCStatusView ancStatusView;

    private final TextView btnAncVisitView;
    private final View layoutANCVisitAlert;
    private final TextView txtANCVisitDoneOn;
    private final TextView txtANCVisitDueType;
    private final TextView txtANCVisitAlertDueOn;
    private final ViewGroup serviceModeViewsHolder;
    private final ViewGroup serviceModeOverviewView;
    private final TextView txtRiskFactors;
    private final TextView btnTTView;
    private final View layoutTTAlert;
    private final TextView txtTTDoneOn;
    private final TextView txtTTDueType;
    private final TextView txtTTDueOn;
    private final TextView btnIFAView;
    private final View layoutIFAAlert;
    private final TextView txtIFADoneOn;
    private final TextView txtIFADueType;
    private final TextView txtIFADueOn;
    private final ImageButton btnEditView;

    public NativeANCSmartRegisterViewHolder(ViewGroup itemView) {
        profileInfoLayout = (ClientProfileView) itemView.findViewById(R.id.profile_info_layout);
        profileInfoLayout.initialize();

        ancClientIdDetailsView = (ANCClientIdDetailsView) itemView.findViewById(R.id.client_id_details_layout);
        ancClientIdDetailsView.initialize();

        ancStatusView = (ANCStatusView) itemView.findViewById(R.id.client_status_layout);
        ancStatusView.initialize();

        serviceModeViewsHolder = (ViewGroup) itemView.findViewById(R.id.anc_register_service_mode_options_view);
        serviceModeOverviewView = (ViewGroup) serviceModeViewsHolder.findViewById(R.id.overview_service_mode_views);

        txtRiskFactors = (TextView) serviceModeOverviewView.findViewById(R.id.txt_risk_factors);

        btnAncVisitView = (TextView) serviceModeOverviewView.findViewById(R.id.btn_anc_visit);
        layoutANCVisitAlert = serviceModeOverviewView.findViewById(R.id.layout_anc_visit_alert);
        txtANCVisitDoneOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_anc_visit_on);
        txtANCVisitDueType = (TextView) serviceModeOverviewView.findViewById(R.id.txt_anc_visit_due_type);
        txtANCVisitAlertDueOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_anc_visit_due_on);

        btnTTView = (TextView) serviceModeOverviewView.findViewById(R.id.btn_tt);
        layoutTTAlert = serviceModeOverviewView.findViewById(R.id.layout_tt_alert);
        txtTTDoneOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_tt_on);
        txtTTDueType = (TextView) serviceModeOverviewView.findViewById(R.id.txt_tt_due_type);
        txtTTDueOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_tt_due_on);

        btnIFAView = (TextView) serviceModeOverviewView.findViewById(R.id.btn_ifa);
        layoutIFAAlert = serviceModeOverviewView.findViewById(R.id.layout_ifa_alert);
        txtIFADoneOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_ifa_on);
        txtIFADueType = (TextView) serviceModeOverviewView.findViewById(R.id.txt_ifa_due_type);
        txtIFADueOn = (TextView) serviceModeOverviewView.findViewById(R.id.txt_ifa_due_on);

        btnEditView = (ImageButton) serviceModeOverviewView.findViewById(R.id.btn_edit);
    }

    public ClientProfileView profileInfoLayout() {
        return profileInfoLayout;
    }

    public ANCClientIdDetailsView ancClientIdDetailsView() {
        return ancClientIdDetailsView;
    }

    public ANCStatusView ancStatusView() {
        return ancStatusView;
    }

    public TextView btnAncVisitView() {
        return btnAncVisitView;
    }

    public View layoutANCVisitAlert() {
        return layoutANCVisitAlert;
    }

    public TextView txtANCVisitDoneOn() {
        return txtANCVisitDoneOn;
    }

    public TextView txtANCVisitDueType() {
        return txtANCVisitDueType;
    }

    public TextView txtANCVisitAlertDueOn() {
        return txtANCVisitAlertDueOn;
    }

    public TextView txtRiskFactors() {
        return txtRiskFactors;
    }

    public ViewGroup serviceModeOverviewView() {
        return serviceModeOverviewView;
    }

    public TextView btnTTView() {
        return btnTTView;
    }

    public View layoutTTAlert() {
        return layoutTTAlert;
    }

    public TextView txtTTDoneOn() {
        return txtTTDoneOn;
    }

    public TextView txtTTDueType() {
        return txtTTDueType;
    }

    public TextView txtTTDueOn() {
        return txtTTDueOn;
    }

    public TextView btnIFAView() {
        return btnIFAView;
    }

    public View layoutIFAAlert() {
        return layoutIFAAlert;
    }

    public TextView txtIFADoneOn() {
        return txtIFADoneOn;
    }

    public TextView txtIFADueType() {
        return txtIFADueType;
    }

    public TextView txtIFADueOn() {
        return txtIFADueOn;
    }

    public ImageButton btnEditView() {
        return btnEditView;
    }
}