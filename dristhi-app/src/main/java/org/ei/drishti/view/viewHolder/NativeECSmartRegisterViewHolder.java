package org.ei.drishti.view.viewHolder;

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import org.ei.drishti.R;
import org.ei.drishti.view.customControls.*;

public class NativeECSmartRegisterViewHolder {
    private final ClientProfileView profileInfoLayout;
    private final TextView txtECNumberView;
    private final ClientGPLSAView gplsaLayout;
    private final ClientFPMethodView fpMethodview;
    private final ClientChildrenView childrenView;
    private final ClientStatusView statusView;
    private final ImageButton editButton;


    public NativeECSmartRegisterViewHolder(ViewGroup itemView) {
        this.profileInfoLayout = (ClientProfileView) itemView.findViewById(R.id.profile_info_layout);
        this.profileInfoLayout.initialize();

        this.txtECNumberView = (TextView) itemView.findViewById(R.id.txt_ec_number);

        this.gplsaLayout = (ClientGPLSAView) itemView.findViewById(R.id.gplsa_layout);
        this.gplsaLayout.initialize();

        fpMethodview = (ClientFPMethodView) itemView.findViewById(R.id.fp_method_layout);
        fpMethodview.initialize();


        childrenView = (ClientChildrenView) itemView.findViewById(R.id.children_layout);
        childrenView.initialize();

        statusView = (ClientStatusView) itemView.findViewById(R.id.status_layout);
        statusView.initialize();

        this.editButton = (ImageButton) itemView.findViewById(R.id.btn_edit);
    }

    public ClientProfileView profileInfoLayout() {
        return profileInfoLayout;
    }

    public TextView txtECNumberView() {
        return txtECNumberView;
    }

    public ClientGPLSAView gplsaLayout() {
        return gplsaLayout;
    }

    public ClientFPMethodView fpMethodView() {
        return fpMethodview;
    }

    public ClientChildrenView childrenView() {
        return childrenView;
    }
    public ImageButton editButton() {
        return editButton;
    }

    public ClientStatusView statusView() {
        return statusView;
    }

}