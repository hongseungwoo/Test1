package com.test1.ant.test1;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ant on 2016-10-04.
 */

public class TestActivity extends Activity {

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;

    private static final String IMAGEVIEW_TAG = "드래그 이미지";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);

        image1.setTag(IMAGEVIEW_TAG);
        image2.setTag(IMAGEVIEW_TAG);
        image3.setTag(IMAGEVIEW_TAG);

        image1.setOnLongClickListener(new MyClickListener());
        image2.setOnLongClickListener(new MyClickListener());
        image3.setOnLongClickListener(new MyClickListener());

        findViewById(R.id.layout_11).setOnDragListener(new DragListener());
        findViewById(R.id.layout_12).setOnDragListener(new DragListener());
        findViewById(R.id.layout_13).setOnDragListener(new DragListener());
        findViewById(R.id.layout_21).setOnDragListener(new DragListener());
        findViewById(R.id.layout_22).setOnDragListener(new DragListener());
        findViewById(R.id.layout_23).setOnDragListener(new DragListener());
        findViewById(R.id.layout_31).setOnDragListener(new DragListener());
        findViewById(R.id.layout_32).setOnDragListener(new DragListener());
        findViewById(R.id.layout_33).setOnDragListener(new DragListener());

    }

    private final class MyClickListener implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            // 태그 생성
            ClipData.Item item = new ClipData.Item(
                    (CharSequence) v.getTag());

            String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
            ClipData data = new ClipData(v.getTag().toString(),
                    mimeTypes, item);
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                    v);

            v.startDrag(data, // data to be dragged
                    shadowBuilder, // drag shadow
                    v, // 드래그 드랍할  Vew
                    0 // 필요없은 플래그
            );

            //v.setVisibility(View.INVISIBLE);
            return true;
          }

    }

    class DragListener implements View.OnDragListener {
//        Drawable normalShape = getResources().getDrawable(
//                R.drawable.normal_shape);
//        Drawable targetShape = getResources().getDrawable(
//                R.drawable.target_shape);

        public boolean onDrag(View currentView, DragEvent event) {

            View saveView;

            // 이벤트 시작
            switch (event.getAction()) {

                // 이미지를 드래그 시작될때
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.d("DragClickListener", "ACTION_DRAG_STARTED");
                    saveView = (View) event.getLocalState();
                    break;

                // 드래그한 이미지를 옮길려는 지역으로 들어왔을때
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.d("DragClickListener", "ACTION_DRAG_ENTERED");
                    // 이미지가 들어왔다는 것을 알려주기 위해 배경이미지 변경
//                    currentView.setBackground(targetShape);
                    break;

                // 드래그한 이미지가 영역을 빠져 나갈때
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.d("DragClickListener", "ACTION_DRAG_EXITED");
//                    currentView.setBackground(normalShape);
                    break;

                // 이미지를 드래그해서 드랍시켰을때
                case DragEvent.ACTION_DROP:
                    Log.d("DragClickListener", "ACTION_DROP");
                    View dropView;
                    ViewGroup viewgroup;
                    LinearLayout containLayout;
                    switch(currentView.getId()) {
                        case R.id.layout_11:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_12:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_13:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_21:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_22:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_23:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_31:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_32:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.layout_33:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.gridlinear_1:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.gridlinear_2:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        case R.id.gridlinear_3:
                            dropView = (View) event.getLocalState();
                            viewgroup = (ViewGroup) dropView
                                    .getParent();
                            viewgroup.removeView(dropView);
                            containLayout = (LinearLayout) currentView;
                            containLayout.addView(dropView);
                            dropView.setVisibility(View.VISIBLE);
                            break;
                        default:
                            dropView = (View) event.getLocalState();
                            dropView.setVisibility(View.VISIBLE);
                            Context context = getApplicationContext();
                            Toast.makeText(context,
                                    "이미지를 다른 지역에 드랍할수 없습니다.",
                                    Toast.LENGTH_LONG).show();
                            break;
                    }
//                    if (v == findViewById(R.id.bottomlinear)) {
//                        View view = (View) event.getLocalState();
//                        ViewGroup viewgroup = (ViewGroup) view
//                                .getParent();
//                        viewgroup.removeView(view);
//
//                        // change the text
//                        TextView text = (TextView) v
//                                .findViewById(R.id.text);
//                        text.setText("이미지가 드랍되었습니다.");
//
//                        LinearLayout containView = (LinearLayout) v;
//                        containView.addView(view);
//                        view.setVisibility(View.VISIBLE);
//
//                    }else if (v == findViewById(R.id.toplinear)) {
//                        View view = (View) event.getLocalState();
//                        ViewGroup viewgroup = (ViewGroup) view
//                                .getParent();
//                        viewgroup.removeView(view);
//
//                        LinearLayout containView = (LinearLayout) v;
//                        containView.addView(view);
//                        view.setVisibility(View.VISIBLE);
//
//                    }else {
//                        View view = (View) event.getLocalState();
//                        view.setVisibility(View.VISIBLE);
//                        Context context = getApplicationContext();
//                        Toast.makeText(context,
//                                "이미지를 다른 지역에 드랍할수 없습니다.",
//                                Toast.LENGTH_LONG).show();
//                        break;
//                    }
                    break;

                case DragEvent.ACTION_DRAG_ENDED:
                    Log.d("DragClickListener", "ACTION_DRAG_ENDED");
//                    v.setBackground(normalShape); // go back to normal shape

                default:
                    break;
            }
            return true;
        }
    }
}
