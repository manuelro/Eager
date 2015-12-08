package co.eagerapp.manuelro.eager.Common.Listeners;

import android.view.View;

/**
 * Created by Manuel on 08/12/2015.
 */
public class CustomOnClickListener implements View.OnClickListener {
    private int nodeIndex;

    public CustomOnClickListener(int nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public void setNodeIndex(int nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public int getNodeIndex() {
        return nodeIndex;
    }

    @Override
    public void onClick(View v) {

    }
}
