import {Usertype} from './usertype';

export interface IUtente {
  id?: number;
  username?: string;
  password?: string;
  usertype?: Usertype;
}

export class Utente implements IUtente {
  constructor(public id?: number, public username?: string, public password?: string, public usertype?: Usertype) {}
}
