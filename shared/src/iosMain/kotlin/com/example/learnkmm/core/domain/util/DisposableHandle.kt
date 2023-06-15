package com.example.learnkmm.core.domain.util

fun interface DisposableHandle: kotlinx.coroutines.DisposableHandle

//This block is replaced by making FUN interface
//fun DisposableHandle(block: () -> Unit): DisposableHandle {
//    return object : DisposableHandle {
//        override fun dispose() {
//            block()
//        }
//    }
//}