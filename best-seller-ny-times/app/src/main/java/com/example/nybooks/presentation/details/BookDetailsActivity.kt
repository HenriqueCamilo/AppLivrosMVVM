package com.example.nybooks.presentation.details

import android.content.Context
import android.content.Intent
import android.example.nybooks.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nybooks.presentation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_book_details.*
import kotlinx.android.synthetic.main.include_toolbar.*

class BookDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        setupToolbar(toolbarMain, R.string.books_details_title, true)

        tvDetailsTitle.text = intent.getStringExtra(EXTRA_TITLE)
        tvDetailsDescription.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }

    companion object{
        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"

        fun getStartIntent(context: Context, title: String, description: String): Intent {
            return Intent(context, BookDetailsActivity::class.java).apply{
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_DESCRIPTION, description)
            }
        }
    }
}