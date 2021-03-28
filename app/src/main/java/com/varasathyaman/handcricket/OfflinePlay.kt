package com.varasathyaman.handcricket
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import androidx.core.view.isVisible

import kotlinx.android.synthetic.main.activity_offline_play.*

class OfflinePlay : AppCompatActivity() {
    var tosser : Int = (0..1).random()
    var scorescomp : Int = 1
    var score : Int = 0
    var turn : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_offline_play)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        replay.visibility = View.INVISIBLE
        replay.isClickable = true
        if (tosser == 1){
            toss.setText("You are batting")
        }

        else{
            toss.setText("You are Bowling")
            rtt.setText("1")
        }
        turn = 0
    }

    fun one(view: View) {
        game_result.setText("")
        youoff.setText("1")
        val compnum : Int = (1..6).random()
        comp.setText(compnum.toString())
        if (compnum == 1){
            if (tosser == 1){
                game_result.setText("Oh.. Oh..")
                if (turn == 0){
                    toss.setText("You are Bowling")
                    game_result.setText("Now You're Bowling")
                    textView5.setText("Computer score")
                    turn =1
                    tosser = 0
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
            else{
                if (turn == 0){
                    toss.setText("You are Batting")
                    game_result.setText("Now You're Batting")
                    textView5.setText("Runs To Take")
                    turn = 1
                    tosser = 1
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
        }
        else{
            if (tosser == 1){
                score += 1
                scoreoff.setText(score.toString())
                if (turn == 1){
                    if (score > scorescomp){
                        gameOver()
                    }
                }
            }
            else{
                scorescomp += compnum
                rtt.setText(scorescomp.toString())

                if (turn == 1){
                    if (scorescomp > score){
                        gameOver()
                    }
                }
            }
        }
    }
    fun two(view: View) {
        youoff.setText("2")
        game_result.setText("")
        val compnum : Int = (1..6).random()
        comp.setText(compnum.toString())
        if (compnum == 2){
            if (tosser == 1){
                game_result.setText("Oh.. Oh..")
                if (turn == 0){
                    toss.setText("You are Bowling")
                    game_result.setText("Now You're Bowling")
                    turn =1
                    tosser = 0
                    textView5.setText("Computer Score")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
            else{
                if (turn == 0){
                    toss.setText("You are Batting")
                    game_result.setText("Now You're Batting")
                    turn = 1
                    tosser = 1
                    textView5.setText("Runs To Take")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
        }
        else{
            if (tosser == 1){
                score += 2
                scoreoff.setText(score.toString())

                if (turn == 1){
                    if (score > scorescomp){
                        gameOver()
                    }
                }
            }
            else{
                scorescomp += compnum
                rtt.setText(scorescomp.toString())

                if (turn == 1){
                    if (scorescomp > score){
                        gameOver()
                    }
                }
            }
        }
    }
    fun three(view: View) {
        youoff.setText("3")
        game_result.setText("")
        val compnum : Int = (1..6).random()
        comp.setText(compnum.toString())
        if (compnum == 3){
            if (tosser == 1){
                game_result.setText("Oh.. Oh..")
                if (turn == 0){
                    toss.setText("You are Bowling")
                    game_result.setText("Now You're Bowling")
                    turn =1
                    tosser = 0
                    textView5.setText("Computer Score")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
            else{
                if (turn == 0){
                    toss.setText("You are Batting")
                    game_result.setText("Now You're Batting")
                    turn = 1
                    tosser = 1
                    textView5.setText("Runs To Take")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
        }
        else{
            if (tosser == 1){
                score += 3
                scoreoff.setText(score.toString())

                if (turn == 1){
                    if (score > scorescomp){
                        gameOver()
                    }
                }
            }
            else{
                scorescomp += compnum
                rtt.setText(scorescomp.toString())
                if (turn == 1){
                    if (scorescomp > score){
                        gameOver()
                    }
                }
            }
        }
    }
    fun four(view: View) {
        youoff.setText("4")
        game_result.setText("")
        val compnum : Int = (1..6).random()
        comp.setText(compnum.toString())
        if (compnum == 4){
            if (tosser == 1){
                game_result.setText("Oh.. Oh..")
                if (turn == 0){
                    toss.setText("You are Bowling")
                    game_result.setText("Now You're Bowling")
                    turn =1
                    tosser = 0
                    textView5.setText("Computer Score")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
            else{
                if (turn == 0){
                    toss.setText("You are Batting")
                    game_result.setText("Now You're Batting")
                    turn = 1
                    tosser = 1
                    textView5.setText("Runs To Take")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
        }
        else{
            if (tosser == 1){
                score += 4
                scoreoff.setText(score.toString())

                if (turn == 1){
                    if (score > scorescomp){
                        gameOver()
                    }
                }
            }
            else{
                scorescomp += compnum
                rtt.setText(scorescomp.toString())
                if (turn == 1){
                    if (scorescomp > score){
                        gameOver()
                    }
                }
            }
        }
    }
    fun five(view: View) {
        youoff.setText("5")
        game_result.setText("")
        val compnum : Int = (1..6).random()
        comp.setText(compnum.toString())
        if (compnum == 5){
            if (tosser == 1){
                game_result.setText("Oh.. Oh..")
                if (turn == 0){
                    toss.setText("You are Bowling")
                    game_result.setText("Now You're Bowling")
                    turn =1
                    tosser = 0
                    textView5.setText("Computer Score")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
            else{
                if (turn == 0){
                    toss.setText("You are Batting")
                    game_result.setText("Now You're Batting")
                    turn = 1
                    tosser = 1
                    textView5.setText("Runs To Take")
                }
                else{

                    game_result.setText("Game Over")
                    gameOver()
                }
            }
        }
        else{
            if (tosser == 1){
                score += 5
                scoreoff.setText(score.toString())

                if (turn == 1){
                    if (score > scorescomp){
                        gameOver()
                    }
                }
            }
            else{
                scorescomp += compnum
                rtt.setText(scorescomp.toString())
                if (turn == 1){
                    if (scorescomp > score){
                        gameOver()
                    }
                }
            }
        }
    }
    fun six(view: View) {
        youoff.setText("6")
        game_result.setText("")
        val compnum : Int = (1..6).random()
        comp.setText(compnum.toString())
        if (compnum == 6){
            if (tosser == 1){
                game_result.setText("Oh.. Oh..")
                if (turn == 0){
                    toss.setText("You are Bowling")
                    game_result.setText("Now You're Bowling")
                    turn =1
                    tosser = 0
                    textView5.setText("Computer Score")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
            else{
                if (turn == 0){
                    toss.setText("You are Batting")
                    game_result.setText("Now You're Batting")
                    turn = 1
                    tosser = 1
                    textView5.setText("Runs To Take")
                }
                else{
                    game_result.setText("Game Over")
                    gameOver()
                }
            }
        }
        else{
            if (tosser == 1){
                score += 6
                scoreoff.setText(score.toString())
                if (turn == 1){
                    if (score > scorescomp){
                        gameOver()
                    }
                }
            }
            else{
                scorescomp += compnum
                rtt.setText(scorescomp.toString())
                if (turn == 1){
                    if (scorescomp > score){
                        gameOver()
                    }
                }
            }
        }
    }
    fun gameOver(){
        button6.isClickable=false
        button5.isClickable=false
        button4.isClickable=false
        button3.isClickable=false
        button2.isClickable=false
        button.isClickable=false
        replay.visibility = View.VISIBLE
        replay.isClickable = true
        if (score > scorescomp-1){
          game_result.setText("You Win")
            turn = 0
        }
        else if (score < scorescomp-1){
            game_result.setText("You Lost")
            turn = 0
        }
        else{
            game_result.setText("Draw")
            turn = 0

        }
    }
    fun replayer(view: View){
        this.recreate()
    }
}