package tg.koudjo_simon.examen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {

    lateinit var nomPrenomsEdt: EditText
    lateinit var emailEdt: EditText
    lateinit var telEdt: EditText
    lateinit var passwordEdt: EditText
    lateinit var confPasswordEdt: EditText
    lateinit var validerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        nomPrenomsEdt = findViewById(R.id.reg_nom_prenoms_edt)
        emailEdt = findViewById(R.id.reg_email_edt)
        telEdt = findViewById(R.id.reg_telephone_edt)
        passwordEdt = findViewById(R.id.reg_mot_de_passe_edt)
        confPasswordEdt = findViewById(R.id.reg_conf_mot_de_passe_edt)
        validerBtn = findViewById(R.id.reg_valider_btn)


        validerBtn.setOnClickListener {
            val fullName = nomPrenomsEdt.text.toString()
            val email = emailEdt.text.toString()
            val tel = telEdt.text.toString()
            val password = passwordEdt.text.toString()
            val confPassword = confPasswordEdt.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NOM_PRENOMS", fullName)
            intent.putExtra("EMAIL", email)
            intent.putExtra("TEL", tel)
            startActivity(intent)
            finish()
        }
    }
}