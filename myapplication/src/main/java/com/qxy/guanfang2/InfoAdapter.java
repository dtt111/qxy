package com.qxy.guanfang2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

public class InfoAdapter extends BaseAdapter {

    private Context mContext;
    private List<Map<String, ?>> listItems;
    private LayoutInflater inflater;

    public InfoAdapter(List<Map<String, ?>> listItems, Context mContext) {
        super();
        this.inflater = LayoutInflater.from(mContext);
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return this.listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /*
     * 使用循环迭代遍历listItems中的每一个选项对象，并通过转换视图对象ConverView动态加载当前选项布局资源
     * 同时根据ListItem中的选项对象参数，动态设置其组件显示和内容
     * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /* 步骤1：创建一个空的InfoViewHolder对象 */
        InfoViewHolder infoViewHolder = null;
        /* 步骤2：判断转换视图参数convertView是否为空，若为空则实例化viewHolder对象中的组件 */
        if(convertView == null){
            infoViewHolder = new InfoViewHolder();
            /* 步骤3：转换视图绑定列表选项布局文件 */
            convertView = this.inflater.inflate(R.layout.layout_movie_item, null);
            /* 步骤4：获取列表布局中的所有组件对象 */
            infoViewHolder.imgMovie = (ImageView) convertView.findViewById(R.id.MovieImage);
            infoViewHolder.txtMovieName = (TextView) convertView.findViewById(R.id.MovieName);
            infoViewHolder.txtMovieScore = (TextView) convertView.findViewById(R.id.MovieScore);
            infoViewHolder.txtMovieType = (TextView) convertView.findViewById(R.id.MovieType);
            infoViewHolder.txtMovieTime = (TextView) convertView.findViewById(R.id.MovieTime);
            infoViewHolder.txtMovieNum = (TextView) convertView.findViewById(R.id.MovieNum);

            infoViewHolder.FirstLn = (LinearLayout) convertView.findViewById(R.id.FirstLinear);
            infoViewHolder.SecondLn = (LinearLayout) convertView.findViewById(R.id.SecondLinear);

            infoViewHolder.btnBuyTicket = (Button) convertView.findViewById(R.id.btnBuyTicket);
            /* 步骤5：转换视图设置ViewHolder对象*/
            convertView.setTag(infoViewHolder);
        }else{
            infoViewHolder = (InfoViewHolder) convertView.getTag();
        }

        /* 步骤6：动态为每一个选项对象赋值 */
//        infoViewHolder.imgIcon.setImageResource((Integer) this.listItems.get(position).get("imgIcon"));
//        infoViewHolder.txtUserName.setText(this.listItems.get(position).get("txtUserName").toString());
//        infoViewHolder.txtInfo.setText(this.listItems.get(position).get("txtInfo").toString());
//        infoViewHolder.txtPublish.setText(this.listItems.get(position).get("txtPublish").toString());

//        /* 步骤7：动态设置适配器中的组件显示 */
//        if(this.listItems.get(position).get("FirstLinear").toString().equals("0")){
//            infoViewHolder.FirstLn.setVisibility(View.GONE);
//        }
//
//        if(this.listItems.get(position).get("SecondLinear").toString().equals("0")){
//            infoViewHolder.SecondLn.setVisibility(View.GONE);
//        }

        /* 步骤8：监听器绑定 */
//        infoViewHolder.btnBuyTicket.setOnClickListener(new ViewOcl(position));

        return convertView;
    }

    /* 自定义一个单击监听器 */
    private class ViewOcl implements View.OnClickListener{
        private int position;

        public ViewOcl(int position) {
            this.position = position;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnBuyTicket:
                    Toast.makeText(mContext, "你要购票 ["+ listItems.get(position).get("txtUserName") +"]", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

}