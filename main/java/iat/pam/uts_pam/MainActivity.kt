import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import iat.pam.uts_pam.R

class MainActivity : AppCompatActivity() {

    private lateinit var storeSpinner: Spinner
    private lateinit var nameEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Isi Spinner dengan daftar toko (ganti dengan daftar yang sesuai)
        val storeList = listOf("Cihampelas", "Cibiru")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, storeList)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        storeSpinner.adapter = adapter

        // Tambahkan listener untuk tombol "SUBMIT"
        submitButton.setOnClickListener {
            val selectedStore = storeSpinner.selectedItem.toString()
            val enteredName = nameEditText.text.toString()

            // Lakukan sesuatu dengan data yang telah dipilih/diinput
        }
        submitButton.setOnClickListener {
            val selectedStore = storeSpinner.selectedItem.toString()
            val enteredName = nameEditText.text.toString()

            // Menampilkan pesan berdasarkan nilai yang dipilih/diinputkan
            val message = "Anda memilih toko: $selectedStore, Nama: $enteredName"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

    }
}
