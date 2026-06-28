name := "core-mem-controller"
version := "3.1.1"
scalaVersion := "2.13.12"

addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.6.1" cross CrossVersion.full)

libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.6.1"
