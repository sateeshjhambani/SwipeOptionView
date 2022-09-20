package ae.sateeshjh.swipeoptionview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionView = findViewById<SwipeOptionView>(R.id.actionView)
        actionView.setLeftIcon(AppCompatResources.getDrawable(applicationContext,R.drawable.ic_baseline_cancel_presentation_24))
        actionView.setRightIcon(AppCompatResources.getDrawable(applicationContext,R.drawable.ic_baseline_check_24))

        actionView.setListener(object : SlideOptionListener {
            override fun onSlideLeft() {
                Snackbar.make(actionView, "Cancelled", Snackbar.LENGTH_SHORT).show()
            }

            override fun onSlideRight() {
                Snackbar.make(actionView, "Selected", Snackbar.LENGTH_SHORT).show()
            }
        })
    }
}