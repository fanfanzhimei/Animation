package com.zhi.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);
        /*透明度动画*/
//        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha); //透明度

        /* 旋转动画代码实现方式*/
//        Animation animation = new RotateAnimation(0, 180, RotateAnimation.RELATIVE_TO_SELF, 0.5f,  RotateAnimation.RELATIVE_TO_SELF, 0.5f);
//        animation.setDuration(4000);

        /* 旋转动画 */
//        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);

        /* 平移动画 */
//        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
        /* 缩放动画 */
//        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);


        /*好玩的滚出去的动画*/
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.funny);
        animation.setFillAfter(true);
        image.startAnimation(animation);
    }
}
