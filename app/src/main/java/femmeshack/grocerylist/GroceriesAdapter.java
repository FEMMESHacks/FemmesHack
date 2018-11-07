package femmeshack.grocerylist;

/**
 * Created by cathychi on 11/3/18.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class GroceriesAdapter extends RecyclerView.Adapter<GroceriesAdapter.ViewHolder>{

    private List<String> mGroceries;
    private Context mContext;

    public GroceriesAdapter(Context context, List<String> answers) {
        this.mContext = context;
        this.mGroceries = answers;
    }

    @Override
    public GroceriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.items_rv, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GroceriesAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(mGroceries.get(position));

    }

    @Override
    public int getItemCount() {
        return mGroceries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public View mView;
        public ViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.itemNameText);
            mView = itemView;
        }
    }
}