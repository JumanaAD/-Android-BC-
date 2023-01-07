package com.example.jumanaalduhim

    fun main() {
        var firstTask = Task(1, "task1", "note1", true)
        var secondTask = Task(2, "task2", "note2",)
        var thirdTask = Task(3, "task3", "note3", true)
        var frourthTask = Task(4, "task4", "note3", true)
        var mytodo1 = Todo()

        mytodo1.addTask(firstTask)        /// adding tasks
        mytodo1.addTask(secondTask)
        mytodo1.addTask(thirdTask)
        mytodo1.addTask(frourthTask)
        mytodo1.showTasks()
        mytodo1.removeTask(firstTask)
        mytodo1.showTasks()
        mytodo1.changeTask(secondTask)
        mytodo1.showTHIS(2)
        mytodo1.showTHIS(5)








    }

data class Task(var id : Int ,
                var name : String ,
                var note : String,
                var isComplete : Boolean =false )
{

}

class Todo() {
    var myTasks = arrayListOf<Task>()

    fun addTask(task: Task) {       //// adding task
        myTasks.add(task)

    }

    fun showTasks() {          ///printing the task
        println("TASK LIST ↓ ↓ ↓ ")
        for (task in myTasks) {
            println(task)

        }
    }

    fun showTHIS(id: Int) {                //// printing specific task
        for (index in 0 until myTasks.size)
        {
            if (myTasks[index].id == id){
                println("WANTED TASK $id ->  ${myTasks[index]}")
                return
            }
        }
        println("SORRY TASK IS NOT FOUND !! TRY AGAIN")

    }



    fun removeTask(task: Task) {                ///// removing task
        myTasks.remove(task)

    }


    fun changeTask(task: Task) {                 /////// changing task
        println("the (IS COMPLETE) for ${task.name} before change ->: " + task.isComplete)
        task.isComplete = !task.isComplete
        println("the (IS COMPLETE) for ${task.name} after change -> " + task.isComplete)

    }
}










