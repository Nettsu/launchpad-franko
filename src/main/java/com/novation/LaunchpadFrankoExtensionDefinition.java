package com.novation;
import java.util.UUID;

import com.bitwig.extension.api.PlatformType;
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList;
import com.bitwig.extension.controller.ControllerExtensionDefinition;
import com.bitwig.extension.controller.api.ControllerHost;

public class LaunchpadFrankoExtensionDefinition extends ControllerExtensionDefinition {
   private static final UUID DRIVER_ID = UUID.fromString("70ea6623-4044-42f0-9bab-cd3f8fdd060a");
   
   public LaunchpadFrankoExtensionDefinition() {
   }

   @Override
   public String getName() {
      return "Launchpad Franko";
   }
   
   @Override
   public String getAuthor() {
      return "Netsu";
   }

   @Override
   public String getVersion() {
      return "0.2";
   }

   @Override
   public UUID getId() {
      return DRIVER_ID;
   }
   
   @Override
   public String getHardwareVendor() {
      return "Novation";
   }
   
   @Override
   public String getHardwareModel() {
      return "Launchpad Mini Mk3";
   }

   @Override
   public int getRequiredAPIVersion() {
      return 18;
   }

   @Override
   public int getNumMidiInPorts() {
      return 1;
   }

   @Override
   public int getNumMidiOutPorts() {
      return 1;
   }

   @Override
   public void listAutoDetectionMidiPortNames(final AutoDetectionMidiPortNamesList list, final PlatformType platformType) {
      list.add(new String[]{"Input Launchpad"}, new String[]{"Output Launchpad"});
   }

   @Override
   public LaunchpadFrankoExtension createInstance(final ControllerHost host) {
      return new LaunchpadFrankoExtension(this, host);
   }
}
