package bruno.android.circlepanoramaimage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    public ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image);
        image.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move));
    }

    @Override
    public void onClick(View v) {
    }
}
