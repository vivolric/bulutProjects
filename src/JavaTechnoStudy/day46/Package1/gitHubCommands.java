package JavaTechnoStudy.day46.Package1;

public class gitHubCommands {
  /*
    cd ../..   --> delete and go back to user
    cd         --> change directory
    ls         --> list (mac)
    dir        --> directory (windows, linux)
    clear      --> delete everything
    git status --> which files has changed or created
    git add *  --> adding the files which you want to commit
                   * (star) is adding all files
                   bu ayrinti muhim albayim, * ile add arasinda bi space var
                   SANIRSAM BU CODE WINDOWS, mac'de denedim commit etmedi
     git add . --> adding the files which you want to commit
                   albayim bu sondaki nokta(.) mac icin, test ettim calisiyor
                    arada bi bosluk birakiyoruz, unutmayalim albayim.
     git commit - m 'your message' --> committing the changes for the
                                      pushing to code to github
      git push      --> pushing the code to github
      add remote --> connecting intellij project with git repo
                     git remote add <ProjectName> <gitURL>
      git remote add <name> <url> --> bura mohim albayim, push etmek icin kullandigimiz code bu
                                      en basit haliyle bi code yazarak intellij e diyoruz ki bak
                                      kodlari push edecegin reponun linki bu.
      SAMPLE: git remote add ProjectGit5 https://github.com/vivolric/ProjectGit5.git
      bunu yazip enter a basiyoruz, ve yine sadece 'git remote' yaziyoruz.
      terminal bize github daki repo nun adini verecek.
      git branch    --> which branches are available
                        diyelim git remote add den push edecegin yeri belirledin,
                        sonra git branch yazarsin ve branch yerini ogrenmis olursun
                        sonraki adim ise push etme kodunu yazmak, line 47deki
      connect local branch to remote branch --> connecting local branch to github branch
      git push --set-upstream <nameOfProject> <nameOfBranch>
      Note: bunu bi kere tanimliyoruz, sonrakilerde sadece git push kodu ile push yapmis oluyoruz
      NOTE: Create a branch and after commit checkout on master.
            Create a remote branch
      git push -u ProjectName LocalBranchName:RemoteBranchName
      mesela
      git push -u ProjectGit5 master:QA
        git branch      --> sadece local branch adini gosterir terminalde
        git branch -a   --> bu kod ise tum branch leri yani intellij deki ve github da olanlari gosterir.
        git branch <nameOfBranch>    --> bu kod ile yeni bir branch olusturuyoruz, mesela "git branch QA"
        git checkout <nameOfBranch>  --> bu kodu da gecis yapmak degistirmek istedigimiz branch icin kullaniyoruz
                                         mesela ana branch master idi, ve yenisine QA dedik ve bunu kullanmak istiyoruz, peki nasil?
                                         iste kodu: git checkout QA

        git merge <yourBranchName --> merging the code from your branch to master branch

        Note: This is merging in the local not in the github.
              After merging in the local need to push to master, then your code will be in the git repo.
              Merge in the github need to use pull request.


        Local Branch to Remote Branch Codes

        git push ProjectGit5 HEAD:RemoteQA  --> use this code to push the upstream branch on the remote

        git push ProjectGit5 HEAD     --> use this code to push to the branch of the same name on the remote


        push, pull ve merge icin biraz daha practice yapmali albayim.
     */
}
