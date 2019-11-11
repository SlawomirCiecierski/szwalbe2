package pl.ciecierski.szwalbe2.methods;


import android.view.View;
import android.widget.Toast;


public class MyMethods {

     public static void showMyToast(View view) {
        Toast toast = Toast.makeText(view.getContext(), "autor: Sławomir Ciecierski\n email: ciecierski@post.pl", Toast.LENGTH_LONG);
        toast.show();
    }


}
