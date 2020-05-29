import { browser, ExpectedConditions as ec, promise } from 'protractor';
import { NavBarPage, SignInPage } from '../../../page-objects/jhi-page-objects';

import { UtenteComponentsPage, UtenteDeleteDialog, UtenteUpdatePage } from './utente.page-object';

const expect = chai.expect;

describe('Utente e2e test', () => {
  let navBarPage: NavBarPage;
  let signInPage: SignInPage;
  let utenteComponentsPage: UtenteComponentsPage;
  let utenteUpdatePage: UtenteUpdatePage;
  let utenteDeleteDialog: UtenteDeleteDialog;

  before(async () => {
    await browser.get('/');
    navBarPage = new NavBarPage();
    signInPage = await navBarPage.getSignInPage();
    await signInPage.autoSignInUsing('admin', 'admin');
    await browser.wait(ec.visibilityOf(navBarPage.entityMenu), 5000);
  });

  it('should load Utentes', async () => {
    await navBarPage.goToEntity('utente');
    utenteComponentsPage = new UtenteComponentsPage();
    await browser.wait(ec.visibilityOf(utenteComponentsPage.title), 5000);
    expect(await utenteComponentsPage.getTitle()).to.eq('gatewayApp.microserviziappUtente.home.title');
    await browser.wait(ec.or(ec.visibilityOf(utenteComponentsPage.entities), ec.visibilityOf(utenteComponentsPage.noResult)), 1000);
  });

  it('should load create Utente page', async () => {
    await utenteComponentsPage.clickOnCreateButton();
    utenteUpdatePage = new UtenteUpdatePage();
    expect(await utenteUpdatePage.getPageTitle()).to.eq('gatewayApp.microserviziappUtente.home.createOrEditLabel');
    await utenteUpdatePage.cancel();
  });

  it('should create and save Utentes', async () => {
    const nbButtonsBeforeCreate = await utenteComponentsPage.countDeleteButtons();

    await utenteComponentsPage.clickOnCreateButton();

    await promise.all([
      utenteUpdatePage.setUsernameInput('username'),
      utenteUpdatePage.setPasswordInput('password'),
      utenteUpdatePage.setUsertypeInput('5'),
    ]);

    expect(await utenteUpdatePage.getUsernameInput()).to.eq('username', 'Expected Username value to be equals to username');
    expect(await utenteUpdatePage.getPasswordInput()).to.eq('password', 'Expected Password value to be equals to password');
    expect(await utenteUpdatePage.getUsertypeInput()).to.eq('5', 'Expected usertype value to be equals to 5');

    await utenteUpdatePage.save();
    expect(await utenteUpdatePage.getSaveButton().isPresent(), 'Expected save button disappear').to.be.false;

    expect(await utenteComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeCreate + 1, 'Expected one more entry in the table');
  });

  it('should delete last Utente', async () => {
    const nbButtonsBeforeDelete = await utenteComponentsPage.countDeleteButtons();
    await utenteComponentsPage.clickOnLastDeleteButton();

    utenteDeleteDialog = new UtenteDeleteDialog();
    expect(await utenteDeleteDialog.getDialogTitle()).to.eq('gatewayApp.microserviziappUtente.delete.question');
    await utenteDeleteDialog.clickOnConfirmButton();

    expect(await utenteComponentsPage.countDeleteButtons()).to.eq(nbButtonsBeforeDelete - 1);
  });

  after(async () => {
    await navBarPage.autoSignOut();
  });
});
