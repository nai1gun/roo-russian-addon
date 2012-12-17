roo-russian-addon
=================

Spring roo russian localization add-on. Compatible with roo 1.2

The jar distribution is available at https://github.com/nai1gun/roo-russian-addon-distribution

# Installation instructions

###### Uninstall previous version

roo> addon remove --bundleSymbolicName org.springframework.roo.addon.russian

###### Install 

roo> osgi start --url https://github.com/nai1gun/roo-russian-addon-distribution/raw/master/org.springframework.roo.addon.russian-0.1.0.BUILD-SNAPSHOT.jar

###### Add language to your already created roo project

roo> web mvc install language --code ru