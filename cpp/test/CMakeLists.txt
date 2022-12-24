cmake_minimum_required(VERSION 3.8)

project(test LANGUAGES C)

add_executable(${PROJECT_NAME} main.c)
include_directories(${PROJECT_NAME} PUBLIC include/)

