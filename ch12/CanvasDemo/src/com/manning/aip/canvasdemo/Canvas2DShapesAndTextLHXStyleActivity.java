package com.manning.aip.canvasdemo;

import android.app.Activity;
import android.os.Bundle;

public class Canvas2DShapesAndTextLHXStyleActivity extends Activity {

   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      ShapesAndTextView view = new ShapesAndTextView(this);
      view.setText("LHX Style");
      setContentView(view);
   }
}
