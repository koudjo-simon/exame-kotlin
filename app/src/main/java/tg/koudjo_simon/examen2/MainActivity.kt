package tg.koudjo_simon.examen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var nomPrenomsTxt: TextView
    lateinit var emailTxt: TextView
    lateinit var telTxt: TextView
    lateinit var callImv: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nomPrenomsTxt = findViewById(R.id.m_nom_prenoms_txt)
        emailTxt = findViewById(R.id.m_email_txt)
        telTxt = findViewById(R.id.m_tel_txt)
        callImv = findViewById(R.id.m_call_imv)

        val nom_prenom = intent?.getStringExtra("NOM_PRENOMS")
        nomPrenomsTxt.text = "Nom et Prenoms: $nom_prenom"
        val email = intent?.getStringExtra("EMAIL")
        emailTxt.text = "EMAIL: $email"
        val tel = intent?.getStringExtra("TEL")
        telTxt.text = "Tel: $tel"

        callImv.setOnClickListener {
            Toast.makeText(this, "Appel du noméro $tel", Toast.LENGTH_LONG).show()
        }
    }
}