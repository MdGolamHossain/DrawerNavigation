
// ActivityMain

///  OpenDrawer
         binding.menuBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(binding.drawerlayout.isDrawerOpen(GravityCompat.START)){
                     binding.drawerlayout.closeDrawer(GravityCompat.START);

                 }else{
                     binding.drawerlayout.openDrawer(GravityCompat.START);
                 }
             }
         });