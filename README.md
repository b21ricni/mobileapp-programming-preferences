
# Rapport

Först så skrevs kod för att testa hur shared preference fungerar, och variabeln blev linkad till en
text, efter det så skapades en SecondActivity class och en activity_second layout resourace file.
Efter det så lades knappar och text/edit text rutor till som skall användas för att överföra 
information från 2nd activity till mains shared pref. Sedan så lades logcat och clickhandler till 
för att gå från main till 2nd activity  och för att se vad som fungerar och vad som ej fungerar
(Programet krashade och löste det med hjälp av att se vart den sluta fungera), sedan så lades 
clickhandler till för att gå från 2nd activity till main, men skrev fel kod först så istället
för att använda finish så man återgår till main så skapade den nya akiviter, vilket snabbt fixades
Och tillsist så lades till shared pref koden i 2nd activity knappen så när den trycks så skickar den 
information som är skriven i edit text till textView.setText(name). Funkar som smör på bröd!

```
//MainActivity.java
    @Override
        protected void onResume() {
            super.onResume();
    
            String name = preferences.getString("name","No name found");
            textViewName.setText(name);
        }
    
    //SecondActivity.java
    buttonToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name",textViewText.getText().toString());
                editor.apply();
                finish();
            }
        });
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
