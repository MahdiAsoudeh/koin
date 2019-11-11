package com.mahdi20.koin.di

import com.mahdi20.koin.HelloRepository
import com.mahdi20.koin.HelloRepositoryImpl
import com.mahdi20.koin.MyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AppModule = module {

    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // MyViewModel ViewModel
    viewModel { MyViewModel(get()) }
}