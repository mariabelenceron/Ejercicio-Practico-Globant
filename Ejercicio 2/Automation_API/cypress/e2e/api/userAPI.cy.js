import * as httpResponse from '../../constants/httpResponseCode'

describe('User API Automation', () => {
  describe('when call the API', () => { 
    it('should create a new user (POST)', () => {
      cy.fixture('user').then((userData) => {
        cy.request('POST', '/user', userData).then((response) => {
          console.log(response)
          expect(response.status).to.eq(httpResponse.SUCCESS_200)
          expect(response.body.message).to.eq(String(userData.id))
        })
      })
    })
    
    it('should search a specific user (GET)', () => {
      cy.fixture('user').then((userData) => {
        cy.request('GET',`/user/${userData.username}`).then((response) =>{
          expect(response.status).to.eq(httpResponse.SUCCESS_200)
          expect(response.body).to.deep.eq(userData)
        })
      })
    })

    it('should correctly update user data (PUT)', () => {
      cy.fixture('user').then((userData) => {
        const updatedUser = userData
        updatedUser.firstName = "UpdatedUser"
        updatedUser.firstName = "email"

        cy.request('PUT',`/user/${userData.username}`, updatedUser).then((response) =>{
          expect(response.status).to.eq(httpResponse.SUCCESS_200)
          expect(response.body.message).to.eq(String(userData.id))
        })

        cy.request('GET',`/user/${userData.username}`).then((response) =>{
          expect(response.status).to.eq(httpResponse.SUCCESS_200)
          expect(response.body).to.deep.eq(updatedUser)
        })
      })
    })
  })

  after(() => {
    cy.fixture('user').then((userData) => {
      cy.request('DELETE', `/user/${userData.username}`).then((response) => {
        expect(response.status).to.eq(httpResponse.SUCCESS_200)
        expect(response.body.message).to.eq(userData.username)
      })
    })
  })
})