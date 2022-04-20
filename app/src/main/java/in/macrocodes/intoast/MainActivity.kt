package `in`.macrocodes.intoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.toast1)
        button2 = findViewById(R.id.toast2)
        button3 = findViewById(R.id.toast3)
        button4 = findViewById(R.id.toast4)


        button1.setOnClickListener(){
            InToast.makeText(this,"This is normal toast",Toast.LENGTH_SHORT)
        }

        button2.setOnClickListener(){
            InToast.makeText(this,"This is color changed toast","#ffffff","#C51162",Toast.LENGTH_SHORT)
        }

        button3.setOnClickListener(){
            InToast.makeText(this,"This is corner radius changed toast ",100f,Toast.LENGTH_SHORT)
        }

        button4.setOnClickListener(){
            InToast.makeText(this,"This is color changed toast with corner radius changed","#ffffff","#C51162",100f,Toast.LENGTH_SHORT)
        }


    }
}